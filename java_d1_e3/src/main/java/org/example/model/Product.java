package org.example.model;

import org.example.annotations.FieldValue;

public class Product {

    @FieldValue(name = "Beer")
    private String name;

    @FieldValue(name = "Dark")
    private String color;

    private String type;

    private Product() {
        System.out.println("Product created.");
    }

    private void showName() {
        System.out.println(name + " " + color + " " + type);
    }
}
