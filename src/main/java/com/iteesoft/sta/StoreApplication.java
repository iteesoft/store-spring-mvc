package com.iteesoft.sta;

import com.iteesoft.sta.model.Product;
import com.iteesoft.sta.model.User;
import com.iteesoft.sta.repository.ProductRepository;
import com.iteesoft.sta.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		System.setProperty("server.port", "8082");
		SpringApplication.run(StoreApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ProductRepository productRepo, UserRepository userRepo) {
		return args -> {
			userRepo.save(User.builder().firstName("Jason").lastName("Adebayo").email("jay@aol.com").password("5Gcesf1").build());
			productRepo.save(Product.builder().name("Spaghetti").description("Dangote tiny").price(350.00).quantity(12).build());
			productRepo.save(Product.builder().name("Milk").description("Tin 3 crown").price(270.00).quantity(112).build());
			productRepo.save(Product.builder().name("Chin Chin").description("Nasco").price(70.00).quantity(120).build());
		};
	}

}
