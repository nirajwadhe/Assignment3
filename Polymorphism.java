package com.cdac.main;

class Character {
	String name;
	String Health;
}

class knights extends Character {

	knights(String name , String Health){
		this.name=name;
		this.Health=Health;
	}
	void abilities() {
		System.out.println("Knights Block Attack");
	}
	
	void show() {
		System.out.println("Name of the Charcater is - "+name);
		System.out.println("Health of the Charcater is - "+Health);
	}
}

class Archer extends Character {

	Archer(String name , String Health){
		this.name=name;
		this.Health=Health;
	}

	void abilities() {
		System.out.println("Archer Shoot Arrow");
	}
	void show() {
		System.out.println("Name of the Charcater is - "+name);
		System.out.println("Health of the Charcater is - "+Health);
	}
}

class Wizard extends Character{

	Wizard(String name , String Health){
		this.name = name;
		this.Health=Health;
	}
	void abilities() {
		System.out.println("Wizard Cast Spells");
	}
	void show() {
		System.out.println("Name of the Charcater is - "+name);
		System.out.println("Health of the Charcater is - "+Health);
	}
}
public class CharacterQ {

	public static void main(String[] args) {
		
//		knights k = new knights("Niraj" ,"100%");
//		k.abilities();
//		k.show();
		
		Archer a = new Archer("Kaustubh" ,"90%");
		a.abilities();
		a.show();
//		
//		Wizard w = new Wizard("Pranjali" ,"80%");
//		w.abilities();
//		w.show();
		
	}

}
