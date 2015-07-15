package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Libro;

public class TestReferencias {

	@Test
	public void testPasoParametroPorValor() {
		/*
		 * Todas las variables primitivas se pasan por valor,
		 * mejor dicho se pasa una 'copia' de la variable.
		 *****************************************************/
		int x = 0;
		int y = sumar(x);
		
		assertEquals(0, x);
		assertEquals(1, y);

	}

	@Test
	public void testPasoParametroPorReferencia(){
		/*
		 * Todos los objetos se pasan por referencia,
		 * por lo cual si lo modificamos dentro de un metodo
		 * ambos objetos cambian.
		 *****************************************************/
		Libro libroX = new Libro("mock");
		Libro libroY = sumar (libroX);
		
//		assertEquals(0, libroX.getNumeroPaginas());
		assertEquals(1, libroX.getNumeroPaginas());
		assertEquals(1, libroY.getNumeroPaginas());
		
		//Para pasar un objeto como parametro y que no se modifiquem
		Libro libroZ = new Libro("mock");
		try {
			sumar(libroZ.clone());
		} catch (CloneNotSupportedException e) {
			fail("No se puede clonar");
		} finally {
			assertEquals(0, libroZ.getNumeroPaginas());
		}

	}
	
	
	private int sumar (int parametroValor){
		int resul = ++parametroValor;
		return resul;
	}
	
	private Libro sumar (Libro libro){
		Libro resul = libro;
		libro.setNumeroPaginas( (libro.getNumeroPaginas()+1) );
		return resul;
	}

}
