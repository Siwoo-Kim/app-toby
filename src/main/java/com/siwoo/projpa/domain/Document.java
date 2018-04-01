package com.siwoo.projpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.net.URL;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of ={"id","title","subtitle"})
public class Document {

    @Id @GeneratedValue(strategy = IDENTITY)
    private Long id;

    private String title;

    @Column(name = "sub_title")
    private String subtitle;

    @Column(length = 400)
    private String description;

    @Lob
    private String content;



    @ElementCollection
    @CollectionTable(
            name="document_resource",
            joinColumns = @JoinColumn(name = "document_id"))
    @MapKeyColumn(name = "name")
    @Column(name = "url" )
    private Map<String,URL> resources = new HashMap<>();

}
