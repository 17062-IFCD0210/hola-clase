package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPerro {

	Perro perro1; // esta variable es global a toda la clase
	
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
		//se ejecuta ANTES de comenzar cada test
		perro1 = new Perro("Pintto"); //inicializaos la variable
	}

	@After
	public void tearDown() throws Exception {
		//se ejecuta DESPUES de comenzar cada test		
		perro1 = null; //limpiamos la variable al terminar
	}

	@Test
	public void testPerro() {
		//fail("Not yet implemented");
		
		assertEquals("Pintto",perro1.getNombre());
		assertEquals(4,perro1.getPatas());
		assertEquals("desconocida",perro1.getRaza());
		Persona amo = perro1.getAmo();
		if (amo!=null){
			assertEquals("Abandonado",amo.getNombre());
			assertEquals(Persona.EDAD_MINIMA, amo.getEdad());
		}else{
			fail("No tiene amo");
		}
		//assertEquals(false,perro1.isVacunado());
		assertFalse("Esta Vacunado", perro1.isVacunado());
		assertEquals(0,perro1.getEdad());
	}

	@Test
	public void testLadrar() {
		//fail("Not yet implemented");
		assertTrue("No ladra", "Guau guau".equals( perro1.ladrar() ) );
		//El texto "No ladra" lo escribe cuando falla el test, cuando no es true
		
		assertEquals("Guau guau", perro1.ladrar() );
	}

}
