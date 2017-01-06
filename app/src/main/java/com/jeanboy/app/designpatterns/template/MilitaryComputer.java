package com.jeanboy.app.designpatterns.template;

/**
 * Created by jeanboy on 2016/12/19.
 */

public class MilitaryComputer extends AbstractComputer {


    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("进行指纹之别等复杂的用户验证");
    }
}
