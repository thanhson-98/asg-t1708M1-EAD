package com.example.exam_ejb.demo.repository;

import com.example.exam_ejb.demo.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
