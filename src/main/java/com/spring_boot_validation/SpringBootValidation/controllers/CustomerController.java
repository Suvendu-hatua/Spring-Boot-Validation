package com.spring_boot_validation.SpringBootValidation.controllers;

import com.spring_boot_validation.SpringBootValidation.pojos.Customer;
import jakarta.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/customers")
public class CustomerController {

    @InitBinder
    public void trimInput(WebDataBinder webDataBinder){
        StringTrimmerEditor stringTrimmerEditor=new StringTrimmerEditor(true);
        webDataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
    }

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
            System.out.println("Customer FirstName: "+"|"+customer.getFirstName()+"|"+"\n");
            return "submit-registration";
        }
    }
}
