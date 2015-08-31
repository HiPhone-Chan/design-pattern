package com.chf.design.pattern.behavioral.memento.v1;

public class Resource {

    private Status status;

    private Status backupStatus;

    public Resource() {
        status = Status.OPEN;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void restoreStatus() {
        status = backupStatus;
    }

    public void backupStatus() {
        backupStatus = status;
    }

    @Override
    public String toString() {
        return "Resource [status=" + status + "]";
    }

}
