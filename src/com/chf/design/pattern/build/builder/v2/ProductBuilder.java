package com.chf.design.pattern.build.builder.v2;

public interface ProductBuilder {

    PriceElememt buildPriceElememt();

    Attribute buildAttribute();

    Product getProduct();
}
