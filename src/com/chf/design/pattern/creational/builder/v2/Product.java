package com.chf.design.pattern.creational.builder.v2;

public class Product {

    private String productId;

    private PriceElememt priceElememt;

    private Attribute attribute;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public PriceElememt getPriceElememt() {
        return priceElememt;
    }

    public void setPriceElememt(PriceElememt priceElememt) {
        this.priceElememt = priceElememt;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    @Override
    public String toString() {
        return "Product [productId=" + productId + ", priceElememt="
                + priceElememt + ", attribute=" + attribute + "]";
    }

}
