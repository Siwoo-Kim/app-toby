package com.siwoo.projpa.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.ToString;

import javax.persistence.Embeddable;
import javax.persistence.Transient;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Embeddable @ToString
public class BasicTime implements Serializable {

    @Transient @JsonIgnore
    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE_TIME;

    private LocalDateTime created;
    private LocalDateTime updated;

    public BasicTime() {}

    public BasicTime(LocalDateTime created, LocalDateTime updated) {
        this.created = created;
        this.updated = updated;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }


    public BasicTime update(LocalDateTime updated) {
        BasicTime basicTime = new BasicTime();
        basicTime.setCreated(this.created);
        basicTime.setUpdated(updated);
        return basicTime;
    }

    protected void setCreated(LocalDateTime created) {
        this.created = created;
    }

    protected void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    @Override
    public String toString() {
        return "BasicTime{" +
                "created=" + dateTimeFormatter.format(created) +
                ", updated=" + dateTimeFormatter.format(updated) +
                '}';
    }
}
