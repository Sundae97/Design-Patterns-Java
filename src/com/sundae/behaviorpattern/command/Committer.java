package com.sundae.behaviorpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Committer {
    private List<Command> commandList = new ArrayList<>();

    public void addCommand(Command command){
        commandList.add(command);
    }

    public void commit(){
        for (Command command : commandList)
            command.exec();
        commandList.clear();
    }
}
