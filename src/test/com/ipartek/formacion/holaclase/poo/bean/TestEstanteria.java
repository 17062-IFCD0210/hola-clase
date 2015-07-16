package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestEstanteria {

	
	@Test
	public void test() {
		
		Estanteria e = new Estanteria();
		String titulo1 = "Don Quijote de la Mancha";		
		String titulo2 = "Java 7";
		
		//Inicializar estanteria
		assertEquals("No deben existir libros", 0, e.numeroLibros() );
		assertNull("Si no existe Libro null", e.extraer(titulo1) );
		
		//Guardamos 2 libros
		Libro libro1 = new Libro(titulo1);
		e.guardar( libro1 );		
		e.guardar( new Libro(titulo2) );
		
		
		//test extraer libro por titulo
		assertSame( libro1, e.extraer(titulo1) );
				
		assertSame( null, e.extraer(null) );
		
		
	}

}