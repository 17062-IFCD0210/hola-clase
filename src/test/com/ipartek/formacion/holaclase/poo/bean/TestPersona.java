package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaExcepcion;

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
		personaParametros = new Persona("Manolo", 35);
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
	public void testPersonaStringInt() throws Exception{
		//fail("Not yet implemented");
		assertEquals("Manolo", personaParametros.getNombre());
		assertEquals("Sin Determinar", personaParametros.getApellido());
		assertEquals(35, personaParametros.getEdad());
		assertEquals("", personaParametros.getEmail());
		assertFalse("Está Aprobado", personaParametros.isAprobado());
		assertEquals(0, personaParametros.getNota());
		
	}

	@Test
	public void testSetEdad(){
		//fail("Not yet implemented");
		try {
			personaVacia.setEdad(-1);
			fail("debería haber lanzado excepción");
		} catch (PersonaExcepcion e) {
			assertEquals( Persona.EDAD_MINIMA , personaVacia.getEdad() );
		}
		
		try {
			personaVacia.setEdad(18);
			assertEquals( Persona.EDAD_MINIMA , personaVacia.getEdad() );
		} catch (PersonaExcepcion e) {
			fail("No deberia lanzar excepcion");
		}
		
		try {
			personaVacia.setEdad(33);
			assertEquals( 33 , personaVacia.getEdad() );
		} catch (PersonaExcepcion e) {
			fail("No debería lanzar excepción");
		}
		
		try {
			personaVacia.setEdad(99);
			assertEquals( Persona.EDAD_MAXIMA , personaVacia.getEdad() );
		} catch (PersonaExcepcion e) {
			fail("No debería lanzar excepción");
		}
		
		try {
			personaVacia.setEdad(333);
			fail("debería haber lanzado excepción");
		} catch (PersonaExcepcion e) {
			assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		}
		
	}

	@Test
	public void testExcepcionEdad() {
		
		try{
			new Persona("menor", 12);
			fail("No lanza PersonaException");
		}catch(PersonaExcepcion e){
			assertTrue( 
					"No lanza correctamente la excepcion de MSG_EDAD_MENOR",
					PersonaExcepcion.MSG_EDAD_MENOR.equals(e.getMessage()) 
				);
		}	
		
		try{
			new Persona("menor", 112);
			fail("No lanza PersonaException");
		}catch(PersonaExcepcion e){
			assertTrue( 
					"No lanza correctamente la excepcion de MSG_EDAD_MAYOR",
					PersonaExcepcion.MSG_EDAD_MAYOR.equals(e.getMessage()) 
				);
		}	
		
		
		try{
			new Persona("menor", -2);
			fail("No lanza PersonaException");
		}catch(PersonaExcepcion e){
			assertTrue( 
					"No lanza correctamente la excepcion de MSG_EDAD_RANGO",
					PersonaExcepcion.EXCEPCION_RANGO_NO_VALIDO.equals(e.getMessage()) 
				);
		}	
		
		
	}
}

