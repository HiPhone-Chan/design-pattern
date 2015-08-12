package com.chf.design.pattern.action.responsibilitychain.v2;

public abstract class Filter {

    protected Filter successor;

    public abstract Product handleRequest(Product product);

    public boolean check(Product product) {
        return (successor == null) && (product == null);
    }

    public Filter getSuccessor() {
        return successor;
    }

    public void setSuccessor(Filter successor) {
        this.successor = successor;
    }

}
