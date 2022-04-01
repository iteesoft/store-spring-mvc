package com.iteesoft.sta.service;

import com.iteesoft.sta.dto.ProductDto;
import com.iteesoft.sta.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();
    Product saveProduct(ProductDto product);

}
