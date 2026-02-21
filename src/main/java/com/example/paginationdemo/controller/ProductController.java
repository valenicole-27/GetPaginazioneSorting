package com.example.paginationdemo.controller;

import com.example.paginationdemo.entity.Product;
import com.example.paginationdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public Page<Product> getProductsByCategory(
            @RequestParam String category,
            Pageable pageable
    ) {
        return productService.getProductsByCategory(category, pageable);
    }
}