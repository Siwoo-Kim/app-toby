package com.siwoo.projpa.domain;

import com.siwoo.projpa.domain.support.converter.BooleanToYNConverter;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.core.annotation.Order;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Getter @Setter @ToString
@Entity
@EqualsAndHashCode(of = {"name","url"})
@NamedQueries(
        @NamedQuery(name = "WEBPAGE.UPDATE_AUTHOR",
        query = "update WebPage e set e.author = :author where e.name = :name"))
public class WebPage {

    public static final String NAMEDSQL_WEBPAGE_UPDATE_AUTHOR = "WEBPAGE.UPDATE_AUTHOR";

    @Id
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "tbl_webpage_img",
    joinColumns = @JoinColumn(name = "webpage_name"))
    @OrderColumn(name = "img_idx")
    private List<String> imgNames = new ArrayList<>();

    @OneToOne
    private User author;

    private String phrase;
    private String phrasemaker;

    private String description;

    @Convert(converter =  BooleanToYNConverter.class)
    private boolean isPublic = false;

    private URL url;

    public boolean addImageName(String imgName) {
        if(!imgNames.contains(imgName)){
            this.imgNames.add(imgName);
            return true;
        }
        return false;
    }

}
