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
        if (r.nextBoolean()) // ģ�ⴴ����Ʒ�Ŀ��ܻ�ʧ��
            return new Product();
        return null;
    }

}
