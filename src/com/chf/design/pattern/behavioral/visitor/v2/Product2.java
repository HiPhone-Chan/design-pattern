package com.chf.design.pattern.behavioral.visitor.v2;

public class Product2 extends Product {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitProduct2(this);
    }
}
