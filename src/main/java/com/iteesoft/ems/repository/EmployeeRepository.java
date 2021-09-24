package com.iteesoft.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iteesoft.ems.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

//    Employee findByUsername(String username);

    Employee findByEmail(String email);

    //Employee findByUsernameAndPassword(String username);

    Employee findByEmailAndPassword(String email, String password);
}
