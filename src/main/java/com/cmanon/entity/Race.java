package com.cmanon.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by cmanon on 7/14/16.
 */
@Entity
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue
    private final long id;

    private final String name;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "location_id")
    private final List<Location> location;

    public Race(long id, String name, List<Location> location) {
        this.id = id;
        this.name = name;
        this.location = new ArrayList<Location>(location);
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Location> getLocation() {
        return location;
    }
}
