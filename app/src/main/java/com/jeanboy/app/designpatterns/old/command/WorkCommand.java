package com.jeanboy.app.designpatterns.old.command;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class WorkCommand implements Command {

    private Receiver receiver;

    public WorkCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute(String desc) {
        receiver.action(desc);
    }
}
