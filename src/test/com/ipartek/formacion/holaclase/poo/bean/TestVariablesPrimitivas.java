package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sun.org.mozilla.javascript.internal.regexp.SubString;

public class TestVariablesPrimitivas {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		//char caracterAmayus = 'A';
		//char caracterAminus = 'a';
		
		//System.out.println(Character.getNumericValue(caracterAmayus));
		//System.out.println(Character.getNumericValue(caracterAminus));
		
		String titulo = "don Quijote de ....";
		
		char letraInicial = titulo.charAt(0);
		letraInicial=Character.toUpperCase(letraInicial);
		titulo = letraInicial + titulo.substring(1);
		assertEquals("Don Quijote de ....",titulo);
		
		int [] miArray = new int[10];
		miArray[4]=25;
		
		assertEquals(10,  miArray.length);
		assertEquals(25, miArray[4]);
		assertEquals(0, miArray[7]);
		
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
	public void testExcepciones(){
		int [] miArray = new int[10];
		miArray[4]=25;
		assertEquals(0, miArray[11]);
	}

}
