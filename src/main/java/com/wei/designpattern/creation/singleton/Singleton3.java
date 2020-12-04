package com.wei.designpattern.creation.singleton;

/*
 * description:单例模式-内部类实现
 * 优点：避免了线程不安全，延迟加载，效率高
 * author: W W
 * date：2020-12-03 21:26
 * */
public class Singleton3 {
    private Singleton3(){};

    private static  class SingletonHolder{
        private static Singleton3 instance=new Singleton3();
    }

    public static Singleton3 getInstance(){
       return SingletonHolder.instance;
    }
}
