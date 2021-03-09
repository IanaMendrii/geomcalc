package com.jdojo.geomcalc.service;

import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class ScannerMock {
	@Rule
	public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();
	@Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

	@Test
	public void getKeyReturnTheSameValueWhenNumber1In() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("1");
		assertEquals(1, iv.getKey());
	}

	@Test
	public void getKeyInvokeSystemExitWhenZeroInput() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("0");
		exit.expectSystemExitWithStatus(0);
		iv.getKey();
	}

	@Test(expected = IOException.class)
	public void getKeyThrowIOExceptionWhenNotIntegerIn() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("any");
		iv.getKey();

	}

	@Test(expected = IllegalArgumentException.class)
	public void getKeyThrowIllegalArgumentExceptionWhenValueNotEqual1234() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("8");
		iv.getKey();

	}

	@Test(expected = NoSuchElementException.class)
	public void getKeyThrowNoSuchElementExceptionWhenValueNotEqual1234() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("8");
		iv.getKey();

	}

	@Test
	public void getParamReturnTheSameValueWhenPositiveValueInput() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("1.5");
		assertEquals(1.5, iv.getParam(), 0.001);
	}

	@Test(expected = IOException.class)
	public void getParamThrowIOExceptionWhenNotNumberInput() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("any");
		iv.getParam();

	}

	@Test(expected = IllegalArgumentException.class)
	public void getParamThrowIllegalArgumentExceptionWhenNagativeValueInput() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("-8");
		iv.getParam();

	}
	@Test
	public void finalizingReturnfalseWhenZeroInput() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("0");
		assertFalse(iv.finalizing());
	}
	@Test
	public void finalizingReturnThrueWhenNotZeroInput() {
		InputValidator iv = new InputValidator();
		systemInMock.provideText("any");
		assertTrue(iv.finalizing());
	}
}
