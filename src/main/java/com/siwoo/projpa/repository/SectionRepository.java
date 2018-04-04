package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface SectionRepository extends JpaRepository<Section, Long> {

    @Query("select max(s.basicTime.updated), p.name from Section s inner join s.project p group by p")
    List<Object[]> findMaxUpdateTimeAndProjectGroupByProject();

    @Query("select s from Section s where lower(s.project.name) = lower(:projectName)")
    List<Section> findByProjectName(@Param("projectName") String projectName);

    @Query("select distinct s.name from Section s where lower(s.project.name) = lower(:projectName)")
    List<String> findNameByProjectName(@Param("projectName") String projectName);


}
