package com.bkwp.demo.controllers;

import java.util.List;

import com.bkwp.demo.model.Products;
import com.bkwp.demo.services.ProductsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * DemoController
 */
@RestController
public class ProductsController {

    @Autowired
    ProductsService productsService;

    @GetMapping("/products")
    public List<Products> getProducts() {
        List<Products> data = productsService.getAll();
        return data;
    }
}
