package com.ipartek.formacion.holaclase.poo.bean;


import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestLibro {

	Libro libro; //Creamos una var nueva de la clase Libro
	
	@BeforeClass
	//nates de empezar el test
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	//Después del test
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	//nada más ejecutar el test
	public void setUp() throws Exception {
		libro = new Libro("La biblia de los caídos");
	}

	@After
	public void tearDown() throws Exception {
		libro = null; // cada vez que finalice lo limpia o lo deja a null
	}

	@Test
	public void testLibro() {
		assertSame("La biblia de los caídos", libro.getTitulo());
		assertEquals(0, libro.getNumeroPaginas());
		assertSame("", libro.getDimensiones());
		assertSame("Anónimo", libro.getAutor());
		assertSame("", libro.getColorPortada());
		assertEquals(0, libro.getMarcador());
	}
	
	@Test
	public void testLeer() {

		libro.setNumeroPaginas(300);
		int paginasleidas = 0;
		
		//repetición de 0 a N
		while (paginasleidas < libro.getNumeroPaginas()){
			libro.leer();
			paginasleidas++;
		}
		
		assertEquals(300,libro.getMarcador());
		
		//Comprobar que no pueda leer al finalizar el libro
		for (int i=0; i<1000; i++){
			libro.leer();
		}
		
		assertEquals("No se puede cerrar más de las páginas del libro", 300,libro.getMarcador());
		assertEquals("No se puede cerrar más de las páginas del libro", 0, libro.cerrar());
	}
	
	@Test
	public void testEscribir() {
		libro.escribir();
		assertEquals(1, libro.getNumeroPaginas());
		assertEquals(0, libro.getMarcador());
		
		libro.escribir();
		assertEquals(2, libro.getNumeroPaginas());
		assertEquals(0, libro.getMarcador());
		
		
		int paginasParaEscribir = 5;
		int paginasEscritas = 0;
		//repetición de 0 a N
		do{
			libro.escribir();
			assertEquals(0, libro.getMarcador());
			paginasEscritas++;
		}
		while (paginasEscritas < paginasParaEscribir);
		
		assertEquals(7, libro.getNumeroPaginas());
	}
	
	@Test
	public void testAbrirCerrar() {
		assertEquals(0, libro.abrir());
		
		libro.setNumeroPaginas(1000);
		
		libro.leer();
		libro.leer();
		
		assertEquals( (1000-2), libro.cerrar());
		assertEquals( (libro.getNumeroPaginas() - libro.getMarcador()), libro.cerrar());
		
		assertEquals(2, libro.abrir());
		assertEquals(libro.getMarcador(), libro.abrir());
	}

}
