package org.example;

public interface PasswordEncoder {

    void encode(String pass); // encripteaza o parola
    boolean matches(String plainPass, String encPass);
        // valideaza daca o parola corespunde unei encriptari
}
