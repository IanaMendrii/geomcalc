package com.jdojo.geomcalc.service;
import static org.mockito.Mockito.when;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.Test;

public class CalcServiceSpy {
	@Test
	public void getMainMenuReturnTheSamevalueAsgetKeyReturn() {
		InputValidator iv = new InputValidator();

		InputValidator spyiv = spy(iv);

		doReturn(1).when(spyiv).getKey();
		CalcService cs = new CalcService();
		assertEquals(1, cs.getMainMenu());
	}
	@Test
	public void getParamFormMapReturnThesameArray() {
		InputValidator iv = new InputValidator();
		InputValidator spyiv = spy(iv);
		when(spyiv.getParam()).thenReturn(1.);
		CalcService cs = new CalcService();
		assertEquals(1.,cs.getParamFromMap(1));
	}
}