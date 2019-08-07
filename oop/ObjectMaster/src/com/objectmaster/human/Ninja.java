package com.objectmaster.human;

public class Ninja extends Human {
	
	int stealth = 10;
	public void runAway(Human human) {
		human.health -= 10;
		System.out.println("Ninja has run away with the human's health" + human.health);
	}
	public void steal(Human human) {
		human.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("You have stolen another human's health" + human.health);
		
	}
}
