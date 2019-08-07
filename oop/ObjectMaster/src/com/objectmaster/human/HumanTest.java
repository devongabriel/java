package com.objectmaster.human;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Human Greg = new Human();
		
//		Greg.attack(Greg);
		
		Wizard Shawn = new Wizard();
		Shawn.fireball(Greg);
		Shawn.heal(Shawn);
		
		
	}

}
