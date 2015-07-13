package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestArrays {

	@Test
	public void testArrays() {
		
		int[] miArray = new int[10];
		
		miArray[4] = 666;
		
		assertEquals(10, miArray.length);
		
		assertEquals(666, miArray[4]);
		assertEquals(0, miArray[7]);
		
	}

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testExcepcion() {
		
		int[] miArray = new int[10];
		
		assertEquals(0, miArray[11]);
		
		
	}

}
