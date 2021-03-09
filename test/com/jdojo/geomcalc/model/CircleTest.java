package com.jdojo.geomcalc.model;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import org.junit.Before;
import org.junit.Test;



public class CircleTest {
	
	
	@Test
	public void getTheSameValueofPerimeterWhenInvokeGetPerimeter(){
		Circle ct=new Circle(0.);
		assertEquals(0., ct.getPerimeter(),0.001);
			
	}
	
	@Test
	public void getPerimeterTesPassNegativevalue(){
		Circle ct=new Circle(-5);
		assertEquals(-31.4159, ct.getPerimeter(),0.001);
	}
	@Test
	public void cirleHasRadiusProperty() {
		Circle ct=new Circle(0.);
		assertThat(ct, hasProperty("radius"));
	}
	@Test
	//getter 
    public void objectHasCorrectRadiusValue() {
		Circle ct=new Circle(0.);
      assertThat(ct, hasProperty("radius", equalTo(0.0)));
    }
	
	
}

