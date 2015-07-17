package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testRound() {
		float n = (float)0.49999999997;
		assertTrue( (float)0.5 == Utilidades.round(n,2) );
	}

	
	@Test
	public void testOrdenarHungaros() {
		int[] n = new int[]{3, 55, 0, 9, -2, 14};
		
		//Se envía un clon o copia del array para que la duplique y nos devuelva la dir de memoria donde
		//está esa copia. Si no lo hubiéramos clonado recibiríamos el puntero del array original, o sea desordenado
		//o algo asín
		int[] nAscendente = Utilidades.ordenar( n.clone() , Utilidades.ASCENDENTE);
		int[] nDescendente = Utilidades.ordenar( n.clone() , Utilidades.DESCENDENTE );

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
	
	
	
	/**
	 * Comprueba si está ordenado
	 * @param vector array ordenado
	 * @param orden Si es 0 el orden es ascendente, si es 1 es descendente
	 */
	//Al no clonarlo recibimos el puntero del array original, o sea desordenado. Porque tanto el que trato y el
	//original apuntan al mismo sitio de memoria, o algo así
	@Test
	public void testOrdenarMetodoBurbuja() {
		
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
