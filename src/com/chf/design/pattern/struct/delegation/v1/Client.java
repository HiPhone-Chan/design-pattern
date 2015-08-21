package com.chf.design.pattern.struct.delegation.v1;

public class Client {
    public static void main(String[] args) {
        Operator1 operator1 = new Operator1();
        operator1.adminOp();
        operator1.operatorOp();

        System.out.println("--------");
        
        Operator2 operator2 = new Operator2(new Admin());
        operator2.adminOp();
        operator2.operatorOp();
    }
}
