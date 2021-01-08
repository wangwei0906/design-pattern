package com.wei.designpattern.creation.factory.pojo;

/*
 * description:
 * author: W W
 * date：2020-12-16 14:37
 * */
public class LowEndMask implements IMask {
    @Override
    public void show() {
        System.out.println("低端口罩");
    }
}
