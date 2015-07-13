package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TestArrayList {

	@Test
	public void test() {

		ArrayList<Integer> listaEnteros = new ArrayList<Integer>();
		
		assertEquals("lista vaciona", 0, listaEnteros.size() );
		
		listaEnteros.add(0);
		listaEnteros.add(1);
		listaEnteros.add(2);
		
		//comprobar que se insertan al final, ultima posicion un "2"
		
		assertTrue("comprobar que se insertan al final", 
					2 ==   
					listaEnteros.get( (listaEnteros.size()- 1) ) 
					);
		
		//Insertar en la posicion 1 un 44;
		listaEnteros.add(1, 44);
		
		assertTrue ( 44 == listaEnteros.get(1) );
		assertEquals(4, listaEnteros.size() );
		
		
		
	}

}
