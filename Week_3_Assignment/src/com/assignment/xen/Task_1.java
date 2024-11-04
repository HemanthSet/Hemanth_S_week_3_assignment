package com.assignment.xen;

class Vehicle {

	public void start() {
		System.out.println("The Vehicle is Starting..");
	}

	public void stop() {

		System.out.println("The Vehicle is Stoping..");

	}

}

class Car extends Vehicle {

	public void start() {

		System.out.println("The Car is starting using key..");

	}

	public void stop() {

		System.out.println("The Car is stopping using brake..");

	}

}

class Bike extends Vehicle {

	public void start() {

		System.out.println("The Bike is starting using button..");

	}

	public void stop() {

		System.out.println("The Bike is stopping using key.. ");

	}
}

public class Task_1 {

	public static void main(String[] args) {

		Vehicle car = new Car();
		Vehicle bike = new Bike();

		car.start();
		bike.start();

	}

}