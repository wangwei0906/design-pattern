package com.wei.designpattern.structure.adapter.example;

/*
 * description:
 * author: W W
 * date：2020-12-16 20:27
 * */
public class HttpHandlerAdapter implements HandlerAdapter {

    @Override
    public boolean supports(Object handler) {
        return handler instanceof HttpController;
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}
