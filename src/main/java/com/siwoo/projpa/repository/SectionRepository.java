package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import com.siwoo.projpa.domain.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Transactional(readOnly = true)
public interface SectionRepository extends JpaRepository<Section, Long>, CustomSectionRepository {

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_PROJECT = "project";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_DIFFICULTY = "difficulty";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_BASICTIME = "basicTime";


    @Query("select max(s.basicTime.updated), p.name from Section s inner join s.project p group by p")
    List<Object[]> findMaxUpdateTimeAndProjectGroupByProject();

    @Query("select s from Section s where lower(s.project.name) = lower(:projectName)")
    List<Section> findByProjectName(@Param("projectName") String projectName);

    @Query("select distinct s.name from Section s where lower(s.project.name) = lower(:projectName)")
    List<String> findNameByProjectName(@Param("projectName") String projectName);

    @Query("select s from Section s where s.name in :names")
    List<Section> findByNames(@Param("names") List<String> names);


}
