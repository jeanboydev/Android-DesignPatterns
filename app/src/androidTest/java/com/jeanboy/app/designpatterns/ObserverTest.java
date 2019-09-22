package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.old.observer.MySubject;
import com.jeanboy.app.designpatterns.old.observer.Observer1;
import com.jeanboy.app.designpatterns.old.observer.Observer2;
import com.jeanboy.app.designpatterns.old.observer.Subject;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/23.
 */

public class ObserverTest {

    @Test
    public void testObserver(){
        Subject sub = new MySubject();
        sub.add(new Observer1());
        sub.add(new Observer2());
        sub.operation();
    }
}
