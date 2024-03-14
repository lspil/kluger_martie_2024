package org.example.java_d4_e1;

import org.example.java_d4_e1.repositories.ProductRepository;
import org.example.java_d4_e1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class ProductServiceSpringIntegrationTests {


    @Autowired
    private ProductService productService;

    @MockBean
    private ProductRepository productRepository;


}
