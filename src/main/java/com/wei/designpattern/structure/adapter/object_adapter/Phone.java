package com.wei.designpattern.structure.adapter.object_adapter;

import com.wei.designpattern.structure.adapter.object_adapter.IVoltage5V;

/*
 * description:
 * author: W W
 * date：2020-12-16 19:28
 * */
public class Phone {

    public void charging(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V() == 5) {
            System.out.println("电压为5V，可以充电～～");
        } else if (iVoltage5V.output5V() > 5) {
            System.out.println("电压大于5V，不能充电～～");
        }
    }

}
