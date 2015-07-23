package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

public class TestArrayList {

	@Test
	public void test() {
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();

		assertEquals("Lista vacia", 0, listaEnteros.size());

		listaEnteros.add(0);
		listaEnteros.add(1);
		listaEnteros.add(2);

		// Comprobar que se insertan al final

		assertTrue("Comprobar que se insertan al final",
				2 == listaEnteros.get((listaEnteros.size() - 1)));

		listaEnteros.add(1, 4);

		// Insertar en una posicion concreta
		assertTrue(4 == listaEnteros.get(1));
		assertEquals(4, listaEnteros.size());

	}

}