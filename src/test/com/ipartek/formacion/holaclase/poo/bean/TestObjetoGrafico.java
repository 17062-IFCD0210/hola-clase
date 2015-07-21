package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestObjetoGrafico {

	@Test
	public void testLinea() throws CloneNotSupportedException {

		// Se puede instanciar una linea puesto que tiene todos los metodos
		// implementados del padre

		Punto pInicio = new Punto(0, 0);
		Punto pFin = new Punto(10, 10);

		Linea linea = new Linea(pInicio, pFin);

		Punto pMover = new Punto(20, 25);

		assertEquals(0, linea.getP1().getX());
		assertEquals(0, linea.getP1().getY());
		assertEquals(10, linea.getPuntoFinal().getX());
		assertEquals(10, linea.getPuntoFinal().getY());

		linea.moverA(pMover);
		assertEquals("No se ha movido correctamente en X", 20, linea.getP1()
				.getX());
		assertEquals("No se ha movido correctamente en Y", 25, linea.getP1()
				.getY());

		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Linea dibujada",
				linea.dibujar());
		assertEquals(
				"com.ipartek.formacion.holaclase.poo.bean.Linea redimensionada",
				linea.redimensionar());
	}

	/*
	 * @Test public void testCirculo() { Circulo circulo; circulo=new
	 * Circulo(5,15,8);
	 *
	 * assertEquals(5,circulo.getX()); assertEquals(15,circulo.getY());
	 * assertEquals(8,circulo.getRadio());
	 *
	 * assertEquals("Dibujando circulo",circulo.dibujar());
	 * assertEquals("Redimensionando circulo",circulo.redimensionar());
	 * assertEquals("Me he movido a 5 , 7",circulo.moverA(5,7)); }
	 *
	 *
	 * @Test public void testCuadrado() { Cuadrado cuadrado; cuadrado=new
	 * Cuadrado(5,8,4);
	 *
	 * assertEquals(5, cuadrado.getX()); assertEquals(8, cuadrado.getY());
	 * assertEquals(4, cuadrado.getLargo());
	 *
	 * assertEquals("Dibujando cuadrado",cuadrado.dibujar());
	 * assertEquals("Redimensionando cuadrado",cuadrado.redimensionar());
	 * assertEquals("Me he movido a 5 , 7",cuadrado.moverA(5,7)); }
	 *
	 * @Test public void testRectangulo() { Rectangulo rectangulo;
	 * rectangulo=new Rectangulo(5,8,13,20);
	 *
	 * assertEquals(5,rectangulo.getX()); assertEquals(8,rectangulo.getY());
	 * assertEquals(13,rectangulo.getxFinal());
	 * assertEquals(20,rectangulo.getyFinal());
	 *
	 * assertEquals("Dibujando rectangulo",rectangulo.dibujar());
	 * assertEquals("Redimensionando rectangulo",rectangulo.redimensionar());
	 * assertEquals("Me he movido a 5 , 7",rectangulo.moverA(5,7)); }
	 */
}
