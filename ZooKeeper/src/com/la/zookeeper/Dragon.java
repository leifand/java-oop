package com.la.zookeeper;

public class Dragon extends Mammal {
	
	public Dragon() {
		super(300);
	}
	
	public void fly() {
		System.out.println("WHOOSH, the Dragon takes flight, expending 50 energy.");
		energyLevel -= 50;
	}
	
	public void eatHuman() {
		System.out.println("SQUISHY CRUNCH, the Dragon ate a human, gaining 25 energy.");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("ROAR, CRACKLE, CRISP, the Dragon breathed fire on the town, expending 100 energy.");
		energyLevel -= 100;
	}
}
