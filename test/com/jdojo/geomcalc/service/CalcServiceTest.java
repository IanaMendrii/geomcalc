package com.jdojo.geomcalc.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalcServiceTest {
	
	
	@Test
	public void InputValidatingObjIsExistWhatCalcServiceObjCreated() {
		CalcService cs=new CalcService();
	assertNotNull(InputValidator.class);
	}
	@Test
	public void getNameFromMapReturnTheSameString() {
		CalcService cs=new CalcService();
		assertEquals("Circle",cs.getNameFromMap(1));
		assertEquals("Square",cs.getNameFromMap(2));
		assertEquals("Rectangle",cs.getNameFromMap(3));
		assertEquals("Triangle",cs.getNameFromMap(4));
	}
		
	@Test
    public void arrayParamHasSizeOf3WhenTriangleCreated() {
		CalcService cs=new CalcService();
		double[] paramTest=cs.getParamFromMap(4);
		assertEquals(3,paramTest.length);
    }
	
}
