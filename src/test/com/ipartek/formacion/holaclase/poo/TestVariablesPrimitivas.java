package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestVariablesPrimitivas {

	@Test
	public void testEnteros() {

		byte bite 	= 0; //1 byte
		short corto = 0; //2 bytes
		int entero  = 0; //4 bytes
		long largo  = 0; //8bytes
		
		assertTrue ( "8 bits o 1 byte", Byte.SIZE == 8);
		assertTrue ( "Es menor que 127", bite < Byte.MAX_VALUE);
		assertTrue ( "Es menor que -128", bite > Byte.MIN_VALUE);
		
		assertTrue( Byte.valueOf("0") == bite );
		
		//Casteo : max_value + 5 es de tipo (byte)
		bite = (byte) (Byte.MAX_VALUE + 5 );
		assertTrue (-124 == bite );
		
		//SHORT
		assertEquals ( Short.SIZE, 8*2 );
		assertEquals ( -32768, Short.MIN_VALUE );
		assertEquals ( 32767, Short.MAX_VALUE );
		
		//INTEGER
		assertEquals ( Integer.SIZE, 8*4 );
		assertEquals ( 0x80000000, Integer.MIN_VALUE );
		assertEquals ( 0x7fffffff, Integer.MAX_VALUE );
	
	}	
	
	
	@Test
	public void testReales() {
		float flotante = 12.03f;
		float flotante2 = (float) 12.03; //casteamos las variables porsiaca
		double doble   = (double) 12.04;
		
		assertEquals ( Float.SIZE, 8*4 );
		assertEquals ( Double.SIZE, 8*4*2 );
			
	}
	@Test
	public void testChar() {
		char caracterAmayus = 'A';
		char caracterAminus = 'a';
		char caracter9		= '9';
		
		assertEquals( 65, (int)caracterAmayus );
		assertEquals( 10, Character.getNumericValue(caracterAminus) );
		assertEquals( 10, Character.getNumericValue(caracterAmayus) );
		assertEquals( 9,  Character.getNumericValue(caracter9) );
	
	//Convertir primera letra de un string a Mayuscula
		String titulo = "don quijote de ...";
		//cojer primer carater
		char letraInicial = titulo.charAt(0);
		//Convertirlo a minuscula
		Character.toUpperCase(letraInicial);
		//Reemplazar en la cadena la primera letra
		titulo = letraInicial + titulo.substring(1);
		assertEquals("Don Quijote de ...", titulo );
	
	}
	
}
