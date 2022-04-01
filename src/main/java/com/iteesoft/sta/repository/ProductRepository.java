package com.iteesoft.sta.repository;

import com.iteesoft.sta.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
