package com.zookeeper.mammal;

public class Gorilla extends Mammal {
	public int eatBanana(){
		this.energyLevel += 10;
		System.out.println("Gorilla ate a banana");
		return this.energyLevel;
	}
	
	public int climb() {
		this.energyLevel -= 10;
		System.out.println("Gorilla climbed a tree");
		return this.energyLevel;
	}
	
	public int throwSomething() {
		this.energyLevel -= 5;
		System.out.println("Gorilla has thrown something");
		System.out.println(this.displayEnergy());
		return this.energyLevel;
	}
}
