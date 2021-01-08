package com.wei.designpattern.structure.adapter.object_adapter;

/*
 * description:
 * author: W W
 * date：2020-12-16 19:31
 * */
public class VoltageAdapter implements IVoltage5V {
    Valtage220V valtage220V;

    @Override
    public int output5V() {
        int dstV = 0;
        if (valtage220V != null) {
            // 获取220V 电压
            int src = valtage220V.output220v();
            System.out.println("使用对象适配器，进行适配～～");
            dstV = src / 44;
            System.out.println("适配完成，输出的电压为 = " + dstV);
        }
        return dstV;
    }

    public VoltageAdapter(Valtage220V valtage220V){
        this.valtage220V=valtage220V;
    }
}
