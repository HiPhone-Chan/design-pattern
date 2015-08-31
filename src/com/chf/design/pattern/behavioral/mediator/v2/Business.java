package com.chf.design.pattern.behavioral.mediator.v2;

public class Business extends Colleague {

    private String msg;

    public void sendMsg2Portal(String msg) {
        mediator.sendMsg2Portal(msg);
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
