package com.objectmaster.human;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human Greg = new Human();
		
//		Greg.attack(Greg);
		
		Wizard Shawn = new Wizard();
		Shawn.fireball(Greg);
		Shawn.heal(Shawn);
		
		
		Wizard Alex = new Wizard();
		Samurai Kaysee = new Samurai();
		Samurai Jack = new Samurai();
		Ninja Cameron = new Ninja();
		
		Alex.fireball(Kaysee);
		Alex.heal(Jack);
		Kaysee.deathBlow(Jack);
		Cameron.steal(Jack);
		Cameron.runAway(Alex);
		
	}

}
