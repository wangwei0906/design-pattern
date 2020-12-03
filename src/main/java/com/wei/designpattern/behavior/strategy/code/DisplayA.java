package com.wei.designpattern.behavior.strategy.code;

/*
 * description:
 * author: W W
 * date：2020-12-03 20:36
 * */
public class DisplayA implements IDisplayBehavior {
    @Override
    public void display() {
        System.out.println("样式一");
    }
}
