package com.objectmaster.human;

public class Samurai extends Human {
	static int totalSamurai = 0;
	int health = 200;
	
	public Samurai() {
		totalSamurai += 1;
	}
	
	public void deathBlow(Human human) {
		human.health = 0;
		this.health = this.health/2;
		System.out.println("Samurai has killed another player and reduced their health by half");
	}
	public void meditate(Human human) {
		this.health += (this.health/2);
		System.out.println("By meditating, the Samurai has been healed and increased half of their health");
	}
	public void howMany() {
		System.out.println("There are " + Samurai.totalSamurai + "Samurai's");
	}
}
