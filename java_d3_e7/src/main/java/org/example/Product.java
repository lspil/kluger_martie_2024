package org.example;

public class Product {

    private String name;
    private String color;
    private double price;

    private Product() {}

    public static class Builder {

        Product p = new Product();

        public Builder setName(String name) {
            this.p.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.p.color = color;
            return this;
        }

        public Builder setPrice(double price) {
            this.p.price = price;
            return this;
        }

        public Product build() {
            return this.p;
        }

    }
}
