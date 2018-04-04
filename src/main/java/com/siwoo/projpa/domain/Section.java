package com.siwoo.projpa.domain;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Max;

import java.net.URL;

import static javax.persistence.GenerationType.IDENTITY;

@Getter @Setter @ToString
@Entity
@EqualsAndHashCode(of={"id","name","project"})
public class Section {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String name;

    @Max(value = 5)
    private int difficulty;

    private String description;

    @Embedded
    private BasicTime basicTime;

    @ManyToOne
    @JoinColumn(name = "project_id")
    Project project;

}
