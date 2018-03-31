package com.siwoo.projpa.domain;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Document {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String title;

    @Column(name = "sub_title")
    private String subtitle;

    private String description;

    @Lob
    private String content;

}
