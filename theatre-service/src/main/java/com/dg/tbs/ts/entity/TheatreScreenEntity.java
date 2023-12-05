package com.dg.tbs.ts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity(name = "theatre_screen")
public class TheatreScreenEntity {

   @Id
   @GeneratedValue
   private int screenId;
   private String screen;
   @ManyToOne
   private TheatreEntity theatre;
   //private Set<ShowInfo> shows;

}
