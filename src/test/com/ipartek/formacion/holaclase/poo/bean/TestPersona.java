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
		
		//se ejecuta ANTES de comenzar cada de Test
		personaVacia       = new Persona();
		personaParametros  = new Persona("Cristina", 35);

	}

	@After
	public void tearDown() throws Exception {
		
		//se ejecuta DESPUES de comenzar cada de Test
		personaVacia = null;
		personaParametros = null;
		
	}

	@Test
	public void testPersona() {
		//fail("Not yet implemented");
		assertEquals("Anonimo", personaVacia.getNombre());
		assertEquals("Sin Determinar", personaVacia.getApellido());
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		assertEquals("", personaVacia.getEmail());
		assertFalse("Ha Aprobado", personaVacia.isAprobado());
		assertEquals(0, personaVacia.getNota());
		
	}

	@Test
	public void testPersonaStringInt() {
		//fail("Not yet implemented");
		
		assertEquals("Cristina", personaParametros.getNombre());
		assertEquals("Sin Determinar", personaParametros.getApellido());
		assertEquals(35, personaParametros.getEdad());
		assertEquals("", personaParametros.getEmail());
		assertFalse("Ha Aprobado", personaParametros.isAprobado());
		assertEquals(0, personaParametros.getNota());
		
		Persona pEdadMinima = new Persona("", -1);
		Persona pEdadMaxima = new Persona("", 103);
		
		assertEquals(Persona.EDAD_MINIMA, pEdadMinima.getEdad());
		assertEquals(Persona.EDAD_MAXIMA, pEdadMaxima.getEdad());

	}

	@Test
	public void testSetEdad() {
		//fail("Not yet implemented");
		
		personaVacia.setEdad(15);
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());

		personaVacia.setEdad(18);
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());

		personaVacia.setEdad(22);
		assertEquals(22, personaVacia.getEdad());

		personaVacia.setEdad(99);
		assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());

		personaVacia.setEdad(102);
		assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());


	}

}
