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
		assertSame("La biblia de los caidos", libro.getTitulo());
		assertEquals(0, libro.getNumeroPaginas());
		assertSame("", libro.getDimensiones());
		assertSame("anonimo", libro.getAutor());
		assertSame("", libro.getColorPortada());
		assertEquals(0, libro.getMarcador());
	}

	@Test
	public void testAbrirCerrar() {
		// un libro recien abierto tiene el marcador a 0
		assertEquals(0,libro.abrir());
		assertEquals(0,libro.cerrar());
		
		//meto 1000 paginas y leo 2
		libro.setNumeroPaginas(1000);
		libro.leer();
		libro.leer();
		assertEquals(2,libro.abrir());
		
		assertEquals((1000-2),libro.cerrar());
		assertEquals((libro.getNumeroPaginas()-libro.getMarcador()),libro.cerrar());
		
		assertEquals(libro.getMarcador(),libro.abrir());
		
	}

	@Test
	public void testLeer() {
		//leo 300 veces y veo que marcador sea igual a 300
		libro.setNumeroPaginas(300);

		int paginaLeidas = 0;
		
		//repeticion de 0 a N
		while (paginaLeidas < libro.getNumeroPaginas()) {
			libro.leer();
			paginaLeidas++;
		}
		assertEquals(300, libro.getMarcador());
	
		//comprobar que no pueda leer al finalizar el libro
		//intentaremos leer 1000 paginas cuando solo tenemos 300
		//el marcador deberia estar a 300
		for (int i=0; i<1000;i++){
			libro.leer();
		}
		assertEquals("No se puede leer mas de las paginas del libro", 300, libro.getMarcador());
		assertEquals("No se puede leer mas de las paginas del libro", 0, libro.cerrar());
	}

	@Test
	public void testEscribir() {
		//si escribo en un libro vacio debe tener 1 pagina
		libro.escribir();
		assertEquals(1, libro.getNumeroPaginas());
		assertEquals(0, libro.getMarcador());

		//escribimos otra pagina
		libro.escribir();
		assertEquals(2, libro.getNumeroPaginas());
		assertEquals(0, libro.getMarcador());

		//escribimos varias paginas con un bucle do while
		//repeticion de 1 a N
		int paginasParaEscribir = 5;
		int paginasEscritas = 0;
		do{
			libro.escribir();
			//comprobamos que el marcador no aumente
			assertEquals(0, libro.getMarcador());
			paginasEscritas++;
		}
		while(paginasEscritas < paginasParaEscribir);
		
		//son 2 paginas de antes y 5 del bucle, total 7 paginas
		assertEquals(7, libro.getNumeroPaginas());
		assertEquals(0, libro.getMarcador());
	}

}
