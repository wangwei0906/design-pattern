package com.wei.designpattern.creation.builder;

import com.wei.designpattern.creation.builder.pojo.Product;

/*
 * description:
 * author: W W
 * date：2020-12-16 16:28
 * */
public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Product construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getResult();
    }
}
