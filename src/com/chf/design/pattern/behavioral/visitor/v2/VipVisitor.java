package com.chf.design.pattern.behavioral.visitor.v2;

import com.chf.design.pattern.behavioral.visitor.v2.Product1;
import com.chf.design.pattern.behavioral.visitor.v2.Product2;

public class VipVisitor extends Visitor {

    public void visitProduct1(Product1 product) {
        System.out.println("VipVisitor");
        System.out.println(product.getName());
        System.out.println(product.getDetail());
        System.out.println(product.getAddress());
        System.out.println(product.getPrice() * 0.9f);
    }

    public void visitProduct2(Product2 product) {
        System.out.println("VipVisitor");
        System.out.println(product.getName());
        System.out.println(product.getDetail());
        System.out.println(product.getPrice() * 0.9f);
    }
}
