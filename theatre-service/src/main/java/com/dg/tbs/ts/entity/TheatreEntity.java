package com.dg.tbs.ts.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "theatre")
@Data
public class TheatreEntity {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String area;
    private String city;
    private String state;
    private String country;
    @OneToMany
    private Set<TheatreScreenEntity> screens;

}
