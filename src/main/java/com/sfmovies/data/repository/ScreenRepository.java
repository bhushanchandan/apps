package com.sfmovies.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.sfmovies.data.entity.Screen;

import java.util.List;

public interface ScreenRepository extends CrudRepository<Screen, Long> {
    public Screen findByScreenId(long screenId);
    public List<Screen> findByTheatreId(long theatreId);
}
