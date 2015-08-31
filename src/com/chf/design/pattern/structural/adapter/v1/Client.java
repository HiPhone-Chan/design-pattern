package com.chf.design.pattern.structural.adapter.v1;

public class Client {

    private ProductMgr productMgr;

    // new ProductMgrNew
    public void setProductMgr(ProductMgr productMgr) {
        this.productMgr = productMgr;
    }

    public ProductRsp op() {
        return productMgr.createProduct(new ProductReq());
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.setProductMgr(new ProductMgrNew());
        ProductRsp rsp = c.op();
        System.out.println(rsp);
    }

}
