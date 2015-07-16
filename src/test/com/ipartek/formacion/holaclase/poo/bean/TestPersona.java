package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.excepciones.PersonaException;

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
		try {
			personaParametros = new Persona("Ander", 20);
		} catch (PersonaException e) {
			e.getStackTrace();
		}
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPersona() {
		// fail("Not yet implemented");
		assertEquals("Anonimo", personaVacia.getNombre());
		assertEquals("Sin Determinar", personaVacia.getApellidos());
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		assertEquals("", personaVacia.getEmail());
		assertEquals((long) 0.0, personaVacia.getNota());
		assertFalse("Esta aprobado", personaVacia.isAprobado());
	}

	@Test
	public void testPersonaStringInt() {
		// fail("Not yet implemented");
		assertEquals("Ander", personaParametros.getNombre());
		assertEquals("Sin Determinar", personaParametros.getApellidos());
		assertEquals(20, personaParametros.getEdad());
		assertEquals("", personaParametros.getEmail());
		assertEquals((long) 0.0, personaParametros.getNota());
		assertFalse("Suspendido", personaParametros.isAprobado());
	}

	@Test
	public void testSetEdad() {
		try {
			personaVacia.setEdad(-1);
			fail("deberia haber lanzado excepcion");
		} catch (PersonaException e) {
			assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		}

		try {
			personaVacia.setEdad(18);
			assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad());
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		try {
			personaVacia.setEdad(33);
			assertEquals(33, personaVacia.getEdad());
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		try {
			personaVacia.setEdad(99);
			assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}

		try {
			personaVacia.setEdad(333);
			fail("deberia haber lanzado excepcion");
		} catch (PersonaException e) {
			assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		}
	}
	@Test
	public void testExcepcionEdad() {
		
		try{
			new Persona("menor", 12);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue( 
					"No lanza correctamente la excepcion de MSG_EDAD_MENOR",
					PersonaException.MENSAJE.get(PersonaException.COD_MENOR_EDAD).equals(e.getMessage()) 
				);
		}	
		
		try{
			new Persona("menor", 112);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue( 
					"No lanza correctamente la excepcion de MSG_EDAD_MAYOR",
					PersonaException.MENSAJE.get(PersonaException.COD_EDAD_ALTA).equals(e.getMessage()) 
				);
		}	
		
		
		try{
			new Persona("menor", -2);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue( 
					"No lanza correctamente la excepcion de MSG_EDAD_RANGO",
					PersonaException.MENSAJE.get(PersonaException.COD_EDAD_NEGATIVA).equals(e.getMessage()) 
				);
		}	
		
		
	}

}
