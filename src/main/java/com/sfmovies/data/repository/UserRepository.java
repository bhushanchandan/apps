package com.sfmovies.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sfmovies.data.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
        User findByUsername(String username);
}
