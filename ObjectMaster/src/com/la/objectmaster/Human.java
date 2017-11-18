package com.la.objectmaster;

public class Human {
	
	protected String name = null;
	protected int strength = 3;
	protected int intelligence = 3;
	protected int stealth = 3;
	protected int health = 100;
	
	public Human() {;}
	public Human(String name) { this.name = name; }
	public Human(String name, int health) { 
		this.name = name;
		this.health = health; 
	}
	
	public String showName() {
		return name + " the Human";
	}
	public void showHealth() { System.out.println(name + " Health: " + health); }
	public void attack(Human target) {
		target.health -= strength;
		System.out.println(showName() + " attacks " + target.showName() + " for " + strength + " damage!");
	}	
}
