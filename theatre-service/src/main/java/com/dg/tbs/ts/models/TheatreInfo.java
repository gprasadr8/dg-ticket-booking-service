package com.dg.tbs.ts.models;

import lombok.Data;

import java.util.List;

@Data
public class TheatreInfo {

    private long id;
    private String name;
    private String area;
    private String city;
    private String state;
    private String country;
}
