package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestEstanteria {

	@Test
	public void test() {
		Estanteria est = new Estanteria();
		String titulo1 = "Don Quijote de la Mancha";
		String titulo2 = "Java 7";
		
		//Inicializar estanteria
		assertEquals("No deben existir libros", 0, est.numLibros());
		assertNull("Si no existe libro, null", est.extraer(titulo1));
		
		//Guardamos 2 libros
		Libro libro1 = new Libro(titulo1);
		est.guardar(libro1);
		est.guardar(new Libro(titulo2));
		
		assertEquals(2, est.numLibros());
		
		//Test extraer libro por titulo
		assertEquals(libro1, est.extraer(titulo1));
		assertNull(null, est.extraer(null));
	}

}
