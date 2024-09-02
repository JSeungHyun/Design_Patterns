package com.example.strategypattern;

public class FlyRocketPowered implements FlyBehavior{
    public FlyRocketPowered() {
        System.out.println("<< 로켓을 이용한 날기 기능 추가 >>");
    }

    @Override
    public void fly() {
        System.out.println("로켓 추진을 이용해 날라갑니다.");
    }
}
