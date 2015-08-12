package com.chf.design.pattern.action.iterator.v1;

public class Product {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
