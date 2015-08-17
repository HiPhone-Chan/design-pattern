package com.chf.design.pattern.action.memento.v2;

public class Client {

    private Resource resource;

    private Caretaker caretaker;

    public Client() {
        resource = new Resource();
        caretaker = new Caretaker();
    }

    public void freeze() {
        caretaker.setMemento(resource.backupStatus());
        resource.setStatus(Status.FROZEN);
    }

    public void recover() {
        resource.restoreStatus(caretaker.getMemento());
    }

    @Override
    public String toString() {
        return "Client [resource=" + resource + "]";
    }

    public static void main(String[] args) {
        Client c = new Client();
        System.out.println(c);
        c.freeze();
        System.out.println(c);
        c.recover();
        System.out.println(c);
    }

}
