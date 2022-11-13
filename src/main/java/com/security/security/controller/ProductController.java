package com.security.security.controller;

import com.security.security.entity.Product;
import com.security.security.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/product")
    public Product save(@RequestBody Product product    ) {
        return productRepository.save(product);
    }

    @GetMapping("/product")
    public List<Product> index() {
        return productRepository.findAll();
    }
}
