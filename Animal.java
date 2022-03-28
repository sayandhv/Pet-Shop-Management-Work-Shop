package com.bridgelaz.petshop;

public abstract class Animal extends Pet {
	String breed;

	@Override
	public String toString() {
		return "Animal [ id=" + id + ", name=" + name + ", colour=" + colour + ", age=" + age
				+ ", price=" + price + ", breed=" + breed +  "]";
	}	
}
