package com.engSoft.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Semester {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    public Semester() {}

    public Semester(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
