package com.wei.designpattern.creation.factory.factory_method;

import com.wei.designpattern.creation.factory.pojo.HighEndMask;
import com.wei.designpattern.creation.factory.pojo.IMask;

/*
 * description:高端口罩工厂
 * author: W W
 * date：2020-12-16 14:42
 * */
public class HignEndMaskFactory implements IMaskFactory {

    @Override
    public IMask createMask() {
        return new HighEndMask();
    }

}
