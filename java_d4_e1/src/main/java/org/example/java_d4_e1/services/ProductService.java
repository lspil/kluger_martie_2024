package org.example.java_d4_e1.services;

import org.example.java_d4_e1.entities.Product;
import org.example.java_d4_e1.exceptions.AlreadyExistingProductException;
import org.example.java_d4_e1.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product) {
        var existingProduct = productRepository.findProduct(product.getId());

        if (existingProduct.isEmpty()) {
            productRepository.insert(product);
        } else {
            throw new AlreadyExistingProductException();
        }
    }
}
