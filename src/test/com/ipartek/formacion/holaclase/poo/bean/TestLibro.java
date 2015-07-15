package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLibro {

	Libro libro1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		libro1 = new Libro("La biblia de los caidos");
	}

	@After
	public void tearDown() throws Exception {
		libro1 = null;
	}

	@Test
	public void testLibroString() {
		assertSame("La biblia de los caidos", libro1.getTitulo());
		assertSame("Anonimo", libro1.getAutor());
		assertSame("blanco", libro1.getColorPortada());
		assertSame("60x60", libro1.getDimensiones());
		assertEquals(0, libro1.getMarcador());
		assertEquals(0, libro1.getNum_paginas());
	}

	@Test
	public void testAbrirCerrar() {
		assertEquals(0, libro1.abrir());
		assertEquals(0, libro1.cerrar());
		
		libro1.setNum_paginas(1000);
		libro1.leer();
		libro1.leer();
		
		assertEquals(2, libro1.abrir());
		assertEquals((1000-2), libro1.cerrar());
	}

	@Test
	public void testEscribir() {
		libro1.escribir();
		assertEquals(1,  libro1.getNum_paginas());
		assertEquals(0, libro1.getMarcador());
		
		libro1.escribir();
		assertEquals(2, libro1.getNum_paginas());
		assertEquals(0, libro1.getMarcador());
		
		int paginasParaEscribir = 5;
		do{
			libro1.escribir();
			paginasParaEscribir--;
		}while(paginasParaEscribir>0);
		
		assertEquals(7, libro1.getNum_paginas());
		assertEquals(0, libro1.getMarcador());
	}

	@Test
	public void testLeer() {
		libro1.setNum_paginas(300);
		int paginasLeidas = 0;
		
		while (paginasLeidas < libro1.getNum_paginas()) {
			libro1.leer();
			paginasLeidas++;
		}
		
		assertEquals(300, libro1.getMarcador());
		
		//comprobar que no pueda leer al finalizar el libro
		for (int i = 0; i >1000; i++){
			libro1.leer();
		}
		assertEquals("No se puede leer mas de las paginas del libro", 300, libro1.getMarcador());
	}

}
