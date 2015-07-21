package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObjetosGraficos {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLinea() {

		// Se puede instanciar una linea puesto que tiene
		// todos los metodos implementados del padre
		com.ipartek.formacion.holaclase.poo.bean.Linea linea = new Linea(0, 0,
				10, 10);

		linea.mover(20, 25);

		assertEquals("No se ha movido correctamente en x", 20, linea.getX());

		assertEquals("No se ha movido correctamente en y", 25, linea.getY());

		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Linea dibujada",
				linea.dibujar());
		assertEquals(
				"com.ipartek.formacion.holaclase.poo.bean.Linea redimensionada",
				linea.redimensionar());

	}

}
