package com.wei.designpattern.creation.builder.pojo;

/*
 * description: 产品角色类，构建者模式的必备要素之一
 * author: W W
 * date：2020-12-16 15:39
 * */
public class Product {
    private String partA;
    private String partB;
    private String partC;
    public void setPartA(String partA) {
        this.partA = partA;
    }
    public void setPartB(String partB) {
        this.partB = partB;
    }
    public void setPartC(String partC) {
        this.partC = partC;
    }
    public void show() {
        System.out.println(partA+"----"+partB+"----"+partC);
    }
}
