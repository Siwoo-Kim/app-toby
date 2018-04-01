package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailMessage;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

@Getter @Setter
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    DataSource dataSource;
    @Autowired
    MailService mailService;

    @Override
    @Transactional(rollbackFor = Exception.class)
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
        User.Level current = user.getLevel();
        switch (current) {
            case BRONZE: return user.getLogin() >= MIN_UPGRADE_LOGIN;
            case SILVER: return user.getLogin() >= MIN_UPGRADE_RECOMMEND;
            case GOLD: return false;
            default: return false;
        }
    }

}
