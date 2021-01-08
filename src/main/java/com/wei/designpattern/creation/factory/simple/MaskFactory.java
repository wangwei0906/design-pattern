package com.wei.designpattern.creation.factory.simple;

import com.wei.designpattern.creation.factory.pojo.HighEndMask;
import com.wei.designpattern.creation.factory.pojo.IMask;
import com.wei.designpattern.creation.factory.pojo.LowEndMask;

/*
 * description:
 * author: W W
 * date：2020-12-16 14:29
 * */
public class MaskFactory {
    public IMask createMask(String type) {
        IMask mask = null;
        if("高端口罩".equals(type)){
            mask = new HighEndMask();
            // .....
            // HighEndMask的100行初始化代码
        }else if("低端口罩".equals(type)){
            mask =  new LowEndMask();
            // .....
            // LowEndMask的100行初始化代码
        }
        return mask;
    }
}
