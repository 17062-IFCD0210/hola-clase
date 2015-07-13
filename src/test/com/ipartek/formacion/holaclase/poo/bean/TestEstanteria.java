package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEstanteria {

	@Test
	public void test() {
		
		Estanteria Est = new Estanteria();
		
		String titulo1 = "Don Quijote de la Mancha";
		String titulo2 = "Java 7";
		
		assertEquals("No debe exisitr libros", 0, Est.numeroLibros() );
		
		assertNull("Si no existe libro, null", Est.extraer(titulo1) );
		
		
		Libro libro1 = new Libro(titulo1);
		Est.guardar(libro1);

		//Guardamos "al vuelo", el segundo libreo el new va en la misma linea donde se pasa el parametro de llamada
		Est.guardar( new Libro(titulo2) );
		
		assertEquals(2, Est.numeroLibros() );
		
		assertSame(libro1, Est.extraer(titulo1) );
		
		//Que pasa si extraigo un titulo nulo
		assertSame(null, Est.extraer(null) );
		
		
		
	}

}
