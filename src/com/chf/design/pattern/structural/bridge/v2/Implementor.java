package com.chf.design.pattern.structural.bridge.v2;

public abstract class Implementor {

    public abstract String createOrderId();

    public abstract OrderInfo createOrder(String orderId);
}
