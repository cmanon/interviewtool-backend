package com.arrow.interview.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    private String firstname;
    private String username;
}
