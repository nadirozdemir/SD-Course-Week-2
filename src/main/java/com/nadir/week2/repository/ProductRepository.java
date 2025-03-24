package com.nadir.week2.repository;

import com.nadir.week2.model.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
