package main;

import model.Dog;

//Class Main to launch de application
public class Main {
	public static void main(String[] args) {
		// Create an object dog
		Dog myDog = new Dog("Lassie", 10);

		// call dog methods
		myDog.eat(); // method from superclass Animal
		myDog.play(); // method from interface Pet
		myDog.play(); // method from interface Pet
		myDog.train(); // method from interface Pet
		myDog.train(); // method from interface Pet
		myDog.train(); // method from interface Pet
		myDog.makeSound(); // override method from superclass Animal
		// show all data
		System.out.println(myDog.getName() + " tiene " + myDog.getAge() + " años y adiestramiento " + myDog.getTraining());
	}
}
