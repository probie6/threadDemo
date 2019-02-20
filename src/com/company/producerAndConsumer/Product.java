package com.company.producerAndConsumer;

public class Product {
    private String name;
    private Long number;

    public Product(String name, Long number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
