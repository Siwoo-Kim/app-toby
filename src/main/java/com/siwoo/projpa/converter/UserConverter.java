package com.siwoo.projpa.converter;

import com.siwoo.projpa.converter.support.UserConversionException;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.regex.Pattern;

@Service
public class UserConverter implements Converter<String, User> {

    @Autowired UserRepository userRepository;

    @Override
    public User convert(String email) {
        Assert.hasText(email, "value must not empty string");
        System.out.println(email);
        System.out.println(Pattern.matches("^[a-zA-Z0-9]+@[a-z]+.(com|net|ca)$",email));
        if(Pattern.matches("^[a-zA-Z0-9]+@[a-z]+.(com|net|ca)$",email)) {
            return userRepository.findByEmail(email);
        }
        throw new UserConversionException("cannot convert to User with String: "+ email);
    }
}
