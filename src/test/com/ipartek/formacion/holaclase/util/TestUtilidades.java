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
		int[] nAscendente = Utilidades.ordenar(n.clone() , Utilidades.ASCENDENTE);
		int[] nDescendente = Utilidades.ordenar(n.clone() , Utilidades.DESCENDENTE);

		assertEquals(-2, nAscendente[0]);
		assertEquals( 0, nAscendente[1]);
		assertEquals( 3, nAscendente[2]);
		assertEquals( 9, nAscendente[3]);
		assertEquals(14, nAscendente[4]);
		assertEquals(55, nAscendente[5]);
			
		assertEquals(55, nDescendente[0]);
		assertEquals(14, nDescendente[1]);
		assertEquals( 9, nDescendente[2]);
		assertEquals( 3, nDescendente[3]);
		assertEquals( 0, nDescendente[4]);
		assertEquals(-2, nDescendente[5]);
	}
	
}