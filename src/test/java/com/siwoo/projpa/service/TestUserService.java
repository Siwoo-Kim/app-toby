package com.siwoo.projpa.service;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.UserRepository;
import com.siwoo.projpa.test.support.TestSupportException;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static com.siwoo.projpa.FixtureFactory.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserService {

    @Autowired UserService userService;
    @Autowired UserRepository userRepository;
    @Autowired DataSource dataSource;
    private List<User> users;


    @Before
    public void setup() {
        assertNotNull(getName(userService) + " must not null", userService);
        assertNotNull( getName(dataSource) + " must not null", dataSource);
        users = FixtureFactory.users();
        userRepository.saveAll(users);
    }



    @Test
    public void upgradeOrNothing() {
        User user = users.get(3);
        user.setLevel(User.Level.BRONZE);
        user.setLogin(UserService.MIN_UPGRADE_LOGIN);
        userRepository.save(user);

        MockUserService userService = new MockUserService();
        userService.setUserRepository(userRepository);
        userService.setTargetEmail(users.get(3).getEmail());
        user = users.get(0);
        user.setLevel(User.Level.BRONZE);
        user.setLogin(UserService.MIN_UPGRADE_LOGIN);
        userRepository.save(user);

        try {
            userService.upgradeLevels();
            fail();
        } catch (TestSupportException e) {
            /*  ignore  */
        }

        checkUpgrade(users.get(0), false);
    }

    @Test
    public void upgradeLevels() {
        List<Integer> targetIndex = new ArrayList<>();
        targetIndex.add(1);
        targetIndex.add(3);

        for(int i=0; i<users.size(); i++) {
            if(targetIndex.contains(i)) {
                switch (i) {
                    case 1: {
                        User user = users.get(i);
                        user.setLogin(UserService.MIN_UPGRADE_LOGIN);
                        user.setLevel(User.Level.BRONZE);
                        user.setRecommend(0);
                        userRepository.save(user);
                        break;
                    }
                    case 3: {
                        User user = users.get(i);
                        user.setLogin(UserService.MIN_UPGRADE_LOGIN + 1);
                        user.setLevel(User.Level.SILVER);
                        user.setRecommend(UserService.MIN_UPGRADE_RECOMMEND);
                        userRepository.save(user);
                        break;
                    }
                }
            }
        }
        userService.upgradeLevels();

        for (Integer aTargetIndex : targetIndex) {
            checkUpgrade(users.get(aTargetIndex));
        }
    }

    private void checkUpgrade(User user, boolean upgrade) {
        if(upgrade) {
            checkUpgrade(user);
        } else {
            log.info(user.toString());
            User found = userRepository.findById(user.getId()).get();
            log.info(found.toString());
            assertEquals(user.getLevel(), found.getLevel());
        }
    }

    private void checkUpgrade(User user) {
        User found = userRepository.findById(user.getId()).get();
        log.info(found.toString());
        assertTrue(found.getLevel() == user.getLevel().getNextLevel());
    }
}
