package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface DocumentRepository extends JpaRepository<Document, Long>, CustomDocumentRepository {

    @Query("select key(r), value(r) from Document d inner join d.resources r")
    Map<String,URL> findResources();

    @Query("select key(r), value(r) from Document d inner join d.resources r " +
            "where d.id = :id ")
    Map<String,URL> findResourcesById(@Param("id") long id);

    @Query("select key(r), value(r) from Document d inner join d.resources r " +
            "where key(r) in (:keys)")
    Map<String,URL> findResourcesByResourcesKey(@Param("keys") List<String> keys);


    @Query("select d from Document d where d.hit > :hit")
    List<Document> findByHitGreaterThan(@Param("hit") int hit);

    @Query("select d from Document d where d.hit = :hit")
    List<Document> findByHitEquals(@Param("hit") int hit);

    @Query("select d from Document d where d.basicTime.created between :fromDate and :toDate")
    List<Document> findByCreatedBetween(@Param("fromDate")LocalDateTime from, @Param("toDate") LocalDateTime to);

    @Query("select d from Document d where lower(d.title) like concat('%',lower(:title),'%') ")
    List<Document> findByTitleContains(@Param("title") String title);

    @Query("select d from Document d where d.hit = (select max(d2.hit) from Document d2)")
    Document findTopByHit();

    @Query("select d from Document d where d.section.name = :sectionName")
    List<Document> findBySectionName(@Param("sectionName") String sectionName);

    @Query("select d from Document d where d.title in (:names) ")
    List<Document> findByTitles(@Param("names") String... names);

    @Query("select distinct d from Document d inner join d.section s where s.name IN (:sectionNames)")
    List<Document> findBySectionNames(@Param("sectionNames") String... names);

    @Query("select d from Document d where d.section.project.name = :projectName ")
    List<Document> findByProjectName(@Param("projectName") String projectName);

    @Query("select d.title from Document d where d.section.project.name = :projectName ")
    List<String> findTitleByProjectName(@Param("projectName") String projectName);


    @Query("select d.title from Document d where d.section.name = :sectionName")
    String[] findTitleBySectionName(@Param("sectionName") String sectionName);

}
