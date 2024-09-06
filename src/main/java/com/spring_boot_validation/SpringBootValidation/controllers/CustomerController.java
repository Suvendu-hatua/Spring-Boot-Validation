package com.spring_boot_validation.SpringBootValidation.controllers;

import com.spring_boot_validation.SpringBootValidation.pojos.Customer;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/register")
    public String showCustomerForm(Model theModel){
        Customer customer=new Customer();
        theModel.addAttribute("customer",customer);
        return "show-registration";
    }

    @PostMapping("/submit-customer")
    public String registerCustomers(@Valid  @ModelAttribute("customer") Customer customer,
                                 BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "show-registration";
        }else{
            return "submit-registration";
        }
    }
}
