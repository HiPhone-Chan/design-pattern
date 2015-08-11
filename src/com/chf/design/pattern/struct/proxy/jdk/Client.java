package com.chf.design.pattern.struct.proxy.jdk;

public class Client {

    private ProductMgr productMgr;

    public void op() {
        Product product = productMgr.buy();

        if (product == null) {
            // roll back or retry in proxy
            // do anything else
        } else {
            // do someting if success
            System.out.println("client");
        }
    }

    // set Proxy
    public void setProductMgr(ProductMgr productMgr) {
        this.productMgr = productMgr;
    }

    public static void main(String[] args) {
        Client c = new Client();
        MyProxy proxy = new MyProxy(new ProductMgrImpl());
        c.setProductMgr(proxy.getInstance());
        c.op();
    }

}
