package com.siwoo.projpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Getter @Setter
public class Journal {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Date created;
    private String summary;

    @Transient @JsonIgnore
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    protected Journal() { }

    public Journal(String title, String created, String summary) throws ParseException {
        this.title = title;
        this.created = format.parse(created);
        this.summary = summary;
    }

    public String createdToString() {
        return format.format(created);
    }


    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Journal(");
        stringBuilder.append("id: ");
        stringBuilder.append(id + ", ");
        stringBuilder.append("title: ");
        stringBuilder.append(title + ", ");
        stringBuilder.append("created: ");
        stringBuilder.append(createdToString() + ", ");
        stringBuilder.append("summary: ");
        stringBuilder.append(summary + ")");
        return stringBuilder.toString();
    }

}
