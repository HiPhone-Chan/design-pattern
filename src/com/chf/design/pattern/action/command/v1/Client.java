package com.chf.design.pattern.action.command.v1;

public class Client {

    public void openResource() {
        // operation of opening resource
        System.out.println("open");
    }

    public static void main(String[] args) {
        Client c = new Client();

        c.openResource();
    }
}
