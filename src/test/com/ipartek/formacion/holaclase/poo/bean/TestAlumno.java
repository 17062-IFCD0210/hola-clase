package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAlumno {
	
	Alumno a;
	Alumno aParam;
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		a = new Alumno();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}
	
	@Test
	public void testConstructor() {
		
		assertEquals("Anonimo", a.getNombre() );
		assertEquals("Sin determinar", a.getApellido() );
		assertEquals( Persona.EDAD_MINIMA , a.getEdad() );
		assertEquals( "", a.getEmail() );
		assertFalse( "Esta aprobado", a.isAprobado() );		
		assertEquals( 0 , a.getNota(), 0 ); // assertEquals(expected, actual, delta);
		
	}

	
	@Test
	public void testAlumnoStringInt() {
		
		assertEquals("Anonimo", aParam.getNombre() );
		assertEquals("Sin determinar", aParam.getApellido() );
		assertEquals( 33 , aParam.getEdad() );
		assertEquals( "", aParam.getEmail() );
		assertFalse( "Esta aprobado", aParam.isAprobado() );		
		assertEquals( 0 , aParam.getNota(), 0 ); // assertEquals(expected, actual, delta);
	
	}

}
