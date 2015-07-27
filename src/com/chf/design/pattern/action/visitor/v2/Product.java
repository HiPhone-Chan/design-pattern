package com.chf.design.pattern.action.visitor.v2;

public abstract class Product {

    public abstract void accept(Visitor visitor);

    protected String name;

    protected float price;

    protected String detail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
