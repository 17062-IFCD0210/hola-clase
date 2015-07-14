package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testRound() {
		float n = (float)0.49999999997;
		assertTrue( (float)0.5 == Utilidades.round(n,2) );
	}

	
	/**
	 * Comprueba si está ordenado
	 * @param vector array ordenado
	 * @param orden Si es 0 el orden es ascendente, si es 1 es descendente
	 */
	@Test
	public void testOrdenar() {
		
		final int[] VECTOR={3, 55, 0, 9, -2, 14};
		
		int[] vectorOrdenado;
		
		vectorOrdenado = Utilidades.ordenarArray(VECTOR, Utilidades.ASCENDENTE);
		for (int i=0 ; i<vectorOrdenado.length-1 ; i++){
			assertTrue(vectorOrdenado[i] + " es menor que " + vectorOrdenado[i+1] + "\n", vectorOrdenado[i] < vectorOrdenado[i+1]);
		}
		
		vectorOrdenado=null;
		vectorOrdenado = Utilidades.ordenarArray(VECTOR, Utilidades.DESCENDENTE);
		for (int i=0 ; i<vectorOrdenado.length-1 ; i++){
			assertTrue(vectorOrdenado[i] + " es mayor que " + vectorOrdenado[i+1] + "\n", vectorOrdenado[i] > vectorOrdenado[i+1]);
		}

		//Descendente
		//assertTrue(vectorOrdenado[i] + " es mayor que " + vectorOrdenado[i+1] + "\n", vectorOrdenado[i] > vectorOrdenado[i+1]);
	
	}
	
}
