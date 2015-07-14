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
		personaVacia = new Persona();
		personaParametros = new Persona("Manolo", Persona.EDAD_MAXIMA);
	}

	@After
	public void tearDown() throws Exception {
		personaVacia=null;
		personaParametros=null;
	}

	@Test
	public void testPersona() {
		//fail("Not yet implemented");
		assertEquals("Anónimo", personaVacia.getNombre());
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		assertEquals("Sin Determinar", personaVacia.getApellido());
		assertEquals("", personaVacia.getEmail());
		assertFalse("Está Aprobado", personaVacia.isAprobado());
		assertEquals(0, personaVacia.getNota());
		
		
	}

	@Test
	public void testPersonaStringInt() {
		//fail("Not yet implemented");
		assertEquals("Manolo", personaParametros.getNombre());
		assertEquals(35, personaParametros.getEdad());
		assertEquals("Sin Determinar", personaParametros.getApellido());
		assertEquals("", personaParametros.getEmail());
		assertFalse("Está Aprobado", personaParametros.isAprobado());
		assertEquals(0, personaParametros.getNota());
		
		Persona pEdadMinima = new Persona("", -1);
		Persona pEdadMaxima = new Persona("", 333);
		assertEquals(Persona.EDAD_MINIMA,pEdadMinima.getEdad());
		assertEquals(Persona.EDAD_MAXIMA,pEdadMaxima.getEdad());
	}

	@Test
	public void testSetEdad() {
		//fail("Not yet implemented");
		personaVacia.setEdad(-1);
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		
		personaVacia.setEdad(18);
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		
		personaVacia.setEdad(33);
		assertEquals(33, personaVacia.getEdad());
		
		personaVacia.setEdad(99);
		assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		
		personaVacia.setEdad(333);
		assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
	}

}

