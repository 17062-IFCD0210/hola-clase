package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAlumno {
	Alumno al;
	Alumno alP;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		al = new Alumno();
		alP = new Alumno("pepe",33);
	}

	@After
	public void tearDown() throws Exception {
		 al= null;
		 alP = null;
	}

	@Test
	public void testAlumno() {
		assertEquals("Anonimo",al.getNombre());
		assertEquals("Sin Determinar",al.getApellido());
		assertEquals(Persona.EDAD_MIN,al.getEdad());
		assertEquals("",al.getEmail());
		assertFalse("Aprobado",al.isAprobado());
		assertTrue(Alumno.NOTA_MIN == al.getNota());
	}
	
	@Test
	public void testAlumnoParametros() {
		assertEquals("pepe",alP.getNombre());
		assertEquals("Sin Determinar",alP.getApellido());
		assertEquals(33,alP.getEdad());
		assertEquals("",alP.getEmail());
		assertFalse("Aprobado",alP.isAprobado());
		assertTrue(Alumno.NOTA_MIN == alP.getNota());
	}

}
