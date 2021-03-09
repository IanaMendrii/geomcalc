package com.jdojo.geomcalc.service;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.arrayWithSize;

import org.junit.Test;



public class ArraysTest {

    private Integer[] ints;

   
    public void setup() {
        ints = new Integer[] {7, 5, 12, 16};
    }

    @Test
    public void arrayHasSizeOf4() {
    	 ints = new Integer[] {7, 5, 12, 16};
        assertThat(ints, arrayWithSize(4));
    }

    @Test
    public void arrayContainsNumbersInGivenOrder() {
    	 ints = new Integer[] {7, 5, 12, 16};
        assertThat(ints, arrayContaining(7, 5, 12, 16));
    }


}
