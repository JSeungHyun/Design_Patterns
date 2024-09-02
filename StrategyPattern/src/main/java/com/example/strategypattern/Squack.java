package com.example.strategypattern;

public class Squack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("삑삑 (( ))");
    }
}
