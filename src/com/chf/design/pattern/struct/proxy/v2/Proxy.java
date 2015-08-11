package com.chf.design.pattern.struct.proxy.v2;

public class Proxy implements ProductMgr {

    private ProductMgr productMgr;

    public static int RETRY_TIMES = 3;

    /**
     * 
     * @return null if failed
     */
    @Override
    public Product buy() {
        Product product = null;
        for (int i = 0; i < RETRY_TIMES; i++) {
            System.out.println("proxy");
            product = productMgr.buy();

            if (product != null) {
                break;
            } else {
                // clean
            }
        }
        return product;
    }

    // set ProductMgrImpl
    public void setProductMgr(ProductMgr productMgr) {
        this.productMgr = productMgr;
    }

}
