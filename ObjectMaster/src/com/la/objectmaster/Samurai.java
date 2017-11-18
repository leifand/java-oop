package com.la.objectmaster;

public class Samurai extends Human {
	
	private static int countOfSamurai = 0;
	
	public Samurai(String name) {
		super(name, 200);
		countOfSamurai++;
	}
	
	public String showName() {
		return "Samurai " + name;
	}
	
	public static int howMany() { return countOfSamurai; }
	
	public void meditate() {
		System.out.println(showName() + " meditates, healing for " + (health/2) + " hit points!");
		health += (health/2);
	}
	
	public void deathBlow(Human target) {
		System.out.println(showName() + " strikes " + target.showName() + " with DEATH BLOW for " + target.health + " damage!");
		System.out.println(showName() + " staggers from the effort!");
		target.health = 0;
		health = health/2;
	}
}
