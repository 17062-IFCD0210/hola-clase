package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestArrayList {


	@Test
	public void test() {
		
		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		assertEquals ("lista vacia", 0, listaEnteros.size() );
		
		listaEnteros.add(0);
		listaEnteros.add(1);
		listaEnteros.add(2);
		
		//comprobar que se insertan hasta el final
		
		assertTrue("Comprobar que se insertan al final", 2 == listaEnteros.get(listaEnteros.size() -1) );
		
		//quiero meter en la posicion 1 el elemento 4
		//insertar en una posicion concreta
		listaEnteros.add(1, 44);
		assertTrue( 44 == listaEnteros.get(1) );
		assertEquals( 4, listaEnteros.size()  );
	}
}
