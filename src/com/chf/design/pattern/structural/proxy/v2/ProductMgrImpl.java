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
        if (r.nextBoolean()) // ģ�ⴴ����Ʒ�Ŀ��ܻ�ʧ��
            return new Product();
        return null;
    }

}
