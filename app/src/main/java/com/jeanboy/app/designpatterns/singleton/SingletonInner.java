package com.jeanboy.app.designpatterns.singleton;

/**
 * 内部类
 * <p>
 * 优点：延迟加载、线性安全、减少内存消耗
 * 缺点：与编程语言本身的特性相关，很多面向对象语言不支持IoDH
 * <p>
 * Created by jeanboy on 2016/12/19.
 */

public class SingletonInner {

    /**
     * 私有构造器
     */
    private SingletonInner() {
    }

    /**
     * 内部类实现单例模式
     * 延迟加载，减少内存开销
     */
    private static class SingletonHolder {
        private static SingletonInner instance = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonHolder.instance;
    }
}
