package com.siwoo.projpa.repository;

import com.siwoo.projpa.FixtureFactory;
import com.siwoo.projpa.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;
import static com.siwoo.projpa.FixtureFactory.*;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestUserRepository {

    @Autowired UserRepository userRepository;
    private List<User> users;

    @Before
    public void setup() {
        assertNotNull(getName(userRepository)+" must not null" ,userRepository);
        users = FixtureFactory.users();

        for(User user : users) {
            userRepository.create(user);
        }
    }

    @Test
    public void find() {
        Optional<User> found = userRepository.get(users.get(0).getId());
        assertTrue(getName(found)+" must not null",found.isPresent());
        log.info(found.get().toString());
    }

    @Test
    public void delete() {
        User user = userRepository.get(users.get(0).getId()).get();
        assertTrue( userRepository.remove(user) );
        user = new User();
        user.setId(99999);
        assertFalse( userRepository.remove(user) );
    }

    @Test
    public void getByPointGreaterThan() {
        List<User> target = new ArrayList<>();
        double targetPoint = 50;
        users.stream().forEach(user -> {
            if(user.getName().contains("1") || user.getName().contains("3")  ){
                user.setPoint(targetPoint);
                userRepository.save(user);
                target.add(user);
            }
        });


        List<User> found = userRepository.getByPointGreaterThan(targetPoint-1);
        found.stream().forEach(user -> {
            assertTrue( target.contains(user) );
        });
        log.info(users.toString());
    }

    @Test
    public void raisePoint() {
        User user = userRepository.get(users.get(0).getId()).get();
        double prePoint = user.getPoint();
        double raise = 50.0;
        assertTrue( userRepository.raisePoint(user.getId(), raise) );
        user = userRepository.get(users.get(0).getId()).get();
        assertEquals( getName(userRepository) + " must raise point", user.getPoint() , prePoint + raise , 0.001);

        assertFalse( userRepository.raisePoint(user.getId(), -raise) );
        user = userRepository.get(users.get(0).getId()).get();
        assertEquals( getName(userRepository) + " must not substract point", user.getPoint() , prePoint + raise ,0.001 );

    }
}
