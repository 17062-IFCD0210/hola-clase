package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

public class TestExcepcionPersona {

	@Test
	public void testEdadNegativa() throws ExcepcionPersona{
		try {
			Persona persona = new Persona("",-1);
			fail("No entraria");
		} catch(ExcepcionPersona e) {
			assertEquals(e.getMessage(), e.MESSAGE_EDAD_NEGATIVA);
		}
	}
	
	@Test
	public void testEdadMenor() throws ExcepcionPersona{
		try {
			Persona persona = new Persona("",15);
			fail("No entraria");
		} catch(ExcepcionPersona e) {
			assertEquals(e.getMessage(), e.MESSAGE_EDAD_MENOR);
		}
	}
	
	@Test
	public void testEdadCorrecta() throws ExcepcionPersona{
		try {
			Persona persona = new Persona("",30);
			assertEquals(30,persona.getEdad());
		} catch(ExcepcionPersona e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void testEdadPositiva() throws ExcepcionPersona{
		
		try {
			Persona persona = new Persona("",100);
		} catch(ExcepcionPersona e) {
			assertEquals(e.getMessage(), e.MESSAGE_EDAD_MAYOR);
		}
	}

}
