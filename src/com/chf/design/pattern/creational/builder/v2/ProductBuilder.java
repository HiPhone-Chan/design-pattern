package com.chf.design.pattern.creational.builder.v2;

public interface ProductBuilder {

    PriceElememt buildPriceElememt();

    Attribute buildAttribute();

    Product getProduct();
}
