package com.nadir.week2.controller;

import com.nadir.week2.model.Product;
import com.nadir.week2.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    // constructor injection
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // GET request
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
}
