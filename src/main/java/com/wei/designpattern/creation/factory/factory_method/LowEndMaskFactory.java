package com.wei.designpattern.creation.factory.factory_method;

import com.wei.designpattern.creation.factory.pojo.IMask;
import com.wei.designpattern.creation.factory.pojo.LowEndMask;

/*
 * description: 低端口罩工厂
 * author: W W
 * date：2020-12-16 14:43
 * */
public class LowEndMaskFactory implements IMaskFactory{
    @Override
    public IMask createMask() {
        return new LowEndMask();
    }
}
