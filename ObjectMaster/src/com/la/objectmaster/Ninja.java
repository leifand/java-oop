package com.la.objectmaster;

public class Ninja extends Human {
	
	public Ninja() { stealth = 10; }
	public Ninja(String name) {
		this.name = name;
		stealth = 10;
	}
	
	public String showName() {
		return name + " the Ninja";
	}
	
	public void steal(Human target) {
		System.out.println(name + " uses Ninja power to steal 10 health from " + target.showName() + "!");
		health += 10;
		target.health -= 10;
	}

	public void runAway() {
		System.out.println(showName() + " escapes to the shadows, but the effort drains him 10 health!");
		health -= 10;
	}
}
