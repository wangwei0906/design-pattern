package com.wei.designpattern.structure.adapter.object_adapter;


import com.wei.designpattern.structure.adapter.object_adapter.Valtage220V;

/*
 * description:
 * author: W W
 * date：2020-12-16 19:36
 * */
public class Client {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.charging(new VoltageAdapter(new Valtage220V()));
    }
}
