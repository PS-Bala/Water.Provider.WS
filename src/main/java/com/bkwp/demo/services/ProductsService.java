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

    public Products createProduct(Products product) {
        return productsRepository.save(product);
    }

    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }

    public Products updateProduct(String itemId, Products product) {
        product.setId(itemId);
        productsRepository.save(product);
        return product;
    }

    public Products deleteProduct(String itemId) {
        Products productToDelete = productsRepository.findByid(itemId);
        productsRepository.delete(productToDelete);
        return productToDelete;
    }
}