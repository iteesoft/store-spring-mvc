package com.iteesoft.sta.controller;

import com.iteesoft.sta.dto.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.iteesoft.sta.service.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping("")
	public String login(Model model) {
//		findPaginated(1, "firstName", "asc", model);
		model.addAttribute("products", productService.getAllProducts());
		//System.out.println(model.getAttribute("email"));
		return "product-list";
	}

	@PostMapping("/addProduct")
	public String saveProduct(@ModelAttribute("product") ProductDto product) {
		// save employee to database
		productService.saveProduct(product);
		return "redirect:/products";
	}


	// display list of products


//	@GetMapping("/loginEmployee")
//	public String loginEmployee(Model model) {
//		//Employee employee = employeeService.getEmployeeById(id);
//		//model.addAttribute("productname", employee.getFirstName());
//		return "product-list";
//	}
////
//	@GetMapping("/showNewEmployeeForm")
//	public String showNewEmployeeForm(Model model) {
//		// create model attribute to bind form data
//		User product = new User();
//		model.addAttribute("employee", product);
//		return "new_employee";
//	}
//
//	@PostMapping("/attendance")
//	public void markAttendance(Model model) {
//
//	}
//
//	@PostMapping("leaveRequest")
//	public void requestForLeave(Model model) {
//
//	}
//

//	@PostMapping("/register")
//	public String registerEmployee(@PathVariable ( value = "id") long id, Model model){
//		// get employee from the service
//		User product = employeeService.getEmployeeById(id);
//
//		// set employee as a model attribute to pre-populate the form
//		model.addAttribute("employee", product);
//		 return "redirect:/admin";
//
//	}
//
//	@GetMapping("/showFormForUpdate/{id}")
//	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
//
//		// get employee from the service
//		User product = employeeService.getEmployeeById(id);
//
//		// set employee as a model attribute to pre-populate the form
//		model.addAttribute("employee", product);
//		return "update_employee";
//	}
//
//	@GetMapping("/deleteEmployee/{id}")
//	public String deleteEmployee(@PathVariable (value = "id") long id) {
//
//		// call delete employee method
//		this.employeeService.deleteEmployeeById(id);
//		return "redirect:/admin";
//	}
//
	


}

