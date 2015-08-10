package com.chf.design.pattern.action.observer.jdk;

import java.util.Observable;

public class Task extends Observable {

    public static int FINISH = 0;

    public static int UNFINISH = 1;

    private int status;

    public Task() {
        status = UNFINISH;
    }

    public void run() {
        try {
            int i = 0;
            while (i < 5000) {
                Thread.sleep(1000);
                i += 1000;
                System.out.println("task --- unfinish");
            }

            setChanged();
            notifyObservers();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getStatus() {
        return status;
    }

}
