package com.siwoo.projpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static javax.persistence.GenerationType.IDENTITY;

@Entity @Table(name="tbl_document")
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

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @Embedded
    private BasicTime basicTime;

    private int hit = 0;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(
            name="document_resource",
            joinColumns = @JoinColumn(name = "document_id"))
    @MapKeyColumn(name = "name")
    @Column(name = "url" )
    private Map<String,URL> resources = new HashMap<>();

    public void ifNullSetDefault() {
        if(this.basicTime == null || this.basicTime.getCreated() == null) {
            this.basicTime = new BasicTime(LocalDateTime.now(),null);
        }
    }

    public void updateTime(LocalDateTime updated) {
        if(this.basicTime == null) {
            basicTime = new BasicTime(updated, updated);
        } else if (this.basicTime.getCreated() == null) {
            basicTime = new BasicTime(updated, updated);
        } else {
            basicTime = new BasicTime(this.getBasicTime().getCreated(), updated);
        }
    }
}
