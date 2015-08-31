package com.chf.design.pattern.behavioral.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("client --- finish");
    }

    public static void main(String[] args) {
        Task t = new Task();
        Client c = new Client();
        t.addObserver(c);
        t.run();
    }

}
