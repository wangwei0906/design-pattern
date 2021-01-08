package com.wei.designpattern.structure.adapter.class_adapter;

/*
 * description:
 * author: W W
 * date：2020-12-16 19:28
 * */
public class Client {
    public static void main(String[] args) {
        System.out.println(" === 类适配器模式 ===");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
