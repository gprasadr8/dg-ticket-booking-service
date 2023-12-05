package com.distinctgeeks.bmt.ms.model;

import lombok.Data;
import org.springframework.lang.NonNull;

import java.time.LocalDate;
import java.util.List;

@Data
public class NewMovieRequest {

    @NonNull
    private String title;
    @NonNull
    private String description;
    @NonNull
    private int durationInMinutes;
    @NonNull
    private List<String> languages;
    @NonNull
    private LocalDate releaseDate;
    @NonNull
    private List<String> genre;
    @NonNull
    private List<String> format;
    @NonNull
    private String censorRating;
}
