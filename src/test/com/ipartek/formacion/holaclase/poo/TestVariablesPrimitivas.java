package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVariablesPrimitivas {

	@Test
	public void testEnteros() {
		byte bite = 0; //1 byte
		short corto = 0; //2 bytes
		int entero = 0; //4 bytes
		long largo = 0; //8 bytes
		
		//Byte
		assertTrue("8 bits o 1 byte", 8 == Byte.SIZE);
		assertTrue("Es menor que 127", bite < Byte.MAX_VALUE);
		assertTrue("Es mayor que 128", bite > Byte.MIN_VALUE);
		
		assertTrue(Byte.valueOf("0") == bite);
		
		bite = (byte)(Byte.MAX_VALUE + 5);
		assertTrue(-124 == bite);
		
		//Short
		assertEquals(Short.SIZE, 8*2);
		assertEquals(-32768, Short.MIN_VALUE);
		assertEquals(32767, Short.MAX_VALUE);
		
		//Integer
		assertEquals(Integer.SIZE, 8*4);
		assertEquals(-2147483648, Integer.MIN_VALUE);
		assertEquals(2147483647, Integer.MAX_VALUE);
		
	}
	
	@Test
	public void testReales() {
		double doble = 12.03;
		float flotante = (float)12.03;
		
		assertEquals(Float.SIZE, 8*4);
		assertEquals(Double.SIZE, 8*4*2);
	}
	
	@Test
	public void testChar() {
		char caracterA = 'A';
		char caractera = 'a';
		char caracter9 = '9';
		
		assertEquals(10, Character.getNumericValue(caracterA));
		assertEquals(10, Character.getNumericValue(caractera));
		assertEquals(9, Character.getNumericValue(caracter9));
		
		//Convertir primera letra de un String a Mayuscula
		String titulo = "don quijote de la mancha";
		char letraInicial = titulo.charAt(0);
		//Convertirlo a mayuscula
		letraInicial = Character.toUpperCase(letraInicial);
		
		//Reemplazar en la cadena de texto
		titulo = letraInicial + titulo.substring(1);
		assertEquals("Don quijote de la mancha", titulo);
	}

}
