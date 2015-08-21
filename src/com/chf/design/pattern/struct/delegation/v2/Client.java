package com.chf.design.pattern.struct.delegation.v2;

import com.chf.design.pattern.struct.delegation.v1.Admin;

public class Client {
    public static void main(String[] args) throws Exception {

        Operator operator1 = new Operator();
        operator1.setTarget(new Admin());

        operator1.exe("adminOp", new Object[0]);
        operator1.operatorOp();

    }
}
