package com.wei.designpattern.creation.factory.abstract_factory;

import com.wei.designpattern.creation.factory.pojo.IMask;
import com.wei.designpattern.creation.factory.pojo.IProtectiveSuit;
import com.wei.designpattern.creation.factory.pojo.LowEndMask;
import com.wei.designpattern.creation.factory.pojo.LowEndProtectiveSuit;

/*
 * description: 低端工厂
 * author: W W
 * date：2020-12-16 15:01
 * */
public class LowEndFactory implements IFactory{
    @Override
    public IMask createMask() {
        IMask mask =  new LowEndMask();
        // .....
        //  LowEndMask的100行初始化代码
        return mask;
    }

    @Override
    public IProtectiveSuit createSuit() {
        IProtectiveSuit suit =  new LowEndProtectiveSuit();
        // .....
        //  LowEndProtectiveSuit的100行初始化代码
        return suit;
    }
}
