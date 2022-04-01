package com.iteesoft.sta.service;

import com.iteesoft.sta.dto.UserDto;
import com.iteesoft.sta.model.User;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    User createUser(UserDto employee);

//    List<User> getAllUsers();
//    void saveUser(User user);
//    User getUserById(long id);
//    void deleteUserById(long id);
//    Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);

    User getUserByEmailAndPassword(String email, String password);
//
//    //  Employee getEmployeeByUserName(String username);
//    User getUserByEmail(String email);
//
//    User getUserByEmailAndPassword(String email, String password);
//
////    Employee findEmployeeByEmailAndPassword(String email, String password);
}
