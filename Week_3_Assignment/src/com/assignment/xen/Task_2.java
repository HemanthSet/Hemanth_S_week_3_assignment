package com.assignment.xen;

class Shape {

	public String name;

	public Shape(String name) {

		this.name = name;

	}

	public String getname() {
		return name;
	}

	public double area() {
		return 0;
	}

}

class Circle extends Shape {

	public double radius;

	public Circle(double radius) {
		super("Circle ");
		this.radius = radius;
	}

	public double area() {
		return Math.PI * radius * radius;

	}

}

class Rectangle extends Shape {
	public double length;
	public double width;

	public Rectangle(double length, double width) {
		super("Rectangle ");
		this.length = length;
		this.width = width;
	}

	public double area() {

		return length * width;

	}

}

class Triangle extends Shape {

	public double base;
	public double height;

	public Triangle(double base, double height) {

		super("Triangle ");
		this.base = base;
		this.height = height;

	}

	public double area() {

		return 0.5 * base * height;

	}

}

public class Task_2 {

	public static void main(String[] args) {

		Circle cir = new Circle(12);
		Rectangle rec = new Rectangle(15, 25);
		Triangle tri = new Triangle(10, 25);

		System.out.println(cir.getname() + "Area" + " " + cir.area());
		System.out.println(rec.getname() + "Area" + " " + rec.area());
		System.out.println(tri.getname() + "Area" + " " + tri.area());

	}

}
