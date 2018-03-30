package com.siwoo.projpa.service;

import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.repository.UserRepository;
import com.siwoo.projpa.test.support.TestSupportException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class MockUserService extends UserService {
    private String targetEmail;

    public MockUserService() {
        this.targetEmail = targetEmail;
    }

    public void setTargetEmail(String targetEmail) {
        this.targetEmail = targetEmail;
    }

    @Override @Transactional(propagation = Propagation.REQUIRED)
    protected void upgradeLevel(User user) {
        if(targetEmail.equals(user.getEmail())){
            throw new TestSupportException("Intended Exception");
        }
    }
}
