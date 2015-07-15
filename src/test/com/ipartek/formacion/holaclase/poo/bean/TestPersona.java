package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

public class TestPersona{
	
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
		personaParametros = new Persona("Pepe",20);		
	}

	@After
	public void tearDown() throws Exception {
		personaVacia = null;
		personaParametros = null;		
	}

	@Test
	public void testPersona() {
		//Test del constructor vacio
		assertEquals("Anonimo", personaVacia.getNombre());
		assertEquals("Sin Determinar", personaVacia.getApellido());
		assertEquals(Persona.EDAD_MINIMA,personaVacia.getEdad());
		assertEquals("",personaVacia.getEmail());
		assertFalse("Est� aprobado", personaVacia.isAprobado());
		assertEquals(0,personaVacia.getNota());
	}

	@Test
	public void testPersonaStringInt() throws PersonaException {
		//Test del constructor con parametros
		assertEquals("Pepe", personaParametros.getNombre());
		assertEquals("Sin Determinar", personaParametros.getApellido());
		assertEquals(20,personaParametros.getEdad());
		assertEquals("",personaParametros.getEmail());
		assertFalse("Est� aprobado", personaParametros.isAprobado());
		assertEquals(0,personaParametros.getNota());
		
		Persona pEdadMinima = new Persona("",-1);
		Persona pEdadMaxima = new Persona("",333);
		assertEquals(Persona.EDAD_MINIMA,pEdadMinima.getEdad());
		assertEquals(Persona.EDAD_MAXIMA,pEdadMaxima.getEdad());		
	}

	@Test
	public void testSetEdad() throws PersonaException {
		//menor de EDAD_MINIMA 
		personaVacia.setEdad(-1);
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		
		//igual a EDAD_MINIMA
		personaVacia.setEdad(18);
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		
		//entre EDAD_MINIMA y EDAD_MAXIMA
		personaVacia.setEdad(45);
		assertEquals(45, personaVacia.getEdad());
		
		// igual a EDAD_MAXIMA
		personaVacia.setEdad(99);
		assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());

		// mayor que EDAD_MAXIMA
		personaVacia.setEdad(100);
		assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		
	}

}
