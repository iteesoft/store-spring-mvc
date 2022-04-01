package com.iteesoft.sta.service;

import com.iteesoft.sta.model.User;

import java.util.Optional;

public interface LoginService {
    Optional<User> findEmployeeByUsernameAndPassword(String username, String password);
}
