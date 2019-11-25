package com.bkwp.demo.services;

import com.bkwp.demo.model.Customer;
import com.bkwp.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomerDetails(long contactNumber) {
        return customerRepository.findBycontactNumber(contactNumber);
    }

    public Customer updateCustomer(long contactNumber, Customer customer) {
        customer.setContactNumber(contactNumber);
        customerRepository.save(customer);
        return customer;
    }

    public Customer deleteCustomer(long contactNumber) {
        Customer customerToDelete = customerRepository.findBycontactNumber(contactNumber);
        customerRepository.delete(customerToDelete);
        return customerToDelete;
    }
}
