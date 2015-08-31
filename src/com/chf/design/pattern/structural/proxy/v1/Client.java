package com.chf.design.pattern.structural.proxy.v1;

public class Client {

    private ProductMgr productMgr;

    public void op() {
        Product product = productMgr.buy();

        if (product == null) {
            // roll back or retry
        } else {
            // do someting if success
        }
    }

    // set ProductMgrImpl
    public void setProductMgr(ProductMgr productMgr) {
        this.productMgr = productMgr;
    }

}
