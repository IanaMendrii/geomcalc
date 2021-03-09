package com.jdojo.geomcalc.model;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterizedTsetRectangle {
	 private double p1;
	 private double p2;
	 private double perimeter;
	 private double area;

	    public ParameterizedTsetRectangle(double p1, double p2,double perimeter,double area) {
	        this.p1 = p1;
	        this.p2 = p2;
	        this.perimeter=perimeter;
	        this.area=area;
	    }
	    
	 // creates the test data
	 		@Parameters
	 		public static Collection<Object[]> ParamResultPair() {
	 			Object[][] data = new Object[][] { { 0, 0,0,0 }, { 5, 4,18,20 } };
	 			return Arrays.asList(data);
	 		}
	 		

	 		@Test
	 		public void getTheSameValueofPerimeterWhenInvokeGetPerimeter() {
	 			Rectangle rt = new Rectangle(p1,p2);
	 			assertEquals(perimeter, rt.getPerimeter(), 0.001);
	 		}
	 		@Test
	 		public void getTheSameValueofAreaWhenInvokeGetArea() {
	 			Rectangle rt = new Rectangle(p1,p2);
	 			assertEquals(area, rt.getArea(), 0.001);
	 		}
}
