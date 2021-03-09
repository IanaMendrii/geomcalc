package com.jdojo.geomcalc.client;

import java.util.Scanner;

import com.jdojo.geomcalc.model.Shape;
import com.jdojo.geomcalc.service.CalcService;
import com.jdojo.geomcalc.service.InputValidator;
import com.jdojo.geomcalc.writer.Writer;

public class Main {
	
	public static void main(String[] args) {
		System.out.print("Welcome to Geometry Calculator\n");
		InputValidator iv=new InputValidator();
		CalcService cs=new CalcService();
		boolean keyGlobal = true;
		while (keyGlobal) {
			int key=cs.getMainMenu();
			Shape sh = null;
			sh = cs.createNewShape(key);
			double perimeter=sh.getPerimeter();
			double area =sh.getArea();
			cs.printScreen(sh.getClass().getSimpleName(),perimeter,area);
			keyGlobal=iv.finalizing();
		}
		System.out.println("Goodbye");
	}
	
		


	
}

	
