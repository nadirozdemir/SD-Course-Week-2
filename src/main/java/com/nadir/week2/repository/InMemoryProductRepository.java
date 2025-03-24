package com.nadir.week2.repository;

import com.nadir.week2.model.Product;
import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository implements ProductRepository {

    private List<Product> products = new ArrayList<>();

    // Products added in  constructor
    public InMemoryProductRepository() {
        products.add(new Product(1L, "Chips", 3.50));
        products.add(new Product(2L, "Chocolate", 2.75));
        products.add(new Product(3L, "Biscuit", 1.50));
        products.add(new Product(4L, "Crackers", 2.25));
        products.add(new Product(5L, "Wafer", 1.25));
        products.add(new Product(6L, "Fruit Juice", 4.00));
        products.add(new Product(7L, "Energy Bar", 3.00));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }
}
