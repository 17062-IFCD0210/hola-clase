package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestObjetoGraficos {

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

		try {
			// No de puede instanciar una clase abstracta
			// ObjetoGrafico og = new ObjetoGrafico(0,0);

			// Se puede instancuiar una Linea, puesto que tiene todos los
			// metodos
			// implementados del padre

			Punto pInicio = new Punto(0, 0);
			Punto pFin = new Punto(10, 10);

			Linea linea = new Linea(pInicio, pFin);

			Punto pMover = new Punto(20, 25);
			linea.mover(pMover);
			assertEquals("No se ha movido correctamente en X", 20, linea
					.getP1().getX());

			assertEquals("No se ha movido correctamente en Y", 25, linea
					.getP1().getY());

			assertEquals(
					"com.ipartek.formacion.holaclase.poo.bean.Linea dibujada",
					linea.dibujar());
			assertEquals(
					"com.ipartek.formacion.holaclase.poo.bean.Linea redimensionada",
					linea.redimensionar());

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			fail("No se puede clonar el Objeto");
		}

	}

}
