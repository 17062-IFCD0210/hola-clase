package com.ipartek.formacion.holaclase.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUtilidades {

	@Test
	public void testround() {
		float n = 0.4999997f;
		assertTrue(0.50f == Utilidades.round(n, 2));

		int array[] = { 3, 55, 0, 9, -2, 14 };
		Utilidades.ordenar(array, Utilidades.ASC);

		assertEquals(-2, array[0]);
		assertEquals(0, array[1]);
		assertEquals(3, array[2]);
		assertEquals(9, array[3]);
		assertEquals(14, array[4]);
		assertEquals(55, array[5]);

		Utilidades.ordenar(array, Utilidades.DESC);

		assertEquals(55, array[0]);
		assertEquals(14, array[1]);
		assertEquals(9, array[2]);
		assertEquals(3, array[3]);
		assertEquals(0, array[4]);
		assertEquals(-2, array[5]);

	}

}