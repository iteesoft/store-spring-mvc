package com.iteesoft.sta.service.impl;

import com.iteesoft.sta.model.User;
import com.iteesoft.sta.service.LoginService;
import java.util.Optional;

public class LoginServiceImpl implements LoginService {

    @Override
    public Optional<User> findEmployeeByUsernameAndPassword(String username, String password) {
        return Optional.empty();
    }
}
