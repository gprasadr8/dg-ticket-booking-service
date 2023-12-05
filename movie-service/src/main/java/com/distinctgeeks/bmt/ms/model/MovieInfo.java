package com.distinctgeeks.bmt.ms.model;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.distinctgeeks.bmt.ms.enums.Genre;
import com.distinctgeeks.bmt.ms.enums.MovieLagnuage;
import com.distinctgeeks.bmt.ms.enums.MovieFormat;

import lombok.Data;

@Data
public class MovieInfo {
	
	private String movieId;
	private String title;
	private String description;
	private String duration;
	private List<String> languages;
	private LocalDate releaseDate;
	private List<String> genre;
	private List<String> format;
	private String censorRating;

}
