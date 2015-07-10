
package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testPersona {
	
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
		Persona personaVacia;	
	}

	@After
	public void tearDown() throws Exception {
		personaVacia = null;
	}

	@Test
	public void testPersona() {
		//fail("Not yet implemented");
		assertEquals("Anonimo", personaVacia.getNombre() );
		assertEquals("Sin determinar", personaVacia.getApellido() );
		
		assertFalse("Esta Aprobado", personaVacia.isAprobado() );
		assertEquals( "Indefinido", personaVacia.getEmail() );
		assertEquals( 6, personaVacia.getNota() );
		

	}

	@Test
	public void testPersonaStringInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetEdad() {
		fail("Not yet implemented");
	}

}
