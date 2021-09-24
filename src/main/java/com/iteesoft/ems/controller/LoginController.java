package com.iteesoft.ems.controller;

import javax.servlet.http.HttpSession;
import com.iteesoft.ems.model.Employee;
import com.iteesoft.ems.dto.Request;
import com.iteesoft.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class LoginController {
    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = "/")
    public String showForm(Model model) {
//        Request loginForm = new Request();
//        model.addAttribute("loginForm", loginForm);
        return "index";
    }

    @PostMapping(value = "/login")
    public String validateLoginInfo(Model model, HttpSession session,
                                    @ModelAttribute("loginForm") Request loginInfo, BindingResult bindingResult) {
        Employee employee = employeeService.getEmployeeByEmailAndPassword(loginInfo.getEmail(), loginInfo.getPassword());

        if (!bindingResult.hasErrors() && employee != null) {
            session.setAttribute("user", employee);

            if (employee.getRole().equals("Admin".toUpperCase())) {
                model.addAttribute("login_user", employee.getFirstName());
                return "redirect:/admin";

            } else if (employee.getRole().equals("Employee".toUpperCase())){
//                session.setAttribute("user", employee);
                model.addAttribute("email", loginInfo.getEmail());
                model.addAttribute("login_user", employee.getFirstName());
                String message = "You have successfully Logged in!!";
                model.addAttribute("flash", message);
                return "redirect:/loginEmployee";
            }
        }
        return "index";
    }
}