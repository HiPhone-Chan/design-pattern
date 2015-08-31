package com.chf.design.pattern.behavioral.visitor.v2;

import com.chf.design.pattern.behavioral.visitor.v2.Product1;
import com.chf.design.pattern.behavioral.visitor.v2.Product2;

public class CommonVisitor extends Visitor {
    public void visitProduct1(Product1 product) {
        System.out.println("CommonVisitor");
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }

    public void visitProduct2(Product2 product) {
        System.out.println("CommonVisitor");
        System.out.println(product.getName());
        System.out.println(product.getPrice());
    }
}
