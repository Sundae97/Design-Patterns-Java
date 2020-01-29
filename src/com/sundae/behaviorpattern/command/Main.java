package com.sundae.behaviorpattern.command;

/**
 * 命令模式  -  Command Pattern
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        Add add = new Add(manager);
        Update update = new Update(manager);
        Delete delete = new Delete(manager);

        Committer committer = new Committer();
        committer.addCommand(delete);
        committer.addCommand(add);
        committer.addCommand(update);
        committer.commit();
    }
}
