package com.chf.design.pattern.behavioral.observer.v1;

public class Task extends Thread {

    public static int FINISH = 0;

    public static int UNFINISH = 1;

    private int status;

    public Task() {
        status = UNFINISH;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            status = FINISH;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getStatus() {
        return status;
    }

}
