package com.wei.designpattern.creation.factory.abstract_factory;

import com.wei.designpattern.creation.factory.pojo.HighEndMask;
import com.wei.designpattern.creation.factory.pojo.HighEndProtectiveSuit;
import com.wei.designpattern.creation.factory.pojo.IMask;
import com.wei.designpattern.creation.factory.pojo.IProtectiveSuit;

/*
 * description:高端工程
 * author: W W
 * date：2020-12-16 15:02
 * */
public class HighEndFactory implements IFactory {
    @Override
    public IMask createMask() {
        IMask mask =  new HighEndMask();
        // .....
        // HighEndMask的100行初始化代码
        return mask;
    }

    @Override
    public IProtectiveSuit createSuit() {
        IProtectiveSuit suit =  new HighEndProtectiveSuit();
        // .....
        //  HighEndProtectiveSuit的100行初始化代码
        return suit;
    }
}
