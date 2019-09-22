package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.old.command.Command;
import com.jeanboy.app.designpatterns.old.command.Employee;
import com.jeanboy.app.designpatterns.old.command.Leader;
import com.jeanboy.app.designpatterns.old.command.Receiver;
import com.jeanboy.app.designpatterns.old.command.WorkCommand;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class CommandTest {

    @Test
    public void testCommand() {
        Receiver receiver = new Employee();//创建命令接受者
        Command command = new WorkCommand(receiver);//创建命令
        Leader leader = new Leader(command);//创建命令发送者
        leader.action("去工作");//发送命令
    }
}