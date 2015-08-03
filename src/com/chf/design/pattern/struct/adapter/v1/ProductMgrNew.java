package com.chf.design.pattern.struct.adapter.v1;

public class ProductMgrNew extends ProductMgrOld implements ProductMgr {

    public ProductRsp createProduct(ProductReq req) {
        ProductReqOld oreq = convertReq(req);// req
        ProductRspOld orsp = super.createProduct(oreq);
        ProductRsp rsp = convertResp(orsp);// orsp
        return rsp;
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
