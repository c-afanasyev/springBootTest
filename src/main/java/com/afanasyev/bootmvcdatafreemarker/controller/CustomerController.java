package com.afanasyev.bootmvcdatafreemarker.controller;


import com.afanasyev.bootmvcdatafreemarker.entity.Customer;
import com.afanasyev.bootmvcdatafreemarker.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CustomerController {
    @Autowired
    public CustomerService service;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/customers")
    public String getAllCustomers(Model model) {
        model.addAttribute("customers", service.findAll());
        return "customersList";
    }

    @GetMapping("/customer/{id}")
    public String getById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("customer", service.getById(id));
        return "showCustomer";
    }
    //show addCustomer page
    @GetMapping("/addCustomer")
    public String createCustomerPage(){
        return "createCustomer";
    }

    //action. will create a new Customer
    @PostMapping("/addCustomer")
    public String addCustomer(@ModelAttribute("customer") Customer customer ){
        service.save(customer);
        return "redirect:/customers";
    }

    //show updateCustomer page
    @GetMapping("/update/{id}")
    public String update(@PathVariable("id") Integer id, Model model) {
        model.addAttribute("customer", service.getById(id));
        return "updateCustomer";
    }

    //action. will update Customer's data
    @PostMapping("/updateCustomer")
    public String updateCustomer(@ModelAttribute("customer") Customer customer ){
        service.update(customer);
        return "redirect:/customer/" + customer.getId();
    }

    //action. will delete selected Customer
    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable("id") Integer id){
        service.delete(id);
        return "redirect:/customers";
    }

}
