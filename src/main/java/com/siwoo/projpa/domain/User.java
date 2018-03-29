package com.siwoo.projpa.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

/*  to turn PoJo to entity annotate the class with @Entity    */
@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of={"id","email","name"})
public class User {
    /*  mapping identifier to property using id annotation  */
    @Id @GeneratedValue(strategy = IDENTITY)
    private long id;
    private String name;
    private String email;
    private String password;
    private LocalDate joinDate;
    private double point;


    public boolean raisePoint(double raise) {
        if(raise > 0) {
            this.point += raise;
            return true;
        } else {
            return false;
        }
    }
}
