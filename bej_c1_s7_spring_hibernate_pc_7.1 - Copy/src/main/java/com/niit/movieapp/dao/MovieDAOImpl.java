package com.niit.movieapp.dao;

import com.niit.movieapp.model.Movie;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Annotate the class with @Component and @Transactional annotations
 */
public class MovieDAOImpl implements MovieDAO {

	// Autowire sessionFactory
	@Autowired
	private SessionFactory sessionFactory;

	public MovieDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;

	}

	@Override
	public boolean addMovie(Movie movie) {
		getCurrentSession().saveOrUpdate(movie);

		return true;
	}

	@Override
	public List<Movie> listAllMovies() {
		// return all the movies from the database table
		return getCurrentSession().createQuery("from " + Movie.class.getName()).list();

	}

	protected Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

}
