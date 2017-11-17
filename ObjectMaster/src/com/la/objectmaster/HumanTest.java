package com.la.objectmaster;

public class HumanTest {

	public static void main(String[] args) {

		Human h1 = new Human("Authman");
		Human h2 = new Human("Caleb");
		h1.showHealth();
		h2.attack(h1);;
		h1.showHealth();
	}
}
