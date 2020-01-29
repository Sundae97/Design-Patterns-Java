package com.sundae.behaviorpattern.command;

public class Delete implements Command {
    private Manager receiver;

    public Delete(Manager receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.delete();
    }
}
