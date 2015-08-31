package com.chf.design.pattern.behavioral.interpreter.v1;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(calculator.add(1, 2), 3);
        System.out.println(result);
    }

}
