package com.wei.designpattern.structure.adapter.example;

/*
 * description:
 * author: W W
 * date：2020-12-16 20:25
 * */
public class SimpleHandlerAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return handler instanceof SimpleController;
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimplerHandler();
    }
}
