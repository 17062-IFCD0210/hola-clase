package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testround() {
		float n = (float)0.49999999997;
		
		assertTrue((float)0.50 == Utilidades.round(n,2));
		
	}
	
	@Test
	public void testOrdenar(){
		int[] aDesordenado = {3,55,0,9,-2,14};
		int[] aOrdenado;
		
		aOrdenado=Utilidades.ordenar(aDesordenado,Utilidades.ASCENDENTE);
		assertTrue(-2 == aOrdenado[0]);
		assertTrue(0 == aOrdenado[1]);
		assertTrue(3 == aOrdenado[2]);
		assertTrue(9 == aOrdenado[3]);
		assertTrue(14 == aOrdenado[4]);
		assertTrue(55 == aOrdenado[5]);
/*		
		int[] aEsperado={-2,0,3,14,55};
		assertArrayEquals(aEsperado, aOrdenado);
*/		
		aOrdenado=Utilidades.ordenar(aDesordenado,Utilidades.DESCENDENTE);
		assertTrue(55 == aOrdenado[0]);
		assertTrue(14 == aOrdenado[1]);
		assertTrue(9 == aOrdenado[2]);
		assertTrue(3 == aOrdenado[3]);
		assertTrue(0 == aOrdenado[4]);
		assertTrue(-2 == aOrdenado[5]);
		
		int[] aDesordenado1={1,2,4,3,5,6};
		int[] aOrdenado1;
		aOrdenado1=Utilidades.ordenar(aDesordenado1,Utilidades.DESCENDENTE);
		assertTrue(6 == aOrdenado1[0]);
		assertTrue(5 == aOrdenado1[1]);
		assertTrue(4 == aOrdenado1[2]);
		assertTrue(3 == aOrdenado1[3]);
		assertTrue(2 == aOrdenado1[4]);
		assertTrue(1 == aOrdenado1[5]);		
		
	}
	
	
}
