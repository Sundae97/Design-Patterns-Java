package com.sundae.behaviorpattern.command;

public class Add implements Command {
    private Manager receiver;

    public Add(Manager receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.add();
    }
}
