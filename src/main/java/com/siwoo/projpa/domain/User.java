package com.siwoo.projpa.domain;

import com.siwoo.projpa.domain.support.NotExistingLevelException;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static javax.persistence.GenerationType.IDENTITY;

/*  to turn PoJo to entity annotate the class with @Entity    */
@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of={"id","email","name"})
@Access(AccessType.FIELD)
public class User {
    /*  mapping identifier to property using id annotation  */
    @Id @GeneratedValue(strategy = IDENTITY)
    private long id;
    private Name name;
    private String email;
    private String password;
    private LocalDate joinDate;
    private int login;
    private int recommend;
    @Enumerated(EnumType.STRING)
    private Level level;
    private double point;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "USER_PROJECT",
    joinColumns = @JoinColumn(name="manager_id"),
    inverseJoinColumns = @JoinColumn(name="project_id"))
    Set<Project> projects = new HashSet();

    public boolean upgradeLevel() {
        Level nextLevel = level.getNextLevel();
        if(nextLevel != null) {
            this.level = nextLevel;
            return true;
        } else {
            return false;
        }
    }

    public boolean addProject(Project project) {
        return projects.add(project);
    }

    public enum Level {
        GOLD(3,null,10), SILVER(2,GOLD,5), BRONZE(1,SILVER,0);
        private int value;
        private Level nextLevel;
        private int plusPoint;
        Level(int value, Level nextLevel, int plusPoint) {
            this.value = value;
            this.nextLevel = nextLevel;
            this.plusPoint = plusPoint;
        }

        public int getValue() {
            return value;
        }

        public Level getNextLevel() {
            return nextLevel;
        }

        public int getPlusPoint() {
            return plusPoint;
        }
        public Level valueOf(int value) {
            switch (value) {
                case 1: return BRONZE;
                case 2: return SILVER;
                case 3: return GOLD;
                default: throw new NotExistingLevelException("Level[value:" + value + "] unknown value");
            }
        }
    }

    public boolean raisePoint(double raise) {
        if(raise > 0) {
            this.point += raise;
            return true;
        } else {
            return false;
        }
    }
}
