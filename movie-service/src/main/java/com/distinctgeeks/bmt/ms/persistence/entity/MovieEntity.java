package com.distinctgeeks.bmt.ms.persistence.entity;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import com.distinctgeeks.bmt.ms.enums.Genre;
import com.distinctgeeks.bmt.ms.enums.MovieLagnuage;
import com.distinctgeeks.bmt.ms.enums.MovieFormat;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "movie_info")
@Setter
@Getter
public class MovieEntity {
	
	@Id
	private String movieId;
	private String title;
	private String description;
	private int duration;
	@ElementCollection(targetClass = MovieLagnuage.class)
	@Enumerated(EnumType.STRING)
	private List<MovieLagnuage> languages;

	private LocalDate releaseDate;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<Genre> genre;
	@ElementCollection
	@Enumerated(EnumType.STRING)
	private List<MovieFormat> format;
	private String censorRating;

}
