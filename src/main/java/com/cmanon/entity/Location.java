package com.cmanon.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by cmanon on 7/14/16.
 */
@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue
    private final Long id;
    private final Long latitude;
    private final Long longitude;
    private final String name;

    public Location(long id, long latitude, long longitude, String name) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public long getLatitude() {
        return latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public String getName() {
        return name;
    }
}
