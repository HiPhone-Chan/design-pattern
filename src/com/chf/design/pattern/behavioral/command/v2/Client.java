package com.chf.design.pattern.behavioral.command.v2;

public class Client {

    private Receiver receiver;

    public void openResource() {
        OpenResourceCmd cmd = new OpenResourceCmd();
        cmd.setReceiver(receiver);

        ResourceInvoker invoker = new ResourceInvoker();
        invoker.setCommand(cmd);
        invoker.run();
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public static void main(String[] args) {
        Client c = new Client();
        c.setReceiver(new Receiver());

        c.openResource();
    }
}
