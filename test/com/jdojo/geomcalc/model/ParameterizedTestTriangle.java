package com.jdojo.geomcalc.model;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterizedTestTriangle {
	 private double p1;
	 private double p2;
	 private double p3;
	 private double perimeter;
	 private double area;

	    public ParameterizedTestTriangle(double p1, double p2,double p3,double perimeter,double area) {
	        this.p1 = p1;
	        this.p2 = p2;
	        this.p3 = p3;
	        this.perimeter=perimeter;
	        this.area=area;
	    }
	    
	 // creates the test data
	 		@Parameters
	 		public static Collection<Object[]> ParamResultPair() {
	 			Object[][] data = new Object[][] { { 0, 0,0,0,0 }, { 1, 1,1,3,9 } };
	 			return Arrays.asList(data);
	 		}
	 		

	 		@Test
	 		public void getTheSameValueofPerimeterWhenInvokeGetPerimeter() {
	 			Triangle trt = new Triangle(p1,p2,p3);
	 			assertEquals(perimeter, trt.getPerimeter(), 0.001);
	 		}
	 		@Test
	 		public void getTheSameValueofAreaWhenInvokeGetArea() {
	 			Triangle trt = new Triangle(p1,p2,p3);
	 			assertEquals(area, trt.getArea(), 0.001);
	 		}
}
