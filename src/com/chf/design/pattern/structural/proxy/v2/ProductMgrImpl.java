package com.chf.design.pattern.structural.proxy.v2;

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
