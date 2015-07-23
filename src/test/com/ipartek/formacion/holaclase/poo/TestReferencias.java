package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Libro;

public class TestReferencias {

	@Test
	public void testPasoParametroPorValor() {
		// Todas las variables primitivas se pasan por valor,
		// o mejor dicho se pasa una 'copia' de la variable
		int x = 0;
		int y = sumar(x);

		assertEquals(0, x);
		assertEquals(1, y);

	}

	@Test
	public void testPasoParametroPorReferencia()
			throws CloneNotSupportedException {
		Libro libroX = new Libro("mock");
		Libro libroY = null;

		// Al pasar un objeto, le pasa el parametro por referencia, por lo cual
		// si lo modificamos dentro de un metodo el objeto cambia
		libroY = sumar(libroX);

		assertEquals(1, libroX.getNumPags());
		assertEquals(1, libroY.getNumPags());

		// Para pasar un objeto que no se modifique podemos 'clonarlo'
		Libro libroZ = new Libro("mock");
		sumar(libroZ.clone());

		assertEquals(1, libroX.getNumPags());
	}

	private int sumar(int parametroValor) {
		return ++parametroValor;
	}

	private Libro sumar(Libro libro) {
		Libro resul = libro;
		libro.setNumPags((libro.getNumPags() + 1));
		return resul;
	}

}