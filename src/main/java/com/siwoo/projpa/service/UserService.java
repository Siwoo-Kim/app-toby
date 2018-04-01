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

public interface UserService {

    public static final int MIN_UPGRADE_LOGIN = 50;
    public static final int MIN_UPGRADE_RECOMMEND = 30;

    @Transactional(rollbackFor = Exception.class)
    void upgradeLevels();
}
