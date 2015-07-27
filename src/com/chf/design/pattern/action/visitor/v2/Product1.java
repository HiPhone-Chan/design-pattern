package com.chf.design.pattern.action.visitor.v2;

public class Product1 extends Product {

    private String address;

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProduct1(this);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
