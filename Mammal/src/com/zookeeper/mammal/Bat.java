package com.zookeeper.mammal;

public class Bat extends Mammal{
	int energyLevel = 300;

	public int fly() {
		this.energyLevel -= 50;
		System.out.println("heeeeeeeee");
		return this.energyLevel;
	}
	public int eatHumans() {
		this.energyLevel += 25;
		System.out.println("eating scrumptious humans");
		return this.energyLevel;
	}
	public int attackTown() {
		this.energyLevel -= 100;
		System.out.println("attacking the towns people");
		return this.energyLevel;
	}
}
