package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.excepciones.PersonaException;

public class TestPerro {

	Perro perro1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		// se ejecuta antes de comenzar la Clase de Test
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		// se ejcuta despues de la clase de Test
	}

	@Before
	public void setUp() throws Exception {
		// se ejecuta antes de cada test
		perro1 = new Perro("Pintto");
	}

	@After
	public void tearDown() throws Exception {
		// se ejcuta despues de cada test
		perro1 = null;
	}

	@Test
	public void testPerro() {
		// fail("Not yet implemented");
		assertEquals("Pintto", perro1.getNombre());
		assertEquals(4, perro1.getPatas());
		assertEquals(0, perro1.getPeso());
		assertEquals("desconocida", perro1.getRaza());
		assertFalse("Esta vacunado", perro1.isVacunado());
		assertEquals(0, perro1.getEdad());

		Persona amo = perro1.getAmo();
		if (amo != null) {
			assertEquals("Abandonado", amo.getNombre());
			assertEquals(Persona.EDAD_MINIMA, amo.getEdad());
		} else {
			fail("No tiene amo");
		}
	}

	@Test
	public void testLadrar() {
		// fail("Not yet implemented");
		assertTrue("No ladra", ("Guau! Guau!").equals(perro1.ladrar()));
		assertEquals("Guau! Guau!", perro1.ladrar());
	}

	@Test
	public void testPerroPersona(){
		Persona abandonado = new Persona();
		abandonado.setNombre("Abandonado");
		Persona persona1 = new Persona();
		Perro perro1 = new Perro("Aska");
		perro1.setAmo(persona1);
		assertTrue(perro1.getAmo()==persona1);
		
		Persona persona2 = new Persona();
		Perro perro2=new Perro("Hartz");
		try {
			persona2.setEdad(100);
		} catch (PersonaException e) {
			persona2= abandonado;
			//e.printStackTrace();
		}
		perro2.setAmo(persona2);
		assertTrue(perro2.getAmo()==persona2);
	}
}
