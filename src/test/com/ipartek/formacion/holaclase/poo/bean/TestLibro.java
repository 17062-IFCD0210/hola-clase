package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLibro {
	
	Libro libro;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		libro = new Libro("La biblia de los caidos");
	}

	@After
	public void tearDown() throws Exception {
		libro = null;
	}

	@Test
	public void testConstructor() {
		assertSame("La biblia de los caidos", libro.getTitulo());
		assertSame(0, libro.getNumPags());
		assertSame("", libro.getDimensiones());
		assertSame("Anonimo", libro.getAutor());
		assertSame("", libro.getColorPortada());
		assertSame(0, libro.getMarcador());
	}
	
	@Test
	public void testLeer() {
		libro.setNumPags(300);
		int pagsLeidas = 0;
		
		//Repeticion de 0...n
		while(pagsLeidas < libro.getNumPags()) {
			libro.leer();
			pagsLeidas++;
		}
		
		assertEquals(300, libro.getMarcador());
		
		//Comprobar que no pueda leer al finalizar el libro
		for(int i=0; i<1000; i++) {
			libro.leer();
		}
		
		assertEquals("No se puede leer mas de las paginas del libro", 300, libro.getMarcador());
		assertEquals("No se puede leer mas de las paginas del libro", 0, libro.cerrar());
	}
	
	@Test
	public void testEscribir() {
		libro.escribir();
		assertEquals(1, libro.getNumPags());
		assertEquals(0, libro.getMarcador());
		
		libro.escribir();
		assertEquals(2, libro.getNumPags());
		assertEquals(0, libro.getMarcador());
		
		//Repeticion de 1...n
		int pagsParaEsribir = 5;
		int pagsEscritas = 0;
		do {
			libro.escribir();
			assertEquals(0, libro.getMarcador());
			pagsEscritas++;
		} while(pagsEscritas < pagsParaEsribir);
		
		assertEquals(7, libro.getNumPags());
	}
	
	@Test
	public void testAbrirCerrar() {
		assertEquals(0, libro.abrir());
		assertEquals(0, libro.cerrar());
		
		libro.setNumPags(1000);
		
		libro.leer();
		libro.leer();
		
		assertEquals((1000-2), libro.cerrar());
		assertEquals((libro.getNumPags()-libro.getMarcador()), libro.cerrar());
		
		assertEquals(2, libro.abrir());
		assertEquals(libro.getMarcador(), libro.abrir());
	}

}
