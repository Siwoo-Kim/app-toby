package com.siwoo.projpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter @ToString
@Entity
@EqualsAndHashCode(of={"id","name"})
public class Project {

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
