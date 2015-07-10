package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPerro {
	
	Perro perro1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//se ejecuta ANTES de comenzar la Clase de Test
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//se ejecuta DESPUES de comenzar la Clase de Test
	}

	@Before
	public void setUp() throws Exception {
		//se ejecuta ANTES de comenzar cada de Test
		perro1 = new Perro("Pintto");
	}

	@After
	public void tearDown() throws Exception {
		//se ejecuta DESPUES de comenzar cada de Test
		perro1 = null;
	}

	@Test
	public void testPerro() {
		//fail("Not yet implemented");
		assertEquals("Pintto", perro1.getNombre());
		assertEquals(4, perro1.getPatas());
		assertEquals("desconocida", perro1.getRaza());
		
		//Comprobar que cuando se hace una instancia de perro, todos los datos están bien inicializados, incluido el amo
		Persona amo = perro1.getAmo();
		if ( amo != null) {
			
			assertEquals("Abandonado", amo.getNombre());
			assertEquals(Persona.EDAD_MINIMA, amo.getEdad());
			
		} else {
			fail ("No tiene amo");
		}
		
		assertFalse("Esta Vacunado", perro1.isVacunado());
		assertEquals(0, perro1.getPeso());
		assertEquals(0, perro1.getEdad());
	}

	@Test
	public void testLadrar() {
		//fail("Not yet implemented");
		//Para comparar String se utiliza "equals"
		assertTrue("No ladra", "GUA gua GUA!!!".equals(perro1.ladrar() ) );
		
		assertEquals("GUA gua GUA!!!", perro1.ladrar());
		
		
	}


}
