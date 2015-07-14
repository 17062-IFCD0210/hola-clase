package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUtilidades {
	
	public static final int[] A_AORDENAR = { 3, 55, 0, 9, -2, 14};

	@Test
	public void testRound() {
		float n = (float)0.499999997;
		
		assertTrue((float)0.50 == Utilidades.round(n, 2));
	}

	
	@Test
	public void testOrdenar() {
		
		int[] aOrdenado = new int[A_AORDENAR.length];
		aOrdenado = Utilidades.ordenar(A_AORDENAR, 0);
		
		
		
	}

}
