package com.chf.design.pattern.struct.bridge.v2;

public class OrderMgrImpl extends OrderMgr {

    public OrderInfo createOrder() {

        String orderId = implementor.createOrderId();
        OrderInfo orderInfo = implementor.createOrder(orderId);
        return orderInfo;
    }
}
