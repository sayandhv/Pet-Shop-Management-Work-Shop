package com.bridgelaz.petshop;

public class Duck extends Bird implements Swimmable, Flyable {
	public Duck(String id ) {
		this.id = id;
		name = "Duck";
		colour = Colour.RED;	
	}
	
	@Override
	public void eat() {
		System.out.println("Ducks eat small fish");
	}
	
	public void swim() {
		System.out.println("Duck can swim");
	}
	
	public void fly() {
		System.out.println("Ducks can fly");
	}	
}
