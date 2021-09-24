package com.iteesoft.ems.service.impl;

import com.iteesoft.ems.model.Employee;
import com.iteesoft.ems.service.LoginService;
import java.util.Optional;

public class LoginServiceImpl implements LoginService {

    @Override
    public Optional<Employee> findEmployeeByUsernameAndPassword(String username, String password) {
        return Optional.empty();
    }
}
