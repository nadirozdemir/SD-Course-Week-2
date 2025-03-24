package com.nadir.week2.config;

import com.nadir.week2.repository.ProductRepository;
import com.nadir.week2.repository.InMemoryProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        return new InMemoryProductRepository();
    }
}
