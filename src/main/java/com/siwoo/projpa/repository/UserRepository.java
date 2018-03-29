package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository{

}
