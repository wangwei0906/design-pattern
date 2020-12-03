package com.wei.designpattern.behavior.strategy.code;

/*
 * description:
 * author: W W
 * date：2020-12-03 20:31
 * */
public class Test {

    public static void main(String[] args) {
        Role role=new RoleA("张三丰");
        role.setAttackBehavior(new AttackJy());
        role.setDefendBehavior(new DefendTbs());
        role.setRunBehavior(new RunJctq());
        role.setDisplayBehavior(new DisplayA());
        System.out.println(role.name+":");
        role.run();
        role.attack();
        role.defend();
        role.display();
    }

}
