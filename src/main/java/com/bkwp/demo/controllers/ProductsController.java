package com.bkwp.demo.controllers;

import com.bkwp.demo.model.Products;
import com.bkwp.demo.services.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * DemoController
 */
@RestController
public class ProductsController {
    @Autowired
    ProductsService productsService;

    @GetMapping("/products")
    public List<Products> getProducts() {
        List<Products> data = productsService.getAllProducts();
        return data;
    }
    @PostMapping("/products")
    public Products createProduct(@RequestBody Products product) {
        productsService.createProduct(product);
        return product;
    }
    @DeleteMapping("/products/{id}")
    public Products deleteProduct(@PathVariable("id") String id) {
        return productsService.deleteProduct(id);
    }

    @PutMapping(value = "/products/{id}")
    public Products updateProduct(@PathVariable String id, @RequestBody Products product) {
        return productsService.updateProduct(id, product);
    }

}
