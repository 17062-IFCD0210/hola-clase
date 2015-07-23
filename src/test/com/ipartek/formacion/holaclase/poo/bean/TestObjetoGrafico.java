package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObjetoGrafico {
	ObjetoGrafico og;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		// No se puede instanciar esta clase porque es abstracta
		// og = new ObjetoGrafico(0,0);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLinea() throws CloneNotSupportedException {
		Punto pInicio = new Punto(0, 0);
		Punto pFin = new Punto(10, 10);
		Linea lin = new Linea(pInicio, pFin);
		assertEquals("No se ha movido correctamente en X1", 0, lin.getP1()
				.getX());
		assertEquals("No se ha movido correctamente en Y1", 0, lin.getP1()
				.getY());
		assertEquals("No se ha movido correctamente en X2", 10, lin.getP2()
				.getX());
		assertEquals("No se ha movido correctamente en Y2", 10, lin.getP2()
				.getY());
		assertEquals("Linea dibujada", lin.dibujar());
		assertEquals("Linea redimensionada", lin.redimensionar());
	}

	@Test
	public void testCirculo() throws CloneNotSupportedException {
		Punto pInicio = new Punto(0, 0);

		Circulo cir = new Circulo(pInicio);
		assertEquals(0, cir.getP1().getX());
		assertEquals(0, cir.getP1().getY());
		assertEquals("Voy a dibujar un circulo", cir.dibujar());
		assertEquals("Voy a redimensionar un circulo", cir.redimensionar());
	}

	@Test
	public void testCuadrado() throws CloneNotSupportedException {
		Punto pInicioIzq = new Punto(0, 0);
		Punto pInicioDer = new Punto(0, 10);
		Punto pFinIzq = new Punto(5, 10);
		Punto pFinDer = new Punto(10, 10);

		Cuadrado cua = new Cuadrado(pInicioIzq, pInicioDer, pFinIzq, pFinDer);
		assertEquals("No se ha movido correctamente en X1", 0, cua.getP1()
				.getX());
		assertEquals("No se ha movido correctamente en Y1", 0, cua.getP1()
				.getY());
		assertEquals("No se ha movido correctamente en X2", 0, cua.getP2()
				.getX());
		assertEquals("No se ha movido correctamente en Y2", 10, cua.getP2()
				.getY());
		assertEquals("No se ha movido correctamente en X3", 5, cua.getP3()
				.getX());
		assertEquals("No se ha movido correctamente en Y3", 10, cua.getP3()
				.getY());
		assertEquals("No se ha movido correctamente en X4", 10, cua.getP4()
				.getX());
		assertEquals("No se ha movido correctamente en Y4", 10, cua.getP4()
				.getY());
		assertEquals("Voy a dibujar un cuadrado", cua.dibujar());
		assertEquals("Voy a redimensionar un cuadrado", cua.redimensionar());
	}

}