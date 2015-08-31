package com.chf.design.pattern.behavioral.memento.v2;

import com.chf.design.pattern.behavioral.memento.v2.Status;

public class Memento {
    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
