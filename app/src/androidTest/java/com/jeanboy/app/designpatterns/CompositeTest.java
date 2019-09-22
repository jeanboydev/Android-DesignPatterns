package com.jeanboy.app.designpatterns;

import com.jeanboy.app.designpatterns.old.composite.TreeNode;

import org.junit.Test;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class CompositeTest {

    @Test
    public void testComposite() {

        TreeNode root=new TreeNode("root");

        TreeNode nodeA=new TreeNode("A");
        TreeNode nodeB=new TreeNode("B");

        nodeA.addChildren(nodeB);
        root.addChildren(nodeA);
    }
}
