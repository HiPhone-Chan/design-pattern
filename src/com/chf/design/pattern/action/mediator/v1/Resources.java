package com.chf.design.pattern.action.mediator.v1;

public class Resources {

    private Portal portal;

    private Business business;

    private String msg;

    public void sendMsg2Portal(String msg) {
        portal.setMsg(msg);
    }

    public void sendMsg2Business(String msg) {
        business.setMsg(msg);
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
