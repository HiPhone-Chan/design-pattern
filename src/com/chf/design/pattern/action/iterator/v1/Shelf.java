package com.chf.design.pattern.action.iterator.v1;

public class Shelf {

    private Product[] products = { new Product("vm"), new Product("ip"),
            new Product("ebs") };

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

}
