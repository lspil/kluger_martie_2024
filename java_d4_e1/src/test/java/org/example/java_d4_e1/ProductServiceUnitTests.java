package org.example.java_d4_e1;

import org.example.java_d4_e1.entities.Product;
import org.example.java_d4_e1.exceptions.AlreadyExistingProductException;
import org.example.java_d4_e1.repositories.ProductRepository;
import org.example.java_d4_e1.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

class ProductServiceUnitTests {

    @Test
    @DisplayName("""
            WHEN product is added, no exception thrown.
            """)
    void test1() {
        Product p = new Product();
        p.setId(1L);
        p.setName("P1");

        ProductRepository productRepository = mock(ProductRepository.class);

        when(productRepository.findProduct(anyLong()))
                .thenReturn(Optional.empty());

        ProductService underTest = new ProductService(productRepository);

        underTest.addProduct(p);

        verify(productRepository, times(1)).findProduct(1L);
        verify(productRepository, times(1)).insert(p);
        verifyNoMoreInteractions(productRepository);
    }

    @Test
    @DisplayName("""
            WHEN existing product is added, exception thrown.
            """)
    void test2() {
        Product p = new Product();
        p.setId(1L);
        p.setName("P1");

        ProductRepository productRepository = mock(ProductRepository.class);

        when(productRepository.findProduct(anyLong()))
                .thenReturn(Optional.of(p));

        ProductService underTest = new ProductService(productRepository);

        Assertions.assertThrows(
                AlreadyExistingProductException.class,
                () -> underTest.addProduct(p)
        );

        verify(productRepository, times(1)).findProduct(1L);
        verifyNoMoreInteractions(productRepository);
    }
}
