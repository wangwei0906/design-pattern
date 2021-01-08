package com.wei.designpattern.creation.builder;

import com.wei.designpattern.creation.builder.pojo.Product;

/*
 * description:
 * author: W W
 * date：2020-12-16 16:30
 * */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
