package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

public class TestExcepcionPersona {

	@Test
	public void testEdadNegativa() {
		try {
			Persona persona = new Persona("",-1);
			fail("No entraria");
		} catch(ExcepcionPersona e) {
			assertEquals("No lanza correctamente la excepcion de MESSAGE_EDAD_NEGATIVA", e.getMessage(), ExcepcionPersona.MESSAGE_EDAD_NEGATIVA);
		}
	}
	
	@Test
	public void testEdadMenor() {
		try {
			Persona persona = new Persona("",15);
			fail("No entraria");
		} catch(ExcepcionPersona e) {
			assertEquals("No lanza correctamente la excepcion de MESSAGE_EDAD_MENOR", e.getMessage(), ExcepcionPersona.MESSAGE_EDAD_MENOR);
		}
	}
	
	@Test
	public void testEdadCorrecta() {
		try {
			Persona persona = new Persona("",30);
			assertEquals(30,persona.getEdad());
		} catch(ExcepcionPersona e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testEdadPositiva() {
		
		try {
			Persona persona = new Persona("",100);
			fail("No entraria");
		} catch(ExcepcionPersona e) {
			assertEquals("No lanza correctamente la excepcion de MESSAGE_EDAD_MAYOR", e.getMessage(), ExcepcionPersona.MESSAGE_EDAD_MAYOR);
		}
	}

}
