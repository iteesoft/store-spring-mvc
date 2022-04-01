package com.iteesoft.sta.controller;

import javax.servlet.http.HttpSession;
import com.iteesoft.sta.model.User;
import com.iteesoft.sta.dto.Request;
import com.iteesoft.sta.service.ProductService;
import com.iteesoft.sta.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@SessionAttributes({"loginUser"})
public class LoginController {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String showForm(Model model) {
        Request loginUser = new Request();
        model.addAttribute("loginUser", loginUser);
        return "index";
    }

    @PostMapping("/login")
    public String validateLoginInfo(Model model, HttpSession session,
                                    @ModelAttribute("loginUser") Request loginUser, BindingResult bindingResult) {
        User user = userService.getUserByEmailAndPassword(loginUser.getEmail(), loginUser.getPassword());
        String message ="";
        if (bindingResult.hasErrors() && user == null) {
            message = "Invalid credentials!";
            model.addAttribute("flash", message);
            return "index";
        }

        session.setAttribute("user", user);
        message = "You have successfully Logged in!!";
        model.addAttribute("flash", message);
        return "redirect:/products";
    }
}