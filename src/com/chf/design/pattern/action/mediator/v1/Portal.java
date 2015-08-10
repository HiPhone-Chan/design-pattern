package com.chf.design.pattern.action.mediator.v1;

public class Portal {

    private Business business;

    private Resources resources;

    private String msg;

    public void sendMsg2Business(String msg) {
        business.setMsg(msg);
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
