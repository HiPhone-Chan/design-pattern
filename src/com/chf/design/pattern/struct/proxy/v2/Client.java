package com.chf.design.pattern.struct.proxy.v2;

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
        Proxy proxy = new Proxy();
        proxy.setProductMgr(new ProductMgrImpl());
        c.setProductMgr(proxy);
        c.op();
    }

}
