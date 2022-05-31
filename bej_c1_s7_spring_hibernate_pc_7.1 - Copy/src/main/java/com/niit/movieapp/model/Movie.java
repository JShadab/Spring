package com.niit.movieapp.model;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

/**
 * Add the appropriate annotations for the model class Annotate the class
 * with @Entity Annotate each field with @Column For the datePlayed field add
 * the annotation @DateTimeFormat(pattern = "yyyy-MM-dd"). Ensure the date is
 * accepted in the index.jsp in the same pattern
 */
@Entity
public class Movie {

	@Id
	@Column(name = "movie_name")
	private String movieName;

	@Column(name = "date_played")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDateTime datePlayed;

	@Column(name = "director_name")
	private String directorName;

	public Movie() {
	}

	public Movie(String movieName, LocalDateTime datePlayed, String directorName) {
		// initialize the variales
		this.movieName = movieName;
		this.datePlayed = datePlayed;
		this.directorName = directorName;
	}

	// Getters and Setters

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public LocalDateTime getDatePlayed() {
		return datePlayed;
	}

	public void setDatePlayed(LocalDateTime datePlayed) {
		this.datePlayed = datePlayed;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

}
