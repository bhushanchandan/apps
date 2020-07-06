package com.sfmovies.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sfmovies.data.entity.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie, String> {
    Movie findByMovieName(String movieName);
    Movie findByMovieId(long movieId);
}
