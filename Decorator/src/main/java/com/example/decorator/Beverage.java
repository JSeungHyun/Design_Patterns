package com.example.decorator;

public abstract class Beverage {
    String description = "제목 X";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
