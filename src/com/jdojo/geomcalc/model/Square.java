package com.jdojo.geomcalc.model;

public class Square implements Shape {
	public static final String NAME = "Square";
	double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public void setParam(double[] param) {
		this.side = param[0];
	}

	public double getPerimeter() {
		return side * 4;
	}

	public double getArea() {
		return Math.pow(side, 2);
	}

}
