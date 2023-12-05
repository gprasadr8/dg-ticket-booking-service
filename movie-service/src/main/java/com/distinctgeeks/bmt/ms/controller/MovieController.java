/**
 * 
 */
package com.distinctgeeks.bmt.ms.controller;

import java.util.List;

import com.distinctgeeks.bmt.ms.model.NewMovieRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.distinctgeeks.bmt.ms.model.MovieInfo;
import com.distinctgeeks.bmt.ms.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	private final MovieService movieService;
	
	public MovieController(MovieService movieService) {
		this.movieService = movieService;
	}
	
	@GetMapping
	public List<MovieInfo> retrieveAllMoviesByCity() {
		return movieService.getAllMovies();
	}

	@PostMapping
	public ResponseEntity<MovieInfo> addNewMovie(@RequestBody NewMovieRequest newMovieRequest){
		movieService.addNewMovie(newMovieRequest);
	}

}
