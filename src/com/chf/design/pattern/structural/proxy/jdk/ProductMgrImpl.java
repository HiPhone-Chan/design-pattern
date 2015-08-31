package com.chf.design.pattern.structural.proxy.jdk;

import java.util.Random;

public class ProductMgrImpl implements ProductMgr {

    /**
     * 
     * @return null if failed
     */
    @Override
    public Product buy() {
        Random r = new Random();
        if (r.nextBoolean()) // 模拟创建产品的可能会失败
            return new Product();
        return null;
    }

}
