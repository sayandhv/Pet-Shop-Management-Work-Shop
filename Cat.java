package com.bridgelaz.petshop;

public class Cat extends Animal {
	public Cat(String id) {
		this.id = id;
		name = "Cat";
		colour = Colour.BLACK_WHITE;
	}
	
	@Override
	public void eat() {
		System.out.println("Cats eat fish");
	}
}
