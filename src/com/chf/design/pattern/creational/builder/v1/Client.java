package com.chf.design.pattern.creational.builder.v1;

public class Client {

    public void op() {
        Product product = new Product();

        product.setPriceElememt(null);
        product.setAttribute(null);
        product.setProductId("");
    }
}
