package com.jdojo.geomcalc.writer;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import com.jdojo.geomcalc.model.Shape;

public class Writer {
	public static void printScreen(Shape sh) {
		System.out.println("Calculation result for "+sh.getClass().getSimpleName()+":");
		System.out.printf("Perimeter is: %.4f%n", sh.getPerimeter());
		System.out.printf("Area is: %.4f%n", sh.getArea());

	}

	public static void printToFile(Shape sh) {
		String prFile = "Shape.txt";
		try (PrintStream pr=new PrintStream( new FileOutputStream(prFile, true))){
			pr.println();
			pr.printf("Shape: %s%n", sh.getClass().getSimpleName());
			pr.printf("Perimeter: %.4f%n", sh.getPerimeter());
			pr.printf("Area: %.4f%n", sh.getArea());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}
