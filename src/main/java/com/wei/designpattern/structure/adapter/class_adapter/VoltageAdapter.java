package com.wei.designpattern.structure.adapter.class_adapter;

/*
 * description: 适配器模式
 * author: W W
 * date：2020-12-16 19:26
 * */
public class VoltageAdapter extends Valtage220V implements IVoltage5V{

    @Override
    public int output5V() {
        int desc=output220v()/44;
        System.out.println("电压 = " + desc + "伏");
        return desc;
    }

}
