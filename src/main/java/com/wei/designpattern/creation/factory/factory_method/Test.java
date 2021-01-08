package com.wei.designpattern.creation.factory.factory_method;

import com.wei.designpattern.creation.factory.pojo.IMask;

/*
* description:
* author: W W
* date：2020-12-16 14:44
* */
public class Test {
    public static void main(String[] args) {
        IMaskFactory factoryA = new LowEndMaskFactory();
        IMaskFactory factoryB = new HignEndMaskFactory();
        IMask maskA = factoryA.createMask();
        IMask maskB = factoryB.createMask();
        maskA.show();
        maskB.show();
    }
}
