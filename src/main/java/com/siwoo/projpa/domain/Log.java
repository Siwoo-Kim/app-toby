package com.siwoo.projpa.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter @Setter @ToString
@Entity
public class Log {

    @Id @GeneratedValue
    private Long id;

    private LocalDateTime actionDate;

    private String action;

    public Log() {}

    public Log(LocalDateTime actionDate, String action) {
        this.actionDate = actionDate;
        this.action = action;
    }

}
