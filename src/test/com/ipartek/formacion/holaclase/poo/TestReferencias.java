package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Libro;

public class TestReferencias {

	@Test
	public void testPasoParametroPorValor() {
		// todas las variables primitivas se pasan por valor, 
		// o mejor dicho se pasa una 'copia' de la variable
		int x = 0;
		int y = sumar(x);
		
		assertEquals(0,x); //x sigue valiendo 0
		assertEquals(1,y);
		
	}

	@Test
	public void testPasoParametroPorReferencia(){

		Libro libroX = new Libro("mock");
		Libro libroY = null;
		
		//Al pasar un objeto se pasa el parametro por referencia
		//por lo cual si lo modificamos dentro de un metodo el 
		//objeto cambia
		
		libroY = sumar(libroX);
		
		assertEquals(1, libroX.getNumeroPaginas());
		assertEquals(1, libroY.getNumeroPaginas());
		// los dos libros tienen 1 pagina
		
		//Para pasar un objeto como parametro y que no se modifique
		//podemos 'clonarlo'
		
		Libro libroZ = new Libro("mock");
		try {
			sumar(libroZ.clone());
		} catch (CloneNotSupportedException e) {
			fail("No se puede clonar");
		}
		assertEquals(0,libroZ.getNumeroPaginas());
		
	}

	
	private int sumar(int parametroValor){
		// primero suma y luego hace el return
		return ++parametroValor;
	}
	
	private Libro sumar(Libro libro){
		Libro resul = libro;
		//sumamos 1 al numero de paginas
		libro.setNumeroPaginas( (libro.getNumeroPaginas()+1) );
		return resul;
	}
}
