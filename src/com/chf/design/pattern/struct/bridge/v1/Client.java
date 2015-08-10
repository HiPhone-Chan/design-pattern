package com.chf.design.pattern.struct.bridge.v1;

public class Client {

    private OrderMgr orderMgr;

    public void op() {
        OrderInfo orderInfo = orderMgr.createOrder();
        orderInfo.getOrderId();
    }

    public void setOrderMgr(OrderMgr orderMgr) {
        this.orderMgr = orderMgr;
    }

}
