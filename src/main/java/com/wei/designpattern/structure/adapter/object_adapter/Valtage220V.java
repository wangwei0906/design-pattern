package com.wei.designpattern.structure.adapter.object_adapter;

/*
 * description: 输出220V电压
 * author: W W
 * date：2020-12-16 19:21
 * */
public class Valtage220V {

    public int output220v(){
        int src=220;
        System.out.println("电压 = "+src+"伏");
        return src;
    }

}
