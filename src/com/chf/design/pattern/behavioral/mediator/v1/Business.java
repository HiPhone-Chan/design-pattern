package com.chf.design.pattern.behavioral.mediator.v1;

public class Business {

    private Portal portal;

    private Resources resources;

    private String msg;

    public void sendMsg2Portal(String msg) {
        portal.setMsg(msg);
    }

    public void sendMsg2Resources(String msg) {
        resources.setMsg(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
