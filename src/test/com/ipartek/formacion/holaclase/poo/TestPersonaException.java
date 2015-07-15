package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

public class TestPersonaException {

	@Test
	public void minEdadException(){
		try{
			Persona persona = new Persona("pepe",-2);
			fail("Deberia haber lazado la excepcion");
		}catch (PersonaException e){
			//assertTrue(true);
			System.out.println(e.getMensaje());
		}
	}

}
