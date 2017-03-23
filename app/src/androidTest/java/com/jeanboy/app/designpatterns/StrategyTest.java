package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.strategy.number.OperationAdd;
import com.jeanboy.app.designpatterns.strategy.number.OperationMultiply;
import com.jeanboy.app.designpatterns.strategy.number.OperationSubstract;
import com.jeanboy.app.designpatterns.strategy.number.Target;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class StrategyTest {

    @Test
    public void testStrategy(){
        Target target = new Target(new OperationAdd());
        System.out.println("10 + 5 = " + target.executeStrategy(10, 5));

        target = new Target(new OperationSubstract());
        System.out.println("10 - 5 = " + target.executeStrategy(10, 5));

        target = new Target(new OperationMultiply());
        System.out.println("10 * 5 = " + target.executeStrategy(10, 5));
    }
}
