package com.chf.design.pattern.action.observer.v1;

public class Client {

    public void op() {
        Task t = new Task();
        t.start();

        while (t.getStatus() != Task.FINISH) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("client --- unfinish");
        }

        System.out.println("client --- finish");
    }
    
    public static void main(String[] args) {
        Client c = new Client();
        c.op();
    }
}
