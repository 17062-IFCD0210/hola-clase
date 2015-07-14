package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestArrayList {


	@Test
	public void test() {
		ArrayList<Integer> listaEnteros = new ArrayList <Integer>();
		
		assertEquals("lista vac�a", 0, listaEnteros.size());
		
		listaEnteros.add(0);
		listaEnteros.add(1);
		listaEnteros.add(2);
		
		//Comprobar que se inserta al final
		assertTrue( "Comprobar que se inserta al final",
				2 == listaEnteros.get(listaEnteros.size()-1) );
		
		//insertar en una posici�n concreta
		listaEnteros.add(1, 44); //Insertar el 44 en la posici�n 1
		assertTrue(44 == listaEnteros.get(1));
		assertEquals(4, listaEnteros.size());
		
	}
}
