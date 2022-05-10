package com.peraltarp.dsmovie.repositories;

import com.peraltarp.dsmovie.entities.Movie;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long>{
    
}
