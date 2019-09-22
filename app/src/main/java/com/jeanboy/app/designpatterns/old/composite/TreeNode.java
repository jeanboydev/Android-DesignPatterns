package com.jeanboy.app.designpatterns.old.composite;

import java.util.Vector;

/**
 * Created by jeanboy on 2017/3/22.
 */

public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void addChildren(TreeNode node){
        children.add(node);
    }

    public void removeChildren(TreeNode node){
        children.remove(node);
    }

    public Vector<TreeNode> getChildren() {
        return children;
    }
}
