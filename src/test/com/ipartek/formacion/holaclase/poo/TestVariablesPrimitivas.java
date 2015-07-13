package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVariablesPrimitivas {

	@Test
	public void testEnteros() {
		byte bite  = 0; // 1 byte
		short corto= 0; // 2 bytes
		int entero = 0; // 4 bytes
		long largo = 0; // 8 bytes
		
		//BYTE
		assertTrue ("8 bits o 1 byte", Byte.SIZE == 8);
		assertTrue("Es menor que 127", bite < Byte.MAX_VALUE);
		assertTrue("Es mayor que -128", bite > Byte.MIN_VALUE);		
		
		assertTrue(Byte.valueOf("0") == bite); //parsea de String a Byte

		bite = (byte) (Byte.MAX_VALUE + 5);
		assertTrue(-124 == bite);
		//System.out.println(bite);
		
		//SHORT
		assertEquals(-32768, Short.MIN_VALUE);
		assertEquals(32767, Short.MAX_VALUE);
		assertEquals( 8*2, Short.SIZE);
		
		//INTEGER
		assertEquals(0x80000000, Integer.MIN_VALUE);
		assertEquals(0x7fffffff, Integer.MAX_VALUE);
		assertEquals( 8*4, Integer.SIZE);
		
		//LONG
		assertEquals(0x8000000000000000L, Long.MIN_VALUE);
		assertEquals(0x7fffffffffffffffL, Long.MAX_VALUE);
		assertEquals( 8*8, Long.SIZE);
		
	}

	@Test
	public void testReales() {
		
		float flotante = 12.03f; // 4 bytes, ponemos f al final
		float flotante2 = (float)12.03; // 4 bytes, casteamos con float
		double doble   = (double)12.04; // 8 bytes
		
		assertEquals(Float.SIZE, 8*4);
		assertEquals(Double.SIZE, 8*4*2);
	}
	
	@Test
	public void testChar() {
		
		char caracterAmayus='A';
		char caracterAminus='a';

		assertEquals(65, (int)caracterAmayus); //código ascii de la variable
		assertEquals(10, Character.getNumericValue(caracterAminus));
		
		//convertir primera letra de un string a mayuscula
		String titulo= "don Quijote de ...";
		//coger primer caracter
		char letraInicial = titulo.charAt(0);
		//convertirlo a mayuscula
		letraInicial = Character.toUpperCase(letraInicial);
		//reemplazar en la cadena de texto la primera letra
		titulo = letraInicial + titulo.substring(1);
		assertEquals("Don Quijote de ...", titulo);
		
	}

}
