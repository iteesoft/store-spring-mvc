package com.iteesoft.ems.service;

import java.util.List;

import com.iteesoft.ems.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {

	List<Employee> getAllEmployees();
	void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

  //  Employee getEmployeeByUserName(String username);
    Employee getEmployeeByEmail(String email);

	Employee getEmployeeByEmailAndPassword(String email, String password);

//    Employee findEmployeeByEmailAndPassword(String email, String password);
}
