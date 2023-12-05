package com.dg.tbs.ts.entity;

public class ShowInfo {
    public static enum ShowTime{
        SHOW_1, SHOW_2, SHOW_3, SHOW_4, SHOW_5, SHOW_6
    }

    private ShowTime showTime;
    private long movieId;
    private String movieTitle;

}

