package com.chf.design.pattern.action.responsibilitychain.v2;

public class DateFilter extends Filter {

    @Override
    public Product handleRequest(Product product) {
        if (check(product))
            return product;
        if (product.getProductId() == null)
            return null;
        return successor.handleRequest(product);
    }

}
