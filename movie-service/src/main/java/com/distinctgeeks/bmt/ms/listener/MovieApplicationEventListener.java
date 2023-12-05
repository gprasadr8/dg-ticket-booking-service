package com.distinctgeeks.bmt.ms.listener;


import com.distinctgeeks.bmt.ms.enums.Genre;
import com.distinctgeeks.bmt.ms.enums.MovieFormat;
import com.distinctgeeks.bmt.ms.enums.MovieLagnuage;
import com.distinctgeeks.bmt.ms.persistence.entity.MovieEntity;
import com.distinctgeeks.bmt.ms.persistence.repository.MovieRepository;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Component
//@Profile("dev")
public class MovieApplicationEventListener {

  private final MovieRepository movieRepository;

    public MovieApplicationEventListener(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadSampleData(){
        MovieEntity mv1 = new MovieEntity();
        mv1.setMovieId("TM230801");
        mv1.setTitle("Jailer");
        mv1.setGenre(List.of(Genre.Action,Genre.Thriller,Genre.Drama));
        mv1.setFormat(List.of(MovieFormat.TWO_DIMENTION));
        mv1.setDuration(128);
        mv1.setLanguages(List.of(MovieLagnuage.Telugu, MovieLagnuage.Tamil, MovieLagnuage.Hindi));
        mv1.setDescription("Jailer from Rajinikanth");
        mv1.setCensorRating("UA");
        mv1.setReleaseDate(LocalDate.parse("2023-08-11"));
        MovieEntity mv2 = new MovieEntity();
        mv2.setMovieId("TM230811");
        mv2.setTitle("Bhola Shankar");
        mv2.setGenre(List.of(Genre.Action,Genre.Thriller,Genre.Drama));
        mv2.setFormat(List.of(MovieFormat.TWO_DIMENTION));
        mv2.setDuration(125);
        mv2.setLanguages(List.of(MovieLagnuage.Telugu, MovieLagnuage.Tamil, MovieLagnuage.Hindi));
        mv2.setDescription("Chiranjeevi latest movie");
        mv2.setCensorRating("A");
        mv2.setReleaseDate(LocalDate.parse("2023-08-12"));
        movieRepository.saveAll(List.of(mv1,mv2));
    }
}
