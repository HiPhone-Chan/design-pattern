package com.chf.design.pattern.behavioral.memento.v1;

public class Client {

    private Resource resource;

    public Client() {
        resource = new Resource();
    }

    public void freeze() {
        resource.backupStatus();
        resource.setStatus(Status.FROZEN);
    }

    public void recover() {
        resource.restoreStatus();
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
