package com.la.zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {;}
	
	public void throwSomething() {
		System.out.println("Gorilla has thrown something, expending 5 energy.");
		energyLevel -= 5;
	}
	
	public void eatBanana() {
		System.out.println("Gorilla ate a banana, gaining 10 energy. Nom nom nom!");
		energyLevel += 10;
	}
	
	public void climb() {
		System.out.println("Gorilla climed a tree, expending 10 energy.");
		energyLevel -= 10;
	}
}
