package com.iteesoft.sta.service.impl;

import java.util.List;
import java.util.Optional;

import com.iteesoft.sta.dto.ProductDto;
import com.iteesoft.sta.model.Product;
import com.iteesoft.sta.model.User;
import com.iteesoft.sta.repository.ProductRepository;
import com.iteesoft.sta.repository.UserRepository;
import com.iteesoft.sta.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

	private final ProductRepository productRepo;

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public Product saveProduct(ProductDto product) {

		Product newProduct = Product.builder().description(product.getDescription())
				.name(product.getName()).price(Double.parseDouble(product.getPrice()))
						.quantity(Integer.parseInt(product.getQuantity()))
						.image(product.getImage()).build();
		return productRepo.save(newProduct);
	}


}
