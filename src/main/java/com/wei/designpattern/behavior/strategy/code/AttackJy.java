package com.wei.designpattern.behavior.strategy.code;

/*
 * description:
 * author: W W
 * date：2020-12-03 20:10
 * */
public class AttackJy implements IAttackBehavior {

    @Override
    public void attack() {
        System.out.println("九阳神功！");
    }
}
