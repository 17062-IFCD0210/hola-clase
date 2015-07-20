package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAlumno {
	
	Alumno alumno;
	Alumno alumno1;

	static final float DESVIACION = 0;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		alumno = new Alumno();
		alumno1 = new Alumno("Pepe",20);		
	}

	@After
	public void tearDown() throws Exception {
		alumno = null;
		alumno1 = null;
	}

	@Test
	public void testConstructor() {
		assertEquals("Anonimo", alumno.getNombre());
		assertEquals("Sin Determinar", alumno.getApellido());
		assertEquals(Persona.EDAD_MINIMA,alumno.getEdad());
		assertEquals("",alumno.getEmail());		
		assertFalse("Esta aprobado", alumno.isAprobado());
		
		assertTrue(0==alumno.getNota());
		assertEquals(0,alumno.getNota(),DESVIACION);
			
	}
	
	@Test
	public void testConstructorParametros() {
		assertEquals("Pepe", alumno1.getNombre());
		assertEquals("Sin Determinar", alumno1.getApellido());
		assertEquals("",alumno1.getEmail());						
		assertEquals("Pepe",alumno1.getNombre());
		assertEquals(20,alumno1.getEdad());
		assertFalse("Esta aprobado", alumno1.isAprobado());
		
		assertTrue(0==alumno1.getNota());
		assertEquals(0,alumno1.getNota(),DESVIACION);
	}
	

}
