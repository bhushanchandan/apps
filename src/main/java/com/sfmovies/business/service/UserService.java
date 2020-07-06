package com.sfmovies.business.service;

import com.sfmovies.data.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
