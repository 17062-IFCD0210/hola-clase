package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testRound() {
		
		float n = (float)0.49999999997;		
		assertTrue( (float)0.50 == Utilidades.round(n , 2 ) );
				
	}

	@Test
	public void testOrdenar() {
		int[] n = new int[]{3, 55, 0, 9, -2, 14};
		Utilidades.ordenar(n, 0);
		

		assertEquals(-2, n[0]);
		assertEquals( 0, n[1]);
		assertEquals( 3, n[2]);
		assertEquals( 9, n[3]);
		assertEquals(14, n[4]);
		assertEquals(55, n[5]);
			
		Utilidades.ordenar(n, 1);
		assertEquals(55, n[0]);
		assertEquals(14, n[1]);
		assertEquals( 9, n[2]);
		assertEquals( 3, n[3]);
		assertEquals( 0, n[4]);
		assertEquals(-2, n[5]);
	}
	
}
