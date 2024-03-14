package org.example.java_d4_e1.repositories;

import org.example.java_d4_e1.entities.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepository {

    private final List<Product> products = new ArrayList<>();

    public void insert(Product product) {
        products.add(product);
    }

    public Optional<Product> findProduct(Long id) {
        for (Product p : products) {
            if (p.getId() == id) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}
