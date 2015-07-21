package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestObjetosGraficos {
	
	/*
	 * No se puede instanciar una clase abstracta
	 * ObjetoGrafico og = new ObjetoGrafico(0,0)
	 */

	@Test
	public void testLinea() {
		Linea linea = new Linea(0,0,0,5);
		
		assertTrue(0 == linea.getX());
		assertTrue(0 == linea.getY());
		assertTrue(0 == linea.getDistanciaX());
		assertTrue(5 == linea.getDistanciaY());
		
		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Linea redimensionada", linea.Redimensionar());		
		assertEquals("Dibujada una linea desde (0,0) hasta (0,5).", linea.dibujar());
		assertEquals("Objeto Grafico movido a: x=1 y=1", linea.moverA(1,1));
			
		Linea linea2 = new Linea(-5,50,10, 10);
		assertEquals("Dibujada una linea desde (-5,50) hasta (10,10).", linea2.dibujar());
		
	}
	
	@Test
	public void testCirculo() {
		Circulo circulo = new Circulo(0,0,5);
		
		assertTrue(0 == circulo.getX());
		assertTrue(0 == circulo.getY());
		assertTrue(5 == circulo.getRadio());
		
		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Circulo redimensionado", circulo.Redimensionar());
		assertEquals("Dibujado un circulo desde (0,0) con radio 5", circulo.dibujar());
		assertEquals("Objeto Grafico movido a: x=1 y=1", circulo.moverA(1,1));
		
		Circulo circulo2 = new Circulo(0,0,60);
		assertEquals("Dibujado un circulo desde (0,0) con radio 60", circulo2.dibujar());
	}

	
	@Test
	public void testCuadrado() {
		Cuadrado cuadrado = new Cuadrado(0,0,8,8);
		
		assertTrue(0 == cuadrado.getX());
		assertTrue(0 == cuadrado.getY());
		assertTrue(8 == cuadrado.getAlto());
		assertTrue(8 == cuadrado.getAncho());
		
		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Cuadrado redimensionado", cuadrado.Redimensionar());
		assertEquals("Dibujado un cuadrado desde (0,0) con altura 8 y anchura 8", cuadrado.dibujar());
		assertEquals("Objeto Grafico movido a: x=1 y=1", cuadrado.moverA(1,1));
		
		Cuadrado cuadrado2 = new Cuadrado(0,0,2,10);
		assertEquals("Dibujado un cuadrado desde (0,0) con altura 2 y anchura 10", cuadrado2.dibujar());
	}


}
