package com.chf.design.pattern.structural.adapter.v2;

import com.chf.design.pattern.structural.adapter.v2.ProductReq;
import com.chf.design.pattern.structural.adapter.v2.ProductReqOld;
import com.chf.design.pattern.structural.adapter.v2.ProductRsp;
import com.chf.design.pattern.structural.adapter.v2.ProductRspOld;

public class ProductMgrNew extends ProductMgr {

    private ProductMgrOld productMgr;

    public ProductRsp createProduct(ProductReq req) {
        ProductReqOld oreq = convertReq(req);// req
        ProductRspOld orsp = productMgr.createProduct(oreq);
        ProductRsp rsp = convertResp(orsp);// orsp
        return rsp;
    }

    public ProductMgrOld getProductMgr() {
        return productMgr;
    }

    public void setProductMgr(ProductMgrOld productMgr) {
        this.productMgr = productMgr;
    }

    private ProductReqOld convertReq(ProductReq req) {
        ProductReqOld productReqOld = new ProductReqOld();
        // conver req to old req
        return productReqOld;
    }

    private ProductRsp convertResp(ProductRspOld resp) {
        ProductRsp rsp = new ProductRsp();
        // conver old resp to resp
        return rsp;
    }

}
