package com.dg.tbs.ts.entity;

import lombok.Data;

import javax.persistence.Id;

@Data
public class AreaInfo {

    @Id
    private long id;
    private long cityId;
    private String name;
}
