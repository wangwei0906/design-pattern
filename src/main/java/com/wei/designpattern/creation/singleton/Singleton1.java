package com.wei.designpattern.creation.singleton;

/*
 * description:单例模式--饿汉式
 * 优点：实现简单，避免了线程同步问题
 * 缺点：类加载的会后就完成了实例化，造成内存浪费
 *
 *
 * author: W W
 * date：2020-12-03 21:14
 * */
public class Singleton1 {
    private Singleton1(){}
    private static Singleton1 instance=new Singleton1();

    public static Singleton1 getInstance(){
        return instance;
    }
}
