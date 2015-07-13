package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestArrays {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		
		int[] miArray = new int[10];
		miArray[4] = 25;
		
		assertEquals( 10, miArray.length );
		assertEquals( 25, miArray[4]);
		assertEquals( 0, miArray[7]);
		
		
		assertEquals( 0, miArray[11]);
	}
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	
	public void testExcepcion() {
		
		int[] miArray = new int[10];
		assertEquals(0, miArray[11] );
	}
		
	
	
}
