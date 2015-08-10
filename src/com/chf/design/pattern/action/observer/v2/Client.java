package com.chf.design.pattern.action.observer.v2;

public class Client extends Observer {

    @Override
    public void update() {
        System.out.println("client --- finish");
    }

    public static void main(String[] args) {
        Task t = new Task();
        Client c = new Client();
        t.attach(c);
        t.run();
    }

}
