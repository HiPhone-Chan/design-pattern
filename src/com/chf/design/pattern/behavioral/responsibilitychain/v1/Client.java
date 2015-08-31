package com.chf.design.pattern.behavioral.responsibilitychain.v1;

import java.util.Date;

public class Client {

    public Product doFilter(Product product) {
        if (product == null)
            return null;
        if (product.getProductId() == null)
            return null;
        if (product.getPrice() < 10)
            return null;
        if (product.getExpireTime().before(new Date()))
            return null;
        return product;
    }
}
