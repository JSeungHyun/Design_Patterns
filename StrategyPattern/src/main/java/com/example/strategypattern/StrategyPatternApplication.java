package com.example.strategypattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategyPatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyPatternApplication.class, args);

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println("================== ModelDuck ==============");
        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.setQuackBehavior(new MuteQuack());
        modelDuck.performQuack();
    }

}
