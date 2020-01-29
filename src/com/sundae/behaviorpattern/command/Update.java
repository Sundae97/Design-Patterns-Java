package com.sundae.behaviorpattern.command;

public class Update implements Command {
    private Manager receiver;

    public Update(Manager receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exec() {
        receiver.update();
    }
}
