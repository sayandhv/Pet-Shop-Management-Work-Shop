package com.bridgelaz.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to pet management system");
		
		Animal dog = new Dog("D001");
		dog.age = 4;
		dog.breed = "German";
		dog.price = 1000;
		
		Animal dog1 = new Dog("D001");
		dog1.age = 4;
		dog1.breed = "German";
		dog1.price = 1000;
		
		Bird duck = new Duck("DK001");
		duck.age = 2;
		duck.species = "Indian";
		duck.price = 100;
		
		Bird parrot = new Parrot("P001");
		parrot.age = 3;
		parrot.species = "African";
		parrot.price = 150;
		
		Animal rabbit = new Rabbit("R001");
		rabbit.age = 7;
		rabbit.breed = "Bangali";
		rabbit.price = 1000;
		
		Animal cat = new Cat("C001");
		cat.age = 4;
		cat.breed = "bhoomi";
		cat.price = 80;
		
		PetStorage petStorage = new PetStorage();
		petStorage.add(cat);
		petStorage.add(dog);
		petStorage.add(dog1);
		petStorage.add(duck);
		petStorage.add(parrot);
		petStorage.add(rabbit);
		
		UserInterface userInterface = new UserInterface();
		//userInterface.print(petStorage.getPetList()); 
		Set petList = petStorage.getPetList();
		userInterface.print(petList);
		
		petStorage.remove(cat);	
		System.out.println("After removing");
		petList = petStorage.getPetList();
		userInterface.print(petList);
		
		System.out.println("Animals are");
		userInterface.printAnimals(petList);
		
		System.out.println("Birds are");
		userInterface.printBirds(petList);
		
		userInterface.printSwimmable(petList);	
		userInterface.printFlyable(petList);
	}
}
