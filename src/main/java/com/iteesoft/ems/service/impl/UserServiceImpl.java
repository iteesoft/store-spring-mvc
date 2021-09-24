//package com.iteesoft.ems.service.impl;
//
//import com.iteesoft.ems.model.UserInfo;
//import com.iteesoft.ems.repository.UserInfoRepository;
//import com.iteesoft.ems.service.UserService;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    private UserInfoRepository userInfoRepository;
//
//    public UserServiceImpl(UserInfoRepository userInfoRepository) {
//        this.userInfoRepository = userInfoRepository;
//    }
//
//    public void UserService(UserInfoRepository userInfoRepository) {
//        this.userInfoRepository = userInfoRepository;
//    }
//
//    public List<UserInfo> getUsers() {
//        return userInfoRepository.findAll();
//    }
//
//    public UserInfo createUser(UserInfo userInfo) {
//        return userInfoRepository.save(userInfo);
//    }
//}
//
