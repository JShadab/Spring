package com.wipro.BEJ_C2_S1_REST_API_PC_11.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.BEJ_C2_S1_REST_API_PC_11.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
