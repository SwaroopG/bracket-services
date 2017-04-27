package com.sabha.bracket.entity;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Entity object for 'sports' table.
 *
 * @author Swaroop Gaddameedhi
 */
@Entity
@Table(name = "sports")
public class Sport implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "sport_id")
    private long sportId;

    @Column(name = "name")
    private String name;

    Sport() {
    }

    public Sport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getSportId() {
        return sportId;
    }

    @Override
    public String toString() {
        return String.format("Sport[id=%d name=%s]", sportId, name);
    }
}