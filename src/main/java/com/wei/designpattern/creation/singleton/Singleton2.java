package com.wei.designpattern.creation.singleton;

/*
 * description: 单例模式--懒汉式
 * 优点：懒加载
 * 缺点：需要代码实现同步操作（不想饿汉通过类的加载机制来保证同步），所以代码稍微复杂
 * 注意：要使用 volatile 避免指令重排
 * author: W W
 * date：2020-12-03 21:18
 * */
public class Singleton2 {

    private Singleton2(){}

    private static volatile Singleton2 instace=null;

    public static Singleton2 getInstance(){
        if(instace==null){
            synchronized (Singleton2.class){
                //双重检查锁，确保线程安全
                if(instace==null){
                    instace=new Singleton2();
                }
            }
        }
        return instace;
    }
}
