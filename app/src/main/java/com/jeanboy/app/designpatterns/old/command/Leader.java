package com.jeanboy.app.designpatterns.old.command;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class Leader implements Receiver {

    private Command command;

    public Leader(Command command) {
        this.command = command;
    }

    @Override
    public void action(String desc) {
        command.execute(desc);
    }
}
