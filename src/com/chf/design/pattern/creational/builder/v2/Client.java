package com.chf.design.pattern.creational.builder.v2;

import com.chf.design.pattern.creational.builder.v2.Product;

public class Client {

    public void op() {
        ProductBuilder productBuilder = new ProductBuilderImpl();

        // do something for the productBuilder

        Product product = productBuilder.getProduct();

        System.out.println(product);
    }
}
