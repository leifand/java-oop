package com.la.objectmaster;

public class Wizard extends Human {
	
	public Wizard() { 
		intelligence = 8;
		health = 50;
	}
	public Wizard(String name) {
		this.name = name;
		intelligence = 8;
		health = 50;
	}
	
	public String showName() {
		return name + " the Wizard";
	}
	
	public void heal(Human target) {
		System.out.println(showName() + " heals " + target.showName() + intelligence + " hit points!");
		target.health += intelligence;
	}
	
	public void fireball(Human target) {
		System.out.println(showName() + " throws a FIREBALL at " + target.showName() + " for " + (intelligence * 3) + " damage!");
		target.health -= (intelligence * 3);
	}
}
