package com.siwoo.projpa;

import com.siwoo.projpa.domain.User;

import java.util.ArrayList;
import java.util.List;

public class FixtureFactory {

    public static String getName(Object object) {
        return object.getClass().getSimpleName();
    }
    
    public static List<User> users() {
        List<User> fixtures = new ArrayList<>();
        User user = new User();
        user.setEmail("user1@email.com");
        user.setName("user1");
        user.setPassword("passuser1");
        user.setPoint(10);
        fixtures.add(user);

        user = new User();
        user.setEmail("user2@email.com");
        user.setName("user2");
        user.setPassword("passuser2");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user3@email.com");
        user.setName("user3");
        user.setPassword("passuser3");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user4@email.com");
        user.setName("user4");
        user.setPassword("passuser4");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user5@email.com");
        user.setName("user5");
        user.setPassword("passuser5");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user6@email.com");
        user.setName("user6");
        user.setPassword("passuser6");
        user.setPoint(10);
        fixtures.add(user);
        user = new User();
        user.setEmail("user7@email.com");
        user.setName("user7");
        user.setPassword("passuser7");
        user.setPoint(10);
        return fixtures;
    }
}
