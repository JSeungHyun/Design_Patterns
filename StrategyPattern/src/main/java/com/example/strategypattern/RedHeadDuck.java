package com.example.strategypattern;

public class RedHeadDuck extends Duck{
    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("붉은 머리 오리");
    }
}
