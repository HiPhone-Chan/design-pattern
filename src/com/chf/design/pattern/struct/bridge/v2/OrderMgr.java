package com.chf.design.pattern.struct.bridge.v2;

import com.chf.design.pattern.struct.bridge.v2.OrderInfo;

public abstract class OrderMgr extends Abstraction {

    public abstract OrderInfo createOrder();
}
