package com.chf.design.pattern.structural.bridge.v2;

public abstract class Abstraction {

    protected Implementor implementor;

    public Implementor getImplementor() {
        return implementor;
    }

    public void setImplementor(Implementor implementor) {
        this.implementor = implementor;
    }

}
