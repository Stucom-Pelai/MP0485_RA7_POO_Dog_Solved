package model;

import main.Pet;

//Class Dog (subclass from Animal and implements Pet)
public class Dog extends Animal implements Pet {
	int training;

	public Dog(String name, int age) {
		super(name, age);
	}		

	public int getTraining() {
		return training;
	}

	public void setTraining(int training) {
		this.training = training;
	}

	@Override
	public void makeSound() {
		System.out.println(name + " está ladrando");
	}

	@Override
	public void play() {
		System.out.println(name + " está jugando");
		training+=1;
	}

	@Override
	public void train() {
		System.out.println(name + " esta entrenando");
		training+=3;
	}
}
