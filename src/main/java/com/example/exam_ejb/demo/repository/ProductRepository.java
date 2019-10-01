package com.example.exam_ejb.demo.repository;

import com.example.exam_ejb.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
