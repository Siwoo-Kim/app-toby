package com.siwoo.projpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter @Setter @ToString
@EqualsAndHashCode(of={"first","middle","last"})
public class Name implements Serializable{

    private String first;
    private String middle;
    private String last;

    public Name(String first, String last, String middle ) {
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    protected Name() {}

}
