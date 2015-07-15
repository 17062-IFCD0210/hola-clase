package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Libro;

public class TestReferencias {

	@Test
	public void testPasoParametrosPorValor() {

		//Todas las variables primitivas se pasan por valor,
		//o mejor dicho se pasa una 'copia' de la variable
		
		int x = 0;
		
		int y = sumar(x);
		
		assertEquals ( 0 , x);
		assertEquals ( 1 , y);
		
		
	}

	@Test
	public void testPasoParametrosPorReferencia() {

		Libro libroX = new Libro("mock");
		Libro libroY = null;
		
		
		
		//Al pasar un objeto, se pasa el parametro por referencia
		//por lo cual si lo modificamos dentro de un metro el objeto cambia

		libroY = sumarPaginas( libroX );
		
		
		assertEquals(1, libroX.getNumPaginas() );
		assertEquals(1, libroY.getNumPaginas() );
		
		
		//Para pasar un objeto como parametro y que no se pueda modificar podemos clonarlo
		
		Libro libroZ = new Libro("mock");
		try {
			sumarPaginas(libroZ.clone());
		} catch (CloneNotSupportedException e) {
			//Si genera un excption
			fail("No se puede clonar");
		}
		
		assertEquals(0, libroZ.getNumPaginas() );
	}

	
	private int sumar( int parametroValor ) {
		
		return ++parametroValor;
	
	}
	
	private Libro sumarPaginas ( Libro libro) {
		
		Libro resul = libro;
		
		//Aumentamos el número de paginas del parametro de llamada
		libro.setNumPaginas( (libro.getNumPaginas() + 1) );
		
		return resul;
		
	}
}
