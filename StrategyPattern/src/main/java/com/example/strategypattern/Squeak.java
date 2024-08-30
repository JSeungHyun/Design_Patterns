package com.example.strategypattern;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("쁶쁶");
    }
}
