package com.chf.design.pattern.behavioral.visitor.v2;

import com.chf.design.pattern.behavioral.visitor.v2.Product1;
import com.chf.design.pattern.behavioral.visitor.v2.Product2;

public abstract class Visitor {
    public abstract void visitProduct1(Product1 product);

    public abstract void visitProduct2(Product2 product);
}
