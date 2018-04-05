package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.net.URL;

@Getter @Setter
@Entity
public class WebPage {

    @Id
    private String name;

    @OneToOne
    private User user;

    private String description;

    private URL url;

}
