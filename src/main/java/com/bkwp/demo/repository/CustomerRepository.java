package com.bkwp.demo.repository;

import com.bkwp.demo.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findBycontactNumber(long contactNumber);
}