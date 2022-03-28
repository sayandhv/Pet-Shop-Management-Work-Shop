package com.bridgelaz.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UserInterface {
	public void print(Set<Pet> petList) {
		/*for(int i = 0;i < petList.size();i++) {
			System.out.println("Pet list is:" +petList.get(i));*/
		
		 for(Object o: petList) {
			 System.out.println(o);
		}		
	}
	
	//obj instanceof Animal
	public void printAnimals(Set<Pet> petList) {
		for(Pet o: petList) {
			if(o instanceof Animal) {
				System.out.println("Animals are: "+o);
			}
		}
	}
	
	public void printBirds(Set<Pet> petList) {
		for(Pet o: petList) {
			if(o instanceof Bird) {
				System.out.println("Birds are:" +o);
			}
		}
	}
	
	public void printSwimmable(Set<Pet> petList) {
		for(Pet pet: petList) {
			if(pet instanceof Swimmable) {
				Swimmable swimmablePets = (Swimmable)pet;
				swimmablePets.swim();
			}
		}
	}
	
	public void printFlyable(Set<Pet> petList) {
		for(Pet pet: petList) {
			if(pet instanceof Flyable) {
				Flyable flyablePets = (Flyable)pet;
				flyablePets.fly();
			}
		}
	}
}
