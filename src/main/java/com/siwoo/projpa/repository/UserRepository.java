package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>, CustomUserRepository{

    @Query("select distinct u from User u left join fetch u.projects where u.id = :id ")
    User findFetchAllById(@Param("id") long id);

    @Query("select distinct u from User u left join fetch u.projects")
    List<User> findFetchAll();

    @Query("select distinct u from User u left join fetch u.projects where u.email = :email ")
    User findByEmail(@Param("email") String email);

    @Query("select u from User u where u.name.last = :lastName")
    List<User> findByNameLast(@Param("lastName") String lastName);

    @Query("select distinct u from User u inner join u.projects p where p.name = :name")
    List<User> findByProjectName(@Param("name") String name);

    @Query("select u from User u where u.projects is empty")
    List<User> findByProjectsIsEmpty();

    @Query("select u from User u where u.projects is not empty")
    List<User> findByProjectsIsNotEmpty();

    @Query("select u.id , size(u.projects) from User u group by u.id")
    List<Object[]> findProjectsCount();

    @Query("select distinct u from User u inner join u.projects p where p.id = :id")
    List<User> findByProjectId(@Param("id") long projectId);
}
