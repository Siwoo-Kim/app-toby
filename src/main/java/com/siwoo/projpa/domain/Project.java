package com.siwoo.projpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@NamedQueries({
        @NamedQuery(name="PROJECT.BY_NAME",
        query = "select p from Project p where upper(p.name) = upper(:name) "),
        @NamedQuery(name="PROJECT.BY_NAME_IN",
        query = "select p from Project p where upper(p.name) in (:names) ")
})
@Getter @Setter @ToString
@Entity @Table(name="tbl_project")
@EqualsAndHashCode(of={"id","name"})
public class Project {

    public static final String NAMED_PROJECT_BY_NAME = "PROJECT.BY_NAME";
    public static final String NAMED_PROJECT_BY_NAME_IN = "PROJECT.BY_NAME_IN";


    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    public enum Type {
        BACKEND, FRONTEND, ETC;
    }

    @Enumerated(EnumType.STRING)
    private Type type;

    @Lob
    private String description;

    @Embedded
    private BasicTime basicTime;

    private LocalDateTime lastUpdatedSection;

    private String icon;

    private URL url;


}
