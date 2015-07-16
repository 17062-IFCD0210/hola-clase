package com.ipartek.formacion.holaclase.poo.ejemplos;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class TestPersonaException {

	Persona persona1;
	
	@Before
	public void setUp() throws Exception {
		persona1 = new Persona();
	}

	@After
	public void tearDown() throws Exception {
		persona1 = null;
	}
	
	@Test 
	public void TestEdadCorrecta(){
		try{ 
			Persona persona = new Persona("pepe", 25);
			persona1.setEdad(25);
		} catch(PersonaException e) {
			fail(".hay una excepcion por: " + e.getMessage());
		}
	}
	
	@Test 
	public void TestEdadMenor(){
		try{ 
			Persona persona = new Persona("pepe", 10);
			fail("Exception no lanzada");
		} catch(PersonaException e) {
			assertTrue( 
				"No lanza correctamente la excepcion de MSG_EDAD_MENOR",
				PersonaException.MENSAJE_EXCEPCION_MENOR_EDAD.equals(e.getMessage()) 
			);
		} 
	}
	@Test 
	public void TestEdadMenorSetEdad(){
		try{ 
			persona1.setEdad(10);
			fail("Exception no lanzada");
		} catch(PersonaException e) {
			assertTrue( 
				"No lanza correctamente la excepcion de MSG_EDAD_MENOR",
				PersonaException.MENSAJE_EXCEPCION_MENOR_EDAD.equals(e.getMessage()) 
			);
		} 
	}
	
	@Test 
	public void TestEdadMayor(){
		try{ 
			Persona persona = new Persona("pepe", 333);
			fail("Exception no lanzada");
		} catch(PersonaException e) {
			assertTrue( 
				"No lanza correctamente la excepcion de MSG_EDAD_MAYOR",
				PersonaException.MENSAJE_EXCEPCION_MAYOR_EDAD.equals(e.getMessage()) 
			);
		}  
	}
	
	@Test 
	public void TestEdadMayorSetEdad(){
		try{ 
			persona1.setEdad(333);
			fail("Exception no lanzada");
		} catch(PersonaException e) {
			assertTrue( 
				"No lanza correctamente la excepcion de MSG_EDAD_MAYOR",
				PersonaException.MENSAJE_EXCEPCION_MAYOR_EDAD.equals(e.getMessage()) 
			);
		} 
	}
	
	@Test 
	public void TestEdadNegativa(){
		try{ 
			Persona persona = new Persona("pepe", -50);
			fail("Exception no lanzada");
		} catch(PersonaException e) {
			assertTrue( 
				"No lanza correctamente la excepcion de MSG_EDAD_RANGO",
				PersonaException.MENSAJE_EXCEPCION_RANGO_EDAD_NO_VALIDO.equals(e.getMessage()) 
			);
		}
	}
	
	@Test 
	public void TestEdadNegativaSetEdad(){
		try{ 
			persona1.setEdad(-50);
			fail("Exception no lanzada");
		} catch(PersonaException e) {
			assertTrue( 
				"No lanza correctamente la excepcion de MSG_EDAD_RANGO",
				PersonaException.MENSAJE_EXCEPCION_RANGO_EDAD_NO_VALIDO.equals(e.getMessage()) 
			);
		}
	}

}
