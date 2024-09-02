package com.example.strategypattern;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }

    @Override
    void display() {
        System.out.println("고무 오리");
    }
}
