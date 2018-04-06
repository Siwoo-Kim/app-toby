package com.siwoo.projpa.repository;

import com.siwoo.projpa.domain.Name;
import com.siwoo.projpa.domain.User;
import com.siwoo.projpa.domain.WebPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.net.URL;
import java.util.List;

public interface WebPageRepository extends JpaRepository<WebPage, String>, CustomWebPageRepository {

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_IMGNAMES = "imgNames";
    public static final String COLUMN_AUTHOR = "author";
    public static final String COLUMN_DESCRIPTION = "description";
    public static final String COLUMN_URL = "url";
    public static final String COLUMN_ISPUBLIC = "isPublic";

    @Query("select w from WebPage w where upper(w.name) = upper(:name)")
    WebPage findByName(@Param("name") String name);

    @Query("select w.author from WebPage w where w.name = :name")
    User findAuthor(@Param("name") String name);

    @Query("select w.author.name from WebPage  w where w.name = :name")
    Name findAuthorName(@Param("name") String name);

    @Query("select w from WebPage w where w.name in (:names)")
    List<WebPage> findByNames(@Param("names") String... names);

    @Query("select w from WebPage w where w.url in (:urls)")
    List<WebPage> findByUrls(@Param("urls") URL... urls);

    @Query("select i from WebPage w join w.imgNames i where w.name = :name")
    List<String> findImgNamesByName(@Param("name") String name);

    @Query("select w.isPublic from WebPage w where w.name = :name")
    Boolean findIsPublicByName(@Param("name") String name);

    @Query("select count(w) from WebPage w")
    long countWebPage();

    @Query("select count(w) from WebPage w where w.isPublic = :isPublic")
    long countByIsPublic(@Param("isPublic") boolean isPublic );

    List<WebPage> findByAuthor(User user);

}
