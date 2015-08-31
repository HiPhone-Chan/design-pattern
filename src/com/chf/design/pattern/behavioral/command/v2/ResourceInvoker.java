package com.chf.design.pattern.behavioral.command.v2;

public class ResourceInvoker {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run() {
        command.execute();
    }

}
