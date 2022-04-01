package com.iteesoft.sta.service.impl;

import com.iteesoft.sta.dto.UserDto;
import com.iteesoft.sta.model.User;
import com.iteesoft.sta.repository.UserRepository;
import com.iteesoft.sta.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

//
    @Override
    public User createUser(UserDto user) {
        User newUser = User.builder().firstName(user.getFirstName())
                        .lastName(user.getLastName()).email(user.getEmail())
                        .password(user.getPassword()).build();
        return userRepository.save(newUser);
    }

    @Override
    public User getUserByEmailAndPassword(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    ////    @Override
////    public User getEmployeeById(long id) {
////        Optional<User> optional = userRepository.findById(id);
////        User user;
////        if (optional.isPresent()) {
////            user = optional.get();
////        } else {
////            throw new RuntimeException(" Employee not found for id :: " + id);
////        }
////        return user;
////    }
////
////    @Override
////    public void deleteEmployeeById(long id) {
////        this.userRepository.deleteById(id);
////    }
////
//    @Override
//    public Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
//        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
//                Sort.by(sortField).descending();
//
//        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
//        return userRepository.findAll(pageable);
//    }
////
//////	@Override
//////	public Employee getEmployeeByUserName(String username) {
//////		return employeeRepository.findByUsernameAndPassword(username);
//////	}
////
////    @Override
////    public User getEmployeeByEmail(String email) {
////        return userRepository.findByEmail(email);
////    }
//
//    @Override
//    public User getEmployeeByEmailAndPassword(String email, String password) {
//        return userRepository.findByEmailAndPassword(email, password);
//    }



}
//
