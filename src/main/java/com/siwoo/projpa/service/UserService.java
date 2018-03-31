package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.mail.MailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import static com.siwoo.projpa.domain.User.Level;

@Getter @Setter
@Service @Transactional
public class UserService {

    public static final int MIN_UPGRADE_LOGIN = 50;
    public static final int MIN_UPGRADE_RECOMMEND = 30;

    @Autowired
    UserRepository userRepository;
    @Autowired
    DataSource dataSource;
    @Autowired
    MailService mailService;

    @Transactional (rollbackFor = Exception.class)
    public void upgradeLevels() {
        List<User> users = userRepository.findAll();
        for (User user : users) {
            if (upgradable(user)) {
                upgradeLevel(user);
            }
        }
    }

    protected void upgradeLevel(User user) {
        user.upgradeLevel();
        userRepository.save(user);
        mailService.send(upgradeMail(user));
    }

    //Need to change the toEmail
    private MailMessage upgradeMail(User user) {
        return mailService.createMailMessage(
                "sm123tt.developer@gmail.com",
                "Upgrade Notice",
                "Your Level is upgraded to *" + user.getLevel() + "* ");
    }

    private boolean upgradable(User user) {
        Level current = user.getLevel();
        switch (current) {
            case BRONZE: return user.getLogin() >= MIN_UPGRADE_LOGIN;
            case SILVER: return user.getLogin() >= MIN_UPGRADE_RECOMMEND;
            case GOLD: return false;
            default: return false;
        }
    }
}
