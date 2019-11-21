package com.bkwp.demo.services;

import java.util.List;
import com.bkwp.demo.model.Products;
import com.bkwp.demo.repository.ProductsRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ProductsService
 */
@Service
public class ProductsService {
    @Autowired
    private ProductsRepository productsRepository;

    public Products create(Products products) {
        return productsRepository.save(products);
    }

    public List<Products> getAll() {
        return productsRepository.findAll();
    }
}