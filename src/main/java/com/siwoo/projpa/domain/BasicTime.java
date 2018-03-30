package com.siwoo.projpa.domain;

import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

@Embeddable @ToString
public class BasicTime implements Serializable {

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


}
