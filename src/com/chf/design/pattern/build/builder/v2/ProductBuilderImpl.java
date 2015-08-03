package com.chf.design.pattern.build.builder.v2;

public class ProductBuilderImpl implements ProductBuilder {

    @Override
    public PriceElememt buildPriceElememt() {
        return new PriceElememt();
    }

    @Override
    public Attribute buildAttribute() {
        return new Attribute();
    }

    @Override
    public Product getProduct() {
        Product product = new Product();
        product.setPriceElememt(buildPriceElememt());
        product.setAttribute(buildAttribute());
        return product;
    }

}
