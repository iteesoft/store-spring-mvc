//package com.iteesoft.ems.controller;
//
//import com.iteesoft.ems.model.UserInfo;
//import com.iteesoft.ems.service.UserService;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import java.util.List;
//
//
//@Controller
//@RequestMapping("/users")
//public class UserController {
//
//    private final UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.GET)
//    public String getUsers(Model model) {
//        List<UserInfo> users = userService.getUsers();
//        model.addAttribute("users", users);
//        model.addAttribute("userInfo", new UserInfo());
//        return "user_login";
//    }
//
//    @RequestMapping(value = "/", method = RequestMethod.POST)
//    public String createUser(Model model, @ModelAttribute UserInfo userInfo) {
//        UserInfo user = userService.createUser(userInfo);
//        return "redirect:/user_login/";
//    }
//}
