package com.jdojo.geomcalc.service;

import java.io.IOException;

import java.util.Scanner;


public class InputValidator {
	private Scanner scanner=new Scanner(System.in);
	
	
	public int getKey() {
		int key;
		try {
			if (scanner.hasNextInt()) {
				key = scanner.nextInt();
				if (key == 0) {
					System.out.println("Goodbye");
				System.exit(0);
				}
					
				if (key < 0 || key > 4) {
					throw new IllegalArgumentException("Only numbers 0-4 are allowed");
				} 

			} else {
				scanner.next();
				throw new IOException("An invalid expression.Enter the number from 0 to 4");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			return getKey();
		} catch (IllegalArgumentException e1) {
			System.out.println(e1.getMessage());
			return getKey();
		}
		return key;
	}
	
	
	public double getParam() {
		double p;
		try {
			if (scanner.hasNextDouble()) {
				p = scanner.nextDouble();
				if (p < 0) {
					throw new IllegalArgumentException("Negative values are not allowed");
				} 
			} else {
				scanner.next();
				throw new IOException("An invalid expression.Enter positive value");
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
			return getParam();
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			return getParam();

		}
		return p;	

	}
	public boolean finalizing() {
	boolean keyGlobal;
	System.out.println("Press 0 to exit or any key to continue");
    String a = scanner.next();
	keyGlobal = (a.equals("0") ? false : true);
	if(! keyGlobal)scanner.close();
	return keyGlobal;
	}
}
