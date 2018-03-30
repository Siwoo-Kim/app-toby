package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository{

    @Query("select distinct u from User u left join fetch u.projects where u.id = :id ")
    User findUserFetchAllById(@Param("id") long id);
}
