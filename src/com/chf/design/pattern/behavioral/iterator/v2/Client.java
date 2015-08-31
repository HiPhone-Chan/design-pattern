package com.chf.design.pattern.behavioral.iterator.v2;

public class Client {

    public void foreach() {

        Shelf shelf = new Shelf();
//        for (Product product : shelf) {
//            System.out.println(product);
//        }
        shelf.forEach(product -> System.out.println(product));
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.foreach();
    }

}
