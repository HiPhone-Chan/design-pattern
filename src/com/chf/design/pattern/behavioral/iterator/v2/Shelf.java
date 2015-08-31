package com.chf.design.pattern.behavioral.iterator.v2;

import java.util.Iterator;

public class Shelf implements Iterable<Product> {

    private Product[] products = { new Product("vm"), new Product("ip"),
            new Product("ebs") };

    public Product[] getProducts() {
        return products;
    }

    @Override
    public Iterator<Product> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<Product> {
        int cursor = 0; // index of next element to return

        @Override
        public boolean hasNext() {
            return cursor < products.length;
        }

        @Override
        public Product next() {
            return products[cursor++];
        }

    }
}
