package com.siwoo.projpa.domain;

import lombok.*;
import javax.persistence.*;

import java.net.URL;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter @ToString
@Entity
public class Section {

    @Id @GeneratedValue(strategy = IDENTITY)
    private String id;

    private String name;

    private String description;

    @Embedded
    private BasicTime basicTime;

    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project;

}
