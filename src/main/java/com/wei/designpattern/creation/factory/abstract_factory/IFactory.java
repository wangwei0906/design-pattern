package com.wei.designpattern.creation.factory.abstract_factory;

import com.wei.designpattern.creation.factory.pojo.IMask;
import com.wei.designpattern.creation.factory.pojo.IProtectiveSuit;

/*
 * description:
 * author: W W
 * date：2020-12-16 14:59
 * */
public interface IFactory {
    IMask createMask();

    IProtectiveSuit createSuit();
}
