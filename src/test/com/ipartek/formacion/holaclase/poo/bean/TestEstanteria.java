package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class TestEstanteria {

	
	@Test
	public void test() {
		
		Estanteria e = new Estanteria();
		String titulo1 = "Don Quijote de la Mancha";		
		String titulo2 = "Java 7";
		
		//inicializar estanteria
		assertEquals("No deben existir libros", 0, e.numeroLibros() );
		assertNull("Si no existe Libro null", e.extraer(titulo1) );
		
		//Guardamos 2 llibros
		Libro libro1 = new Libro(titulo1);
		e.guardar( libro1 );		
		e.guardar( new Libro(titulo2) );
		
		assertEquals( 2, e.numeroLibros() );
		
		//test extraer libro por titulo
		assertSame( libro1, e.extraer(titulo1) );
				
		assertSame( null, e.extraer(null) );
		
		
		
	}

}
