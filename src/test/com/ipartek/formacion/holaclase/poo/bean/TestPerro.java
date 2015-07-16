package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

public class TestPerro {
	
	//Perro perro1;

//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		//Se ejecuta ANTES de comenzar la clase de Test
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		//Se ejecuta DESPUES de comenzar la clase de Test
//	}
//
//	@Before
//	public void setUp() throws Exception {
//		//Se ejecuta ANTES de comenzar cada Test
//		perro1 = new Perro("Pintto");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		//Se ejecuta DESPUES de comenzar cada Test
//		perro1 = null;
//	}

	@Test
	public void testPerro() {
		//fail("Not yet implemented");
//		assertEquals("Pintto", perro1.getNombre());
//		assertEquals(4,perro1.getPatas());
//		assertEquals("Desconocida",perro1.getRaza());
//		
//		Persona amo = perro1.getDueno();
//		if(amo != null) {
//			assertEquals("Abandonado",amo.getNombre());
//			assertEquals(Persona.EDAD_MIN, amo.getEdad());
//		} else {
//			fail("No tiene amo");
//		}
//		
//		assertFalse("Esta vacunado",perro1.isVacunado());
//		assertEquals((long)0.0,perro1.getPeso());
//		assertEquals(0,perro1.getEdad());
			Persona persona1 = new Persona();
			Perro perro1 = new Perro("Hola");			
			try {
				persona1.setEdad(3);
				fail("No deberia salir");
			} catch(ExcepcionPersona e) {
				try {
					persona1.setEdad(Persona.EDAD_MIN);
					perro1.setDueno(persona1);
					assertTrue("Amo mal generado", perro1.getDueno()==persona1);
				} catch (ExcepcionPersona e1) {
					fail("Amo sin generar");
				}
				
			}
			

		
	}

//	@Test
//	public void testLadrar() {
//		//fail("Not yet implemented");
//		assertTrue("No ladra", "Guau Guau".equals(perro1.ladrar()));
//		assertEquals("Guau Guau", perro1.ladrar());
////		assertTrue("No ladra", false);
//	}

}
