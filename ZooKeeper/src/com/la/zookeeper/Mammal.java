package com.la.zookeeper;

public class Mammal {
	
	protected int energyLevel = 100;
	
	public Mammal() {;}
	public Mammal(int energy) { this.setEnergy(energy); }
	public int getEnergy() { return energyLevel;	}
	public void setEnergy(int energy) {	this.energyLevel = energy; }
	
	public int displayEnergy() {
		System.out.println("Mammal energy level: " + energyLevel);
		return energyLevel;
	}
}
