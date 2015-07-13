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
		assertEquals( 0 , libro.getNumeroPaginas() );
		assertSame( "" , libro.getDimensiones() );
		assertSame( "anonimo", libro.getAutor() );
		assertSame( "" , libro.getColorPortada() );
		assertEquals( 0 , libro.getMarcador() );		
				
	}
	
	@Test
	public void testLeer() {

		libro.setNumeroPaginas(300);
		int paginaLeidas = 0;		
		
		//repeticion de 0 a N
		while ( paginaLeidas < libro.getNumeroPaginas() ){
			libro.leer();
			paginaLeidas++;
		}
		
		assertEquals( 300 , libro.getMarcador() );
		
		//comprobar que no pueda lleer al finalizae el libro
		for (int i=0; i < 1000; i++){
			libro.leer();
		}	
		
		assertEquals("No se puede leer mas de las paginas del Libro ", 300 , libro.getMarcador() );
		assertEquals("No se puede leer mas de las paginas del Libro ", 0 , libro.cerrar() );
		
		
		
	}
	
	@Test
	public void testEscribir() {
		
		libro.escribir();		
		assertEquals( 1 , libro.getNumeroPaginas() );
		assertEquals( 0 , libro.getMarcador() );
		
		libro.escribir();		
		assertEquals( 2 , libro.getNumeroPaginas() );
		assertEquals( 0 , libro.getMarcador() );
		
		
		int paginasParaEscribir = 5;
		int paginasEscritas = 0; 
		//repeticion de 1 a N
		do{
			libro.escribir();				
			assertEquals( 0 , libro.getMarcador() );
			paginasEscritas++;
		}
		while( paginasEscritas < paginasParaEscribir );
		
		assertEquals( 7 , libro.getNumeroPaginas() );
		
	}
	
	@Test
	public void testAbrirCerrar() {
		
		assertEquals( 0, libro.abrir() );
		assertEquals( 0, libro.cerrar() );
		
		libro.setNumeroPaginas(1000);
		
		libro.leer();
		libro.leer();
		
		assertEquals( (1000-2) , libro.cerrar() );
		assertEquals( (libro.getNumeroPaginas()- libro.getMarcador()) , libro.cerrar() );		
		
		assertEquals( 2, libro.abrir() );
		assertEquals( libro.getMarcador() , libro.abrir() );
		 
		 
	}
	
	


}
