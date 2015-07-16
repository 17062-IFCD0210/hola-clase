
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
		personaVacia = new Persona();
		personaParametros = new Persona("Ander", 35 );
	}

	@After
	public void tearDown() throws Exception {
		personaVacia = null;
		personaParametros = null;
	}

	@Test
	public void testPersona() {
		
		assertEquals("Anonimo", personaVacia.getNombre() );
		assertEquals("Sin determinar", personaVacia.getApellido() );
		assertEquals(Persona.EDAD_MINIMA, personaVacia.getEdad() );
		assertEquals("", personaVacia.getEmail() );
		assertFalse("Esta Aprobado", personaVacia.isAprobado() );		
		assertEquals( 0, personaVacia.getNota() );
		

	}
	@Test
	public void TestPersonaStringInt() {
		
		assertEquals("Ander", personaParametros.getNombre() );
		assertEquals("Sin determinar", personaParametros.getApellido() );
		assertEquals( 35 , personaParametros.getEdad() );
		assertEquals("", personaParametros.getEmail() );
		assertFalse("Esta Aprobado", personaParametros.isAprobado() );		
		assertEquals( 0, personaParametros.getNota() );
		

	}

	@Test
	public void testSetEdad() {
		
		
		try {
			personaVacia.setEdad(-1);
			fail("Deberia haber lanzado excepcion");
		} catch (PersonaException e) {
			assertEquals( Persona.EDAD_MINIMA, personaVacia.getEdad() );

		}
		
		
		try {
			personaVacia.setEdad(18);
			assertEquals( Persona.EDAD_MINIMA, personaVacia.getEdad() );
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		
		
		try {
			personaVacia.setEdad(33);
			assertEquals( 33 , personaVacia.getEdad() );
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		
		
		try {
			personaVacia.setEdad(99);
			assertEquals( Persona.EDAD_MAXIMA , personaVacia.getEdad() );
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		
		
		try {
			personaVacia.setEdad(333);
			
		} catch (PersonaException e) {
			assertEquals( Persona.EDAD_MAXIMA, personaVacia.getEdad() );
		}
		
		
	}
	//vamos probando si en el constructor se da la excepcion;si new persona<12, capturo una excepcion
	@Test
	public void testExcepcionEdad(){
		try{
			new Persona ("menor", 12);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue( 
					"No lanza correctamente la excepcion de edad MSG_EDAD_MENOR",
					PersonaException.MSG_EDAD_MENOR.equals(e.getMessage() ) 
				);
			
		}
		try{
			new Persona ("menor", 112);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue( 
					"No lanza correctamente la excepcion de edad MSG_EDAD_MAYOR",
					PersonaException.MSG_EDAD_MAYOR.equals(e.getMessage() ) 
				);
			
		}
		try{
			new Persona ("menor", -2);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue( 
					"No lanza correctamente la excepcion de edad MSG_EDAD_RANGO",
					PersonaException.MSG_EDAD_RANGO.equals(e.getMessage() ) 
				);
			
		}
	}
	
	
}
