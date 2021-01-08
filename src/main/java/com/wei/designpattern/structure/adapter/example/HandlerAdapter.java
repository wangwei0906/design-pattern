package com.wei.designpattern.structure.adapter.example;

/*
 * description:
 * author: W W
 * date：2020-12-16 20:25
 * */
public interface HandlerAdapter {
    public boolean supports(Object handler);

    public void handle(Object handler);
}
