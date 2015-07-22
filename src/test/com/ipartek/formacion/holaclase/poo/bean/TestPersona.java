package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import java.io.Serializable;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

public class TestPersona implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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

	}

	@Test
	public void testPersonaStringInt(){
		//Test del constructor con parametros
		assertEquals("Pepe", personaParametros.getNombre());
		assertEquals("Sin Determinar", personaParametros.getApellido());
		assertEquals(20,personaParametros.getEdad());
		assertEquals("",personaParametros.getEmail());

		
/*		Esto ya esta probado abajo en testExcepcionEdadConstructor
		Persona pEdadMinima = new Persona("",-1);
		Persona pEdadMaxima = new Persona("",333);
		assertEquals(Persona.EDAD_MINIMA,pEdadMinima.getEdad());
		assertEquals(Persona.EDAD_MAXIMA,pEdadMaxima.getEdad());
*/
		
	}

	@Test
	public void testSetEdad() {
		//menor de EDAD_MINIMA 
		try {
			personaVacia.setEdad(-1);
			assertEquals(-1, personaVacia.getEdad());
		} catch (PersonaException e) {
			assertTrue("No lanza correctamente la excepcion de edad no valida",PersonaException.EDAD_NO_VALIDA.equals(e.getMessage()));
		}

		
		//igual a EDAD_MINIMA
		try {
			personaVacia.setEdad(18);
			assertEquals(18, personaVacia.getEdad());
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		
		
		//entre EDAD_MINIMA y EDAD_MAXIMA
		try {
			personaVacia.setEdad(45);
			assertEquals(45, personaVacia.getEdad());
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");
		}
		
		
		// igual a EDAD_MAXIMA
		try {
			personaVacia.setEdad(99);
			assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		} catch (PersonaException e) {
			fail("No deberia lanzar excepcion");			
		}
		
		// mayor que EDAD_MAXIMA
		try {
			personaVacia.setEdad(100);
			assertEquals(Persona.EDAD_MAXIMA, personaVacia.getEdad());
		} catch (PersonaException e) {
			assertTrue("No lanza correctamente la excepcion de edad mayor",PersonaException.MAYOR_DE_EDAD.equals(e.getMessage()));			
		}
		
		
	}

	@Test
	public void testExcepcionEdadConstructor(){
		try{
			new Persona("menor",12);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue("No lanza correctamente la excepcion de edad menor",PersonaException.MENOR_DE_EDAD.equals(e.getMessage()));
		}
		
		try{
			new Persona("menor",112);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue("No lanza correctamente la excepcion de edad mayor",PersonaException.MAYOR_DE_EDAD.equals(e.getMessage()));
		}
		
		try{
			new Persona("menor",-2);
			fail("No lanza PersonaException");
		}catch(PersonaException e){
			assertTrue("No lanza correctamente la excepcion de edad no valida",PersonaException.EDAD_NO_VALIDA.equals(e.getMessage()));
		}
	}
	
	
}
