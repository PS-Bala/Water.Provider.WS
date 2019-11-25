package com.bkwp.demo.repository;

import com.bkwp.demo.model.Products;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductsRepository
 */
@Repository
public interface ProductsRepository extends MongoRepository<Products, String> {
    Products findByid(String id);
}