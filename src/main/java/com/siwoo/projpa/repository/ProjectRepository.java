package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project, Long>, CustomProjectRepository {


}
