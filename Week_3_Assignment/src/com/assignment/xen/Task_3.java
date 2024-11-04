package com.assignment.xen;

interface Animal {

	void makeSound();

}

abstract class Mammal implements Animal {

	abstract void walk();

	public void makeSound() {
		System.out.println("Blar Blar");
	}
}

class Dog extends Mammal {

	void walk() {
		System.out.println("Dog is walking..");
	}

	public void makeSound() {
		System.out.println("Dog is bark..");
	}

}

class Cat extends Mammal {

	void walk() {

		System.out.println("Cat is walking..");

	}

	public void makeSound() {

		System.out.println("Cat is meow..");

	}

}

public class Task_3 {

	public static void main(String[] args) {

		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.walk();
		dog.makeSound();

		cat.walk();
		cat.makeSound();

	}

}
