package com.chf.design.pattern.action.mediator.v2;

public class Portal extends Colleague {

    private String msg;

    public void sendMsg2Business(String msg) {
        mediator.sendMsg2Business(msg);
    }

    public void sendMsg2Ressources(String msg) {
        mediator.sendMsg2Ressources(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
