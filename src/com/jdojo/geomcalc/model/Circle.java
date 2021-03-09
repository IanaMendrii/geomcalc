package com.jdojo.geomcalc.model;

public class Circle implements Shape  {
	public static final String NAME = "Circle";
	public double getRadius() {
		return radius;
	}

	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getPerimeter() {
		return radius * 2 * Math.PI;
	}

	public double getArea() {
		//if (radius<0.) return 0;
		return Math.pow(radius, 2) * Math.PI;
	}

}
