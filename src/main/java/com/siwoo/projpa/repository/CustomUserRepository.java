package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional(readOnly = true)
public interface CustomUserRepository {
    @Transactional(readOnly = false)
    User create(User user);

    Optional<User> get(long id);

    List<User> getByPointGreaterThan(double point);

    @Transactional(readOnly = false)
    boolean remove(User user);

    @Transactional(readOnly = false)
    boolean raisePoint(long id, double raise);
}
