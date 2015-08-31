package com.chf.design.pattern.behavioral.responsibilitychain.v2;

public class Client {

    private Filter filter;

    public Client() {
        filter = new ProductIdFilter();
        filter.setSuccessor(new ProductPriceFilter());
        filter.setSuccessor(new DateFilter());

    }

    public Product doFilter(Product product) {
        return filter.handleRequest(product);
    }
}
