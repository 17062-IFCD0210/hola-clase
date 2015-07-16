package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.excepciones.PersonaException;

public class TestPersonaException {
	Persona pepe;

	@Test
	public void TestForException(){
		try{
			pepe = new Persona ("Pepe", -5);
			fail();
		}catch(Exception e){
			assertEquals(e.getMessage(), PersonaException.MENSAJE.get(0));
		}
		
		try{
			pepe = new Persona ("Pepe", 15);
			fail();
		}catch(Exception e){
			assertEquals(e.getMessage(), PersonaException.MENSAJE.get(1));
		}
		
		try{
			pepe = new Persona ("Pepe", 150);
			fail();
		}catch(Exception e){
			assertEquals(e.getMessage(), PersonaException.MENSAJE.get(2));
		}
		
		try{
			pepe = new Persona ("Pepe", 25);
			assertEquals(pepe.getEdad(), 25);
		}catch(Exception e){
			fail();
		}
	}

}
