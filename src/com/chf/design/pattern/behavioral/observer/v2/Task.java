package com.chf.design.pattern.behavioral.observer.v2;

import java.util.ArrayList;
import java.util.List;

public class Task extends Subject {

    public static int FINISH = 0;

    public static int UNFINISH = 1;

    private int status;

    private List<Observer> observers;

    public Task() {
        status = UNFINISH;
        observers = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void run() {
        try {
            int i = 0;
            while (i < 5000) {
                Thread.sleep(1000);
                i += 1000;
                System.out.println("task --- unfinish");
            }
            notifyObserver();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getStatus() {
        return status;
    }

}
