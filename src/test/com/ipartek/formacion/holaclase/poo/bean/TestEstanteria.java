package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

public class TestEstanteria {

	@Test
	public void test(){
		
		Estanteria e = new Estanteria();
		String titulo1 = "Don Quijote de la Mancha";
		String titulo2 = "Java 7";
		
		assertEquals("No deben exisistir libros", 0, e.numLibros());
		assertNull("Si no existe Libro null",e.extraer(titulo1));
		
		Libro libro1 = new Libro(titulo1);
		e.guardar( libro1 );
		e.guardar(new Libro(titulo2));
		
		assertEquals(2, e.numLibros());
		
		//test extraer libro por titulo
		assertSame (libro1, e.extraer(titulo1));
		assertSame(null, e.extraer(null));
	}

}
