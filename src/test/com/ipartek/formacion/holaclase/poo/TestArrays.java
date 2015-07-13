package com.ipartek.formacion.holaclase.poo;
import static org.junit.Assert.*;

import org.junit.Test;


public class TestArrays {

	@Test
	public void testArray() {
		
		int[] miArray = new int[10];
		
		miArray[4]=25;
		
		assertEquals(10, miArray.length);
		assertEquals(25, miArray[4]);
		//las posiciones vacias estan inicializadas a 0, porque son enteros
		assertEquals(0, miArray[7]);
			
	}

	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void testExcepcion() {
		
		int[] miArray = new int[10];
	
		//probaremos que al acceder fuera de los limites nos da una excepcion
		assertEquals(0, miArray[11]);
		

	}
}
