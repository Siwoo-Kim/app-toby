package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Project;
import com.siwoo.projpa.domain.ProjectSummary;
import com.siwoo.projpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ProjectRepository extends JpaRepository<Project, Long>, CustomProjectRepository {

    public static final String COLUMN_ID = "id";

    @Query("select p from Project p where upper(p.name) = upper(:name) ")
    Project findByName(@Param("name") String name);

    @Query("select p.id, count(u) from User u left join u.projects p group by p")
    List<Object[]> findIdAndManagerCount();

    @Query("select new com.siwoo.projpa.domain.ProjectSummary(p.name, p.type) from Project p ")
    List<ProjectSummary> findSummaryAll();

    @Query("select p from Project p where p.type in (:types)")
    List<Project> findByTypes(Project.Type... types);

    @Query("select count(s) from Section s where s.project.id = :id")
    long countSection(@Param("id") long id);

}
