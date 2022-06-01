package com.wipro.BEJ_C2_S1_REST_API_PC_11.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.BEJ_C2_S1_REST_API_PC_11.model.Movie;
import com.wipro.BEJ_C2_S1_REST_API_PC_11.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public void saveMovie(Movie movie) {
		movieRepository.save(movie);
		
	}

	public List<Movie> getAllMovies() {
		
		return movieRepository.findAll();
	}

}
