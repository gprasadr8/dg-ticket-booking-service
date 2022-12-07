package com.dg.tbs.ts.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class CityInfo {

    @Id
    private long id;

    private String name;

}
