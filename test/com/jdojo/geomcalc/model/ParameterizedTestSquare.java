package com.jdojo.geomcalc.model;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

public class ParameterizedTestSquare {
	// fields used together with @Parameter must be public
		@Parameter(0)
		public double side;
		@Parameter(1)
		public double perimeter;
		@Parameter(2)
		public double area;
		
		
		// creates the test data
		@Parameters
		public static Collection<Object[]> ParamResultPair() {
			Object[][] data = new Object[][] { { 0, 0,0 }, { 5, 20,25 } };
			return Arrays.asList(data);
		}
		

		@Test
		public void getTheSameValueofPerimeterWhenInvokeGetPerimeter() {
			Square st = new Square(side);
			assertEquals(perimeter, st.getPerimeter(), 0.001);
		}
		@Test
		public void getTheSameValueofAreaWhenInvokeGetArea() {
			Square st = new Square(side);
			assertEquals(area, st.getArea(), 0.001);
		}
}
