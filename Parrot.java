package com.bridgelaz.petshop;

public class Parrot extends Bird implements Flyable {
	public Parrot(String id) {
		this.id = id;
		name = "Parrot";
		colour = Colour.GREEN;	
	}
	
	@Override
	public void eat() {
		System.out.println("Parrots eat paddy");
	}
	
	public void fly() {
		System.out.println("Parrots can fly");
	}
}
