package com.chf.design.pattern.behavioral.observer.v2;

public abstract class Subject {

    public abstract void attach(Observer observer);

    public abstract void dettach(Observer observer);

    public abstract void notifyObserver();

}
