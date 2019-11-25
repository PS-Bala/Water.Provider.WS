package com.bkwp.demo.controllers;

import com.bkwp.demo.model.Customer;
import com.bkwp.demo.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerDetailsController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/customer")
    public Customer createCustomer(@RequestBody Customer customer) {
        customerService.createCustomer(customer);
        return customer;
    }

    @GetMapping("/customer/{contactNumber}")
    public Customer getCustomer(@PathVariable long contactNumber) {
        Customer customerDetails = customerService.getCustomerDetails(contactNumber);
        return customerDetails;
    }

    @PutMapping(value = "/customer/{contactNumber}")
    public Customer updateCustomer(@PathVariable long contactNumber, @RequestBody Customer customer) {
        return customerService.updateCustomer(contactNumber, customer);
    }

    @DeleteMapping("/customer/{contactNumber}")
    public Customer deleteCustomer(@PathVariable long contactNumber) {
        return customerService.deleteCustomer(contactNumber);
    }
}
