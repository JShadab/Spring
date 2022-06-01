package com.wipro.BEJ_C2_S1_REST_API_PC_11.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.BEJ_C2_S1_REST_API_PC_11.model.Movie;
import com.wipro.BEJ_C2_S1_REST_API_PC_11.service.MovieService;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;

	@PostMapping("/movie")
	public String save(@RequestBody Movie movie) {
		movieService.saveMovie(movie);
		return "Movie saved successfully";
	}

	@GetMapping("/movie")
	public List<Movie> getAllMovies() {

		return movieService.getAllMovies();
	}

}
