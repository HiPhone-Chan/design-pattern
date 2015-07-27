package com.chf.design.pattern.action.visitor.v2;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private List<Product> productList;

    public Client() {
        productList = new ArrayList<Product>();

        Product1 product1 = new Product1();
        product1.setAddress("huawei");
        product1.setName("product1");
        product1.setPrice(100);
        product1.setDetail("*** this is product1");
        productList.add(product1);
        
        Product product2 = new Product2();
        product2.setName("product2");
        product2.setPrice(200);
        product2.setDetail("*** this is product2");
        productList.add(product2);
    }

    public void show(Visitor visitor) {

        for (Product product : productList) {
            product.accept(visitor);
        }
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.show(new CommonVisitor());
        
        System.out.println("--------------------------");
        
        c.show(new VipVisitor());
    }
}
