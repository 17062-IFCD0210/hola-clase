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
	public void testLibro() {
		assertSame("La biblia de los caidos", libro.getTitulo() );
		assertEquals(0, libro.getNumPaginas() );
		assertSame("", libro.getDimensiones() );
		assertSame("anonimo", libro.getAutor() );
		assertSame("", libro.getColorPortada() );
		assertEquals(0, libro.getMarcador() );
		

	}

	@Test
	public void testLeer() {
		
		libro.setNumPaginas(300);
		int paginasLeidas = 0;
		
		while ( paginasLeidas < libro.getNumPaginas() ){
			libro.leer();
			paginasLeidas++;
		}
		
		assertEquals( 300, libro.getMarcador() );
		
		for (int i=0; i < 1000; i++){
			
			libro.leer();
		}
		
		assertEquals( "no se puede leer mas de las paginas del libro", 300, libro.getMarcador() );
		assertEquals( "no se puede leer mas de las paginas del libro", 0, libro.cerrar() );
	}

	@Test
	public void testEscribir() {
		
		//El libro se crea con 0 paginas y el marcador a 0, y cada vez que se
		//escribe se aumenta el número de paginas
		
		libro.escribir();
		assertEquals( 1, libro.getNumPaginas() );
		assertEquals( 0, libro.getMarcador() );

		libro.escribir();
		assertEquals( 2, libro.getNumPaginas() );
		assertEquals( 0, libro.getMarcador() );
		
		//Vamos a escribir de 1 a N paginas mas
		int paginasParaEscribir = 5;
		int paginasEscritas		= 0;
		do {

			libro.escribir();
			assertEquals( 0, libro.getMarcador() );
			paginasEscritas++;
		} 
		while( paginasEscritas < paginasParaEscribir);

		//2 paginas de antes + 5 ahora
		assertEquals( 7, libro.getNumPaginas() );
	}

	@Test
	public void testAbrirCerrar() {

		assertEquals( 0, libro.abrir() );
		assertEquals( 0, libro.cerrar() );
		
		libro.setNumPaginas (1000);
		
		libro.leer();
		libro.leer();
		
		assertEquals( (1000-2), libro.cerrar() );
		assertEquals( (libro.getNumPaginas() - libro.getMarcador()) , libro.cerrar() );
		assertEquals( 2, libro.abrir() );
		assertEquals( libro.getMarcador(), libro.abrir() );
	}

}
