package com.chf.design.pattern.struct.bridge.v1;

import java.util.UUID;

public class OrderMgrImpl extends OrderMgr {

    public OrderInfo createOrder() {

        OrderInfo orderInfo = new OrderInfo();
        String orderId = UUID.randomUUID().toString();
        orderInfo.setOrderId(orderId);
        return orderInfo;
    }
}
