package com.la.objectmaster;

public class ObjectMasterTest {

	public static void main(String[] args) {

		Human human = new Human("Leif");
		Wizard wizard = new Wizard("Authman");
		Ninja ninja = new Ninja("Shiraz");
		Samurai samurai1 = new Samurai("Matt");
		Samurai samurai2 = new Samurai("Phil");
		
		human.showHealth();
		wizard.showHealth();
		ninja.showHealth();
		samurai1.showHealth();
		samurai2.showHealth();
		
		System.out.println("There are currently " + Samurai.howMany() + " Samurai at the Dojo.");
		
		human.attack(samurai1);
		wizard.attack(samurai2);
		ninja.attack(samurai2);
		samurai1.deathBlow(human);
		samurai1.meditate();
		human.showHealth();
		ninja.runAway();
		ninja.runAway();
		ninja.steal(wizard);
		ninja.showHealth();
		wizard.fireball(ninja);
		wizard.heal(wizard);
		ninja.showHealth();
		wizard.showHealth();
		samurai2.deathBlow(ninja);
		samurai1.deathBlow(wizard);
		ninja.showHealth();
		wizard.showHealth();
		samurai1.showHealth();
		samurai2.showHealth();
	}
}
