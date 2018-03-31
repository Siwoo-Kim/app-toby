package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project, Long>, CustomProjectRepository {


    @Query("select p from Project p where upper(p.name) = upper(:name) ")
    Project findByName(@Param("name") String name);
}
