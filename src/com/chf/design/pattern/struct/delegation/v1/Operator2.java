package com.chf.design.pattern.struct.delegation.v1;

public class Operator2 {

    private Admin admin;

    public Operator2(Admin admin) {
        this.admin = admin;
    }

    public void operatorOp() {
        System.out.println("Operation for Operator.");
    }

    public void adminOp() {
        admin.adminOp();
    }

}
