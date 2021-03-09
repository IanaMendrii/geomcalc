package com.jdojo.geomcalc.model;

public class Rectangle implements Shape{
	public static final String NAME = "Rectangle";
	double width;
	double height;
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

	public double getPerimeter() {
		return (height+width)*2;
	}
	public double getArea() {
		return height*width;
	}
}
