package com.wei.designpattern.behavior.strategy.code;

/*
 * description:
 * author: W W
 * date：2020-12-03 20:20
 * */
public abstract class Role {
    protected String name;
    protected IDefendBehavior defendBehavior;
    protected IAttackBehavior attackBehavior;
    protected IRunBehavior runBehavior;
    protected IDisplayBehavior displayBehavior;


    public String getName() {
        return name;
    }


    public IDefendBehavior getDefendBehavior() {
        return defendBehavior;
    }

    public void setDefendBehavior(IDefendBehavior defendBehavior) {
        this.defendBehavior = defendBehavior;
    }

    public IAttackBehavior getAttackBehavior() {
        return attackBehavior;
    }

    public void setAttackBehavior(IAttackBehavior attackBehavior) {
        this.attackBehavior = attackBehavior;
    }

    public IRunBehavior getRunBehavior() {
        return runBehavior;
    }

    public void setRunBehavior(IRunBehavior runBehavior) {
        this.runBehavior = runBehavior;
    }

    public IDisplayBehavior getDisplayBehavior() {
        return displayBehavior;
    }

    public void setDisplayBehavior(IDisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
    }


    protected void display(){
        displayBehavior.display();
    }

    protected void run(){
        runBehavior.run();
    }

    protected void defend(){
        defendBehavior.befend();
    }

    protected void attack(){
        attackBehavior.attack();
    }
}
