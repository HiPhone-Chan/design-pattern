package com.chf.design.pattern.struct.bridge.v2;

public abstract class Implementor {

    public abstract String createOrderId();

    public abstract OrderInfo createOrder(String orderId);
}
