package com.chf.design.pattern.action.command.v2;

public class OpenResourceCmd implements Command {

    private Receiver receiver;

    @Override
    public void execute() {
        receiver.open();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

}
