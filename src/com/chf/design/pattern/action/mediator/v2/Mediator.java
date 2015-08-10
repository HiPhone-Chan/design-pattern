package com.chf.design.pattern.action.mediator.v2;

public abstract class Mediator {
    public abstract void sendMsg2Portal(String msg);

    public abstract void sendMsg2Business(String msg);

    public abstract void sendMsg2Ressources(String msg);
}
