package com.chf.design.pattern.action.iterator.v1;

public class Client {

    public void foreach() {

        Shelf shelf = new Shelf();
        Product[] products = shelf.getProducts();
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

}
