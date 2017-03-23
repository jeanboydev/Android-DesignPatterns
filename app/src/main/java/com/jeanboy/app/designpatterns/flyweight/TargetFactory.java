package com.jeanboy.app.designpatterns.flyweight;

import java.util.HashMap;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class TargetFactory {

    private static final HashMap<String, Target> map = new HashMap();

    public static Target getTarget(String name) {
        Target target = map.get(name);
        if (target == null) {
            target = new Target(name);
            map.put(name, target);
            System.out.println("创建新对象: " + name);
        }
        return target;
    }
}
