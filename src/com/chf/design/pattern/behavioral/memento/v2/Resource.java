package com.chf.design.pattern.behavioral.memento.v2;

public class Resource {

    private Status status;

    public Resource() {
        status = Status.OPEN;
    }

    public void restoreStatus(Memento memento) {
        status = memento.getStatus();
    }

    public Memento backupStatus() {
        Memento memento = new Memento();
        memento.setStatus(status);
        return memento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Resource [status=" + status + "]";
    }

}
