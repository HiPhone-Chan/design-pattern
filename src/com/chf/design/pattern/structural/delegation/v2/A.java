package com.chf.design.pattern.structural.delegation.v2;

public class A {

    public static void staticOp() {
        System.out.println("a staticOp");
    }

    public void op() {
        System.out.println("a op");
    }

    public void op(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) throws Exception {
        Delegate b = new Delegate();
        b.setTarget(new A());
        b.exe("op");
        b.exe("staticOp");
        b.exe("op", "hi~~");
    }
}
