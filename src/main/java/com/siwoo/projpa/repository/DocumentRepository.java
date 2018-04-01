package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.net.URL;
import java.util.List;
import java.util.Map;

public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query("select key(r), value(r) from Document d inner join d.resources r")
    Map<String,URL> findResources();

    @Query("select key(r), value(r) from Document d inner join d.resources r " +
            "where d.id = :id ")
    Map<String,URL> findResourcesById(@Param("id") long id);

    @Query("select key(r), value(r) from Document d inner join d.resources r " +
            "where key(r) in (:keys)")
    Map<String,URL> findResourcesByResourcesKey(@Param("keys") List<String> keys);
}
