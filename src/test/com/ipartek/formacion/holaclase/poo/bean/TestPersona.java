package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPersona {

	Persona personaVacia;
	Persona personaParametros;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		personaVacia=new Persona();
		personaParametros = new Persona("Ander", 20);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersona() {
		//fail("Not yet implemented");
		assertEquals("Anonimo", personaVacia.getNombre());
		assertEquals("Sin Determinar", personaVacia.getApellidos());
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		assertEquals("", personaVacia.getEmail());
		assertEquals((long)0.0, personaVacia.getNota());
		assertFalse("Esta aprobado", personaVacia.isAprobado());
	}

	@Test
	public void testPersonaStringInt() {
		//fail("Not yet implemented");
		assertEquals("Ander", personaParametros.getNombre());
		assertEquals("Sin Determinar", personaParametros.getApellidos());
		assertEquals(20, personaParametros.getEdad());
		assertEquals("", personaParametros.getEmail());
		assertEquals((long)0.0, personaParametros.getNota());
		assertFalse("Suspendido", personaParametros.isAprobado());
		
		Persona pEdadMinima = new Persona("", -1);
		assertEquals(Persona.EDAD_MINIMA, pEdadMinima.getEdad());
		
		Persona pEdadMaxima = new Persona("", 150);
		assertEquals(Persona.EDAD_MAXIMA, pEdadMaxima.getEdad());
	}

	@Test
	public void testSetEdad() {
		//fail("Not yet implemented");
		personaParametros.setEdad(0);
		assertEquals(Persona.EDAD_MINIMA, personaParametros.getEdad());
		personaParametros.setEdad(18);
		assertEquals(Persona.EDAD_MINIMA, personaParametros.getEdad());
		personaParametros.setEdad(25);
		assertEquals(25, personaParametros.getEdad());
		personaParametros.setEdad(99);
		assertEquals(Persona.EDAD_MAXIMA, personaParametros.getEdad());
		personaParametros.setEdad(150);
		assertEquals(Persona.EDAD_MAXIMA, personaParametros.getEdad());
	}

}
