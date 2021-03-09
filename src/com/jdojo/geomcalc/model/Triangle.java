package com.jdojo.geomcalc.model;

public class Triangle implements Shape {

	public static final String NAME = "Triangle";
	double side1;
	double side2;
	double side3;

	public Triangle(double side1,double side2,double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public double getPerimeter() {
		return side1 +side2+side3;
	}

	public double getArea() {
		return Math.pow((side1+side2+side3), 2);
	}
}
