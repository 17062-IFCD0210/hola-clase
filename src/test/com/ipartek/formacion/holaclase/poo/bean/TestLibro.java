package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLibro {
	
	//atributo de ambito globar para utilizar en todos los test
	Libro libro;
	 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		libro = new Libro ("La Biblia de los caidos");
	}

	@After
	public void tearDown() throws Exception {
		libro = null;
	}

	@Test
	public void testLibro() {
		assertSame( "La Biblia de los caidos", libro.getTitulo() );
		assertEquals( 0, libro.getNumeroPaginas() );
		assertSame( "", libro.getDimensiones() );
		assertSame( "anonimo", libro.getAutor() );
		assertSame( "", libro.getColorPortada() );
		assertEquals( 0, libro.getMarcador() );
	}
	
	@Test
	public void testLeer() {
		libro.setNumeroPaginas(300);	
		int paginasLeidas = 0;
		
		//mientras que las pag por leer < que las leidas, sigue leyendo; repeticion de 0 a N
		while ( paginasLeidas < libro.getNumeroPaginas() ){
			libro.leer();
			paginasLeidas++;
		}
		
		assertEquals( 300, libro.getMarcador() );
		
		//Comprobar que no pueda leer al finalizar el libro
		for (int i=0; i< 1000; i++){
			libro.leer();
		}
		
		assertEquals("No se puede leer mas de las paginas del libro ", 300, libro.getMarcador() );
		assertEquals("No se puede leer mas de las paginas del libro ", 0, libro.cerrar() );
	}
	
	@Test
	public void testEscribir() {
		libro.escribir();
		
		assertEquals( 1, libro.getNumeroPaginas() );
		assertEquals( 0, libro.getMarcador() );
		
		libro.escribir();
		
		assertEquals( 2, libro.getNumeroPaginas() );
		assertEquals( 0, libro.getMarcador() );
		
		//repetiticion de 1 a N
		int paginasParaEscribir = 5;
		int paginasEscritas 	= 0; 
		
		do {
			libro.escribir();
			assertSame( 0, libro.getMarcador() );
			paginasEscritas++;		
		}
		while( paginasEscritas  < paginasParaEscribir);
		
		assertEquals( 7, libro.getNumeroPaginas() );
	}
	
	
	@Test
	public void testAbrirCerrar() {
		
		assertEquals ( 0, libro.abrir() );
		assertEquals ( 0, libro.cerrar() );
		
		libro.setNumeroPaginas(1000);
		
		//leemos dos paginas
		libro.leer();
		libro.leer();
		
		assertEquals( (1000-2), libro.cerrar() );	
		assertEquals( (libro.getNumeroPaginas()- libro.getMarcador()) , libro.cerrar() );
		
		assertEquals( 2, libro.abrir() );
		assertEquals( libro.getMarcador() , libro.abrir() );
	}
}
