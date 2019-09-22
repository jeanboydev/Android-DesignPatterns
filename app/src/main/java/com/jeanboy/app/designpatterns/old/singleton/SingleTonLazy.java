package com.jeanboy.app.designpatterns.old.singleton;

/**
 * 懒汉式
 * <p>
 * 优点：在需要的时候才去加载
 * 缺点：在多线程的环境下，会出现线性不安全的情况
 * <p>
 * Created by jeanboy on 2016/12/19.
 */

public class SingleTonLazy {

    private static SingleTonLazy instance = null;

    private SingleTonLazy() {
    }

    public static synchronized SingleTonLazy getInstance() {
        if (instance == null) {
            instance = new SingleTonLazy();
        }
        return instance;
    }

    /**
     * 加锁方式
     * 优点：解决了线性同步问题
     * 缺点：每次调用都要判断同步锁，导致效率低
     *  public static synchronized SingleTonLazy getInstance() {
     *      if (instance == null) {
     *         instance = new SingleTonLazy();
     *      }
     *      return instance;
     *   }
     *
     * 加双重锁
     * 优点：在并发量不高、安全性不高的情况下可以很好的运行
     * 缺点：在不同的编译环境下可能出现不同的问题
     *  public static SingleTonLazy getInstance() {
     *      if (instance == null) {
     *          synchronized(SingleTonLazy.class){
     *               if (instance == null) {
     *                  instance = new SingleTonLazy();
     *               }
     *          }
     *      }
     *      return instance;
     *   }
     */

}
