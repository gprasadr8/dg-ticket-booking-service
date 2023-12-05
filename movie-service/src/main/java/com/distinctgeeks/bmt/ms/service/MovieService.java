package com.distinctgeeks.bmt.ms.service;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import com.distinctgeeks.bmt.ms.enums.Genre;
import com.distinctgeeks.bmt.ms.enums.MovieFormat;
import com.distinctgeeks.bmt.ms.enums.MovieLagnuage;
import com.distinctgeeks.bmt.ms.model.NewMovieRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.distinctgeeks.bmt.ms.model.MovieInfo;
import com.distinctgeeks.bmt.ms.persistence.entity.MovieEntity;
import com.distinctgeeks.bmt.ms.persistence.repository.MovieRepository;

@Service
public class MovieService {
	
	
	private final MovieRepository movieRepository;
	
	public MovieService(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
	public List<MovieInfo> getAllMovies(){
		List<MovieEntity> allMovies = movieRepository.findAll();
		return allMovies.stream().map(this::convertFromEntity).collect(Collectors.toList());
	}
	
	private MovieInfo convertFromEntity(MovieEntity movieEntity) {
		MovieInfo movieInfo = new MovieInfo();
		movieInfo.setMovieId(movieEntity.getMovieId());
		movieInfo.setTitle(movieEntity.getTitle());
		movieInfo.setDescription(movieEntity.getDescription());
		Duration movieDuration = Duration.ofMinutes(movieEntity.getDuration());
		movieInfo.setDuration(String.format("%dh:%dm", movieDuration.toHoursPart(), movieDuration.toMinutesPart()));
		movieInfo.setFormat(movieEntity.getFormat().stream().map(MovieFormat::getMovieFormat).collect(Collectors.toList()));
		movieInfo.setGenre(movieEntity.getGenre().stream().map(Enum::name).collect(Collectors.toList()));
		movieInfo.setLanguages(movieEntity.getLanguages().stream().map(Enum::name).collect(Collectors.toList()));
		movieInfo.setCensorRating(movieEntity.getCensorRating());
		movieInfo.setReleaseDate(movieEntity.getReleaseDate());
		return movieInfo;
	}


	public MovieInfo addNewMovie(NewMovieRequest newMovieRequest) {
		MovieEntity movieEntity = convertToEntity(newMovieRequest);
	}

	private MovieEntity convertToEntity(NewMovieRequest newMovieRequest) {
	}
}
