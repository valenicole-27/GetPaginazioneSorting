package com.example.paginationdemo.repository;

import com.example.paginationdemo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Query Method con paginazione
    Page<Product> findByCategory(String category, Pageable pageable);
}