package com.iteesoft.sta.controller;

import com.iteesoft.sta.dto.UserDto;
import com.iteesoft.sta.model.User;
import com.iteesoft.sta.service.UserService;
import com.iteesoft.sta.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
//    private ProductService employeeService;


    @GetMapping("/save")
    public String saveEmployee(Model model) {
        // save employee to database
        model.addAttribute("user", new UserDto());
        return "new_user";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("user") UserDto user) {
        // save employee to database
        userService.createUser(user);
        return "redirect:/";
    }
//
//    @GetMapping("/admin")
//    public String viewAdminPage(Model model) {
//        findPaginated(1, "firstName", "asc", model);
////		Employee loginUser = employeeService.getEmployeeByEmail(request.getEmail());
//        model.addAttribute("admin", "admin");
//        return "admin_home";
//    }
////
////    @PostMapping
////    public String sendEmail(Model model) {
////        model.addAttribute("emailDto", new EmailDto());
////        return "send-email-page";
////    }
////
////    @PostMapping
////    public String processEmail(@ModelAttribute("emailDto") EmailDto emailDto) {
////
////        return "process-email-page";
////    }
////
////
////    @GetMapping("/page/{pageNo}")
////    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
////                                @RequestParam("sortField") String sortField,
////                                @RequestParam("sortDir") String sortDir,
////                                Model model) {
////        int pageSize = 5;
////
////        Page<User> page = employeeService.findPaginated(pageNo, pageSize, sortField, sortDir);
////        List<User> listUsers = page.getContent();
////
////        model.addAttribute("currentPage", pageNo);
////        model.addAttribute("totalPages", page.getTotalPages());
////        model.addAttribute("totalItems", page.getTotalElements());
////
////        model.addAttribute("sortField", sortField);
////        model.addAttribute("sortDir", sortDir);
////        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
////
////        model.addAttribute("listEmployees", listUsers);
////        return "index";
////    }
////
//////    @RequestMapping(value = "/", method = RequestMethod.GET)
//////    public String getUsers(Model model) {
//////        List<UserInfo> users = userService.getUsers();
//////        model.addAttribute("users", users);
//////        model.addAttribute("userInfo", new UserInfo());
//////        return "user_login";
//////    }
//////
//////    @RequestMapping(value = "/", method = RequestMethod.POST)
//////    public String createUser(Model model, @ModelAttribute UserInfo userInfo) {
//////        UserInfo user = userService.createUser(userInfo);
//////        return "redirect:/user_login/";
//////    }
}
