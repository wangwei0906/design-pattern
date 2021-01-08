package com.wei.designpattern.creation.factory.pojo;

/*
 * description:
 * author: W W
 * date：2020-12-16 14:57
 * */
public class LowEndProtectiveSuit implements IProtectiveSuit {
    @Override
    public void showSuit() {
        System.out.println("低端防护服");
    }
}
