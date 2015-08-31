package com.chf.design.pattern.behavioral.mediator.v2;

public class MediatorA extends Mediator {

    private Portal portal;

    private Business business;

    private Resources ressources;

    @Override
    public void sendMsg2Portal(String msg) {
        portal.setMsg(msg);
    }

    @Override
    public void sendMsg2Business(String msg) {
        business.setMsg(msg);
    }

    @Override
    public void sendMsg2Ressources(String msg) {
        ressources.setMsg(msg);
    }

}
