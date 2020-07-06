package com.sfmovies.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sfmovies.data.entity.Theatre;

@Repository
public interface TheatreRepository extends CrudRepository<Theatre, Long> {
    Theatre findByTheatreId(Long theatreId);
    Theatre findByTheatreNameAndTheatreCity(String theatreName, String theatreCity);
}
