package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class TestObjetosGraficos {
	
	/*
	 * No se puede instanciar una clase abstracta
	 * ObjetoGrafico og = new ObjetoGrafico(0,0)
	 */

	@Test
	public void testLinea() {
		
		Punto pInicio = new Punto(0,0);
		Punto pFin = new Punto(0,5);
		Punto pMover = new Punto(1,1);
				
		Linea linea;
		try {
			linea = new Linea(pInicio, pFin);
				
			assertTrue(0 == linea.getP1().getX());
			assertTrue(0 == linea.getP1().getY());
			assertTrue(0 == linea.getP2().getX());
			assertTrue(5 == linea.getP2().getY());
			
			assertEquals("com.ipartek.formacion.holaclase.poo.bean.Linea redimensionada", linea.Redimensionar());		
			assertEquals("Dibujada una linea desde (0,0) hasta (0,5).", linea.dibujar());
			assertEquals("Objeto Grafico movido a: x=1 y=1", linea.moverA(pMover));
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			fail("No se ha podido clonar");
		}	

		
	}
	
	@Test
	public void testCirculo() throws CloneNotSupportedException {
	
		Punto pInicio = new Punto(0,0);
		Punto pMover = new Punto(1,1);
		
		Circulo circulo = new Circulo(pInicio,5);
		
		assertTrue(0 == circulo.getP1().getX());
		assertTrue(0 == circulo.getP1().getY());
		assertTrue(5 == circulo.getRadio());
		
		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Circulo redimensionado", circulo.Redimensionar());
		assertEquals("Dibujado un circulo desde (0,0) con radio 5", circulo.dibujar());
		assertEquals("Objeto Grafico movido a: x=1 y=1", circulo.moverA(pMover));
		
		Circulo circulo2 = new Circulo(pInicio,60);
		assertEquals("Dibujado un circulo desde (0,0) con radio 60", circulo2.dibujar());
	}
//
//	
//	@Test
//	public void testCuadrado() {
//		Cuadrado cuadrado = new Cuadrado(0,0,8,8);
//		
//		assertTrue(0 == cuadrado.getX());
//		assertTrue(0 == cuadrado.getY());
//		assertTrue(8 == cuadrado.getAlto());
//		assertTrue(8 == cuadrado.getAncho());
//		
//		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Cuadrado redimensionado", cuadrado.Redimensionar());
//		assertEquals("Dibujado un cuadrado desde (0,0) con altura 8 y anchura 8", cuadrado.dibujar());
//		assertEquals("Objeto Grafico movido a: x=1 y=1", cuadrado.moverA(1,1));
//		
//		Cuadrado cuadrado2 = new Cuadrado(0,0,2,10);
//		assertEquals("Dibujado un cuadrado desde (0,0) con altura 2 y anchura 10", cuadrado2.dibujar());
//	}


}
