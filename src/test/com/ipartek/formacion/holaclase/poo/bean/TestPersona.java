package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

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
		personaParametros = new Persona("BlaBla", 25);
	}

	@After
	public void tearDown() throws Exception {
		personaVacia = null;
		personaParametros = null;
	}

	@Test
	public void testPersona() {
		//fail("Not yet implemented");
		assertEquals("Anonimo",personaVacia.getNombre());
		assertEquals("Sin Determinar",personaVacia.getApellido());
		assertEquals(Persona.EDAD_MIN,personaVacia.getEdad());
		assertEquals("",personaVacia.getEmail());
		assertFalse("Aprobado",personaVacia.isAprobado());
		assertEquals(Persona.NOTA_MIN,personaVacia.getNota());
	}

	@Test
	public void testPersonaStringInt() throws ExcepcionPersona {
		//fail("Not yet implemented");
		assertEquals("BlaBla",personaParametros.getNombre());
		assertEquals("Sin Determinar",personaParametros.getApellido());
		assertEquals(25,personaParametros.getEdad());
		assertEquals("",personaParametros.getEmail());
		assertFalse("Aprobado",personaParametros.isAprobado());
		assertEquals(Persona.NOTA_MIN,personaParametros.getNota());
		
		Persona pEdadMin = new Persona("",-1);
		Persona pEdadMax = new Persona("",333);
		
		assertEquals(Persona.EDAD_MIN,pEdadMin.getEdad());
		assertEquals(Persona.EDAD_MAX,pEdadMax.getEdad());
		
	}

	@Test
	public void testSetEdad() throws ExcepcionPersona {
		//fail("Not yet implemented");
		personaVacia.setEdad(17);
		assertEquals(Persona.EDAD_MIN,personaVacia.getEdad());
		
		personaVacia.setEdad(18);
		assertEquals(Persona.EDAD_MIN,personaVacia.getEdad());
		
		personaVacia.setEdad(19);
		assertEquals(19,personaVacia.getEdad());
		
		personaVacia.setEdad(98);
		assertEquals(98,personaVacia.getEdad());
		
		personaVacia.setEdad(99);
		assertEquals(Persona.EDAD_MAX,personaVacia.getEdad());
		
		personaVacia.setEdad(100);
		assertEquals(Persona.EDAD_MAX,personaVacia.getEdad());
	}
}
