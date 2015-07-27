package com.chf.design.pattern.action.visitor.v1;

public class Client {

    private Product1 product1;

    private Product2 product2;

    public void show(Object visitor) {

        if (visitor instanceof CommonVisitor) {
            CommonVisitor v = (CommonVisitor) visitor;
            v.visitProduct1(product1);
            v.visitProduct2(product2);
        } else if (visitor instanceof VipVisitor) {
            VipVisitor v = (VipVisitor) visitor;
            v.visitProduct1(product1);
            v.visitProduct2(product2);
        }
    }
}
