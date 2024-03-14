package org.example.java_d4_e1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.java_d4_e1.entities.Product;
import org.example.java_d4_e1.exceptions.AlreadyExistingProductException;
import org.example.java_d4_e1.repositories.ProductRepository;
import org.example.java_d4_e1.services.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ProductServiceWebIntegrationTests {

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductRepository productRepository;

    @Test
    @DisplayName("""
            WHEN product is added, no exception thrown.
            """)
    void test1() throws Exception {
        Product p = new Product();
        p.setId(1L);
        p.setName("P1");

        when(productRepository.findProduct(anyLong()))
                .thenReturn(Optional.empty());

        mockMvc.perform(post("/product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString(p))) // { "name":"P1", "id" : 1}
                .andExpect(status().isOk());

        verify(productRepository, times(1)).findProduct(1L);
        verify(productRepository, times(1)).insert(p);
        verifyNoMoreInteractions(productRepository);
    }

    @Test
    @DisplayName("""
            WHEN existing product is added, exception thrown.
            """)
    void test2() throws Exception {
        Product p = new Product();
        p.setId(1L);
        p.setName("P1");

        when(productRepository.findProduct(anyLong()))
                .thenReturn(Optional.of(p));

        mockMvc.perform(post("/product")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString(p))) // { "name":"P1", "id" : 1}
                .andExpect(status().isBadRequest());

        verify(productRepository, times(1)).findProduct(1L);
        verifyNoMoreInteractions(productRepository);
    }
}
