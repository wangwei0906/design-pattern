package com.wei.designpattern.structure.adapter.example;

/*
 * description:
 * author: W W
 * date：2020-12-17 14:14
 * */
public class AnnotationAdapter implements HandlerAdapter{
    @Override
    public boolean supports(Object handler) {
        return handler instanceof AnnotationController;
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}
