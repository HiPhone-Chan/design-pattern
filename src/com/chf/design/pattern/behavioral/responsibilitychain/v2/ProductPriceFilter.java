package com.chf.design.pattern.behavioral.responsibilitychain.v2;

import java.util.Date;

public class ProductPriceFilter extends Filter {

    @Override
    public Product handleRequest(Product product) {
        if (check(product))
            return product;
        if (product.getExpireTime().before(new Date()))
            return null;
        return successor.handleRequest(product);
    }

}
