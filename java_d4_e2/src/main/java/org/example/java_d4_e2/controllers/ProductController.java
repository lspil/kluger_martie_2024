package org.example.java_d4_e2.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@RestController
public class ProductController {

    @PostMapping("/product")
    public Mono<?> addProduct() {
        return Mono.empty();
    }
}
