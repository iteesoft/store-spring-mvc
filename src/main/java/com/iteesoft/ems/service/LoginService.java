package com.iteesoft.ems.service;

import com.iteesoft.ems.model.Employee;

import java.util.Optional;

public interface LoginService {
    Optional<Employee> findEmployeeByUsernameAndPassword(String username, String password);
}
