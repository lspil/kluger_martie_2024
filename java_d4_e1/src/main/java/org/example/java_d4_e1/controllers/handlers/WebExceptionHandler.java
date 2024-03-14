package org.example.java_d4_e1.controllers.handlers;

import org.example.java_d4_e1.exceptions.AlreadyExistingProductException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebExceptionHandler {

    @ExceptionHandler({AlreadyExistingProductException.class})
    public ResponseEntity<?> alreadyExistingProductException() {
        return ResponseEntity.badRequest().build();
    }
}
