package com.arrow.interview.entity;

import javax.persistence.*;

/**
 * Created by cmanon on 7/14/16.
 */
@Entity
@Table(name = "races")
public class Race {

    @Id
    @GeneratedValue
    private long id;

    private String name;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

//    public Race(long id, String name, List<Location> location) {
//        this.id = id;
//        this.name = name;
//        this.location = new ArrayList<Location>(location);
//    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocations(Location location) {
        this.location = location;
    }
}
