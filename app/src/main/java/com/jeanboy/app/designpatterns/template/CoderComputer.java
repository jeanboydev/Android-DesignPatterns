package com.jeanboy.app.designpatterns.template;

/**
 * Created by jeanboy on 2016/12/19.
 */

public class CoderComputer extends AbstractComputer {

    @Override
    protected void login() {
        System.out.println("码农只需要进行用户和密码验证就可以了");
    }
}
