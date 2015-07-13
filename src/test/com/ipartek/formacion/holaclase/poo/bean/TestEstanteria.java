package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestEstanteria {

	@Test
	public void test() {
		
		Estanteria e = new Estanteria();
		String titulo1 = "Don quijote de la Mancha";
		String titulo2 = "Java 7";
		
		assertEquals("No debe existir libros", 0, e.numeroLibros() );
		assertNull("Si no existe libro es null", e.extraer(titulo1) );
		
		
		//Guardamos 2 libros
		Libro libro1 = new Libro(titulo1); 	//1º
		e.guardar( libro1 );				//
		
		e.guardar( new Libro(titulo2) ); 	//2º
		
		assertEquals(2, e.numeroLibros() );
		
		//test extraer libro por titulo
		assertSame(libro1, e.extraer(titulo1));
		
		assertSame( null, e.extraer(null) );
	}

}
