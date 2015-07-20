package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObjetoGrafico {
	Linea lin;
	Circulo cir;
	Cuadrado cua;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lin = new Linea();
		cir = new Circulo();
		cua = new Cuadrado();
	}

	@After
	public void tearDown() throws Exception {
		lin = null;
		cir = null;
		cua = null;
	}

	@Test
	public void testLinea() {
		assertEquals(0, lin.getX());
		assertEquals(0, lin.getY());
		assertEquals("Voy a dibujar una linea", lin.dibujar());
		assertEquals("Voy a redimensionar una linea", lin.redimensionar());
	}
	
	@Test
	public void testCirculo() {
		assertEquals(0, cir.getX());
		assertEquals(0, cir.getY());
		assertEquals("Voy a dibujar un circulo", cir.dibujar());
		assertEquals("Voy a redimensionar un circulo", cir.redimensionar());
	}
	
	@Test
	public void testCuadrado() {
		assertEquals(0, cua.getX());
		assertEquals(0, cua.getY());
		assertEquals("Voy a dibujar un cuadrado", cua.dibujar());
		assertEquals("Voy a redimensionar un cuadrado", cua.redimensionar());
	}

}
