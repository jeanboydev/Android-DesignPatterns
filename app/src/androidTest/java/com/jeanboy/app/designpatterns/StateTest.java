package com.jeanboy.app.designpatterns;


import com.jeanboy.app.designpatterns.old.state.StartState;
import com.jeanboy.app.designpatterns.old.state.StopState;
import com.jeanboy.app.designpatterns.old.state.Target;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class StateTest {

    @Test
    public void testObserver(){
        Target target=new Target();

        StartState startState=new StartState();
        startState.doAction(target);

        StopState stopState=new StopState();
        stopState.doAction(target);

        System.out.println(target.getState().toString());
    }
}
