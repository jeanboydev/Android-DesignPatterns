package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.old.flyweight.Target;
import com.jeanboy.app.designpatterns.old.flyweight.TargetFactory;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/21.
 */

public class FlyweightTest {

    private String[] nameArr = new String[]{"1", "2", "3", "4", "5"};

    @Test
    public void testFlyweight() {
        for (int i = 0; i < 20; ++i) {
            Target target = TargetFactory.getTarget(getRandomName());
            System.out.println("获取到对象: " + target.toString());
        }
    }

    private String getRandomName() {
        return nameArr[(int) (Math.random() * nameArr.length)];
    }
}