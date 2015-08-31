package com.chf.design.pattern.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyProxy {

    public static int RETRY_TIMES = 3;

    private ProductMgr productMgr;

    private MyInvocationHandler invocationHandler;

    public MyProxy(ProductMgr productMgr) {
        invocationHandler = new MyInvocationHandler();
        this.productMgr = productMgr;
    }

    private class MyInvocationHandler implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args)
                throws Throwable {
            Object result = null;
            for (int i = 0; i < RETRY_TIMES; i++) {
                System.out.println("proxy");
                result = method.invoke(productMgr, args);

                if (result != null) {
                    break;
                } else {
                    // clean
                }
            }
            return result;
        }

    }

    public ProductMgr getInstance() {

        return (ProductMgr) Proxy.newProxyInstance(productMgr.getClass()
                .getClassLoader(), new Class[] { ProductMgr.class },
                invocationHandler);
    }
}
