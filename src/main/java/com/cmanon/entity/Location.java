package com.cmanon.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 * Created by cmanon on 7/14/16.
 */
@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private double latitude;
    private double longitude;
    private String user;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();

    public void setId(long id) {
        this.id = id;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public void setUser(String name) {
        this.user = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getUser() {
        return user;
    }

    public Date getDate() {
        return date;
    }
}
