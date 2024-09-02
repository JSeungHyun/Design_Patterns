package com.example.strategypattern;


public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

    abstract void display();

	public void swim() {
        System.out.println("모든 오리는 물에 뜹니다.\n 가짜오리도 뜨죠");
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
