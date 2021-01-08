package com.wei.designpattern.creation.builder;

import com.wei.designpattern.creation.builder.pojo.Product;

/*
 * description: 抽象建造者（Builder）类，构建者模式必备要素，它是一个包含创建产品各个子部件的抽象方法的接口。
 * author: W W
 * date：2020-12-16 16:25
 * */
public abstract class  Builder {
    //创建产品对象
    protected Product product = new Product();
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();
    //返回产品对象
    public Product getResult() {
        return product;
    }
}
