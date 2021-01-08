package com.wei.designpattern.structure.adapter.example;

/*
 * description:
 * author: W W
 * date：2020-12-16 20:22
 * */
public class HttpController implements Controller {

    public void doHttpHandler() {
        System.out.println("http....");
    }

}
