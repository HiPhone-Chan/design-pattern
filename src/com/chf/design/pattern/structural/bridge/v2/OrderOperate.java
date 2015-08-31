package com.chf.design.pattern.structural.bridge.v2;

import java.util.UUID;

public class OrderOperate extends Implementor {

    @Override
    public String createOrderId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public OrderInfo createOrder(String orderId) {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderId(orderId);
        return orderInfo;
    }

}
