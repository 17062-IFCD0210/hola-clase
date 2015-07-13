package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Test;

public class TestArrayList {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {

		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		assertEquals("lista vacia",0, listaEnteros.size());
		
		listaEnteros.add(0);
		listaEnteros.add(1);
		listaEnteros.add(2);
		
		//comprobar que se insertan al final
		assertTrue("comprobar que se insertan al final",
					2 == listaEnteros.get((listaEnteros.size()-1)));
		
		//insertar en una posicion concreta
		//queremos meter el cuarenta y cuatro en la posicion 1
		listaEnteros.add(1, 44);
		
		assertEquals(4,listaEnteros.size());
		assertTrue(44 == listaEnteros.get(1));
		
		
		
		
		
		
	}

}
