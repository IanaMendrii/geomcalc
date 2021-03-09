package com.jdojo.geomcalc.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;


import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(Parameterized.class)
public class ParameterizedTestCircle {

	// fields used together with @Parameter must be public
	@Parameter(0)
	public double radius;
	@Parameter(1)
	public double perimeter;
	@Parameter(2)
	public double area;
	
	
	// creates the test data
	@Parameters
	public static Collection<Object[]> radiusResultPair() {
		Object[][] data = new Object[][] { { 0, 0,0 }, { 5, 31.4159,78.5398 },{-5, -31.4159,78.5398}};
		return Arrays.asList(data);
	}
	

	@Test
	public void getTheSameValueofPerimeterWhenInvokeGetPerimeter() {
		Circle ct = new Circle(radius);
		assertEquals(perimeter, ct.getPerimeter(), 0.001);
	}
	@Test
	public void getTheSameValueofAreaWhenInvokeGetArea() {
		Circle ct = new Circle(radius);
		assertEquals(area, ct.getArea(), 0.001);
	}
	

}