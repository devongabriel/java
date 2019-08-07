package com.objectmaster.human;

public class Human {
	
	public int strength = 3;
	public int stealth = 3;
	public int intelligence = 3;
	public int health = 100;
	
	public void attack(Object Human) {
		Human.this.health -= this.strength;
		System.out.println("Human has been attacked");
		System.out.println("Human health is: " + health);
	}
	
}
