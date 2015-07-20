package com.ipartek.formacion.holaclase.poo.bean;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestObjetoGrafico {

	@Test
	public void testLinea() {
		Linea linea;
		linea=new Linea(5,5,10,10);
		
		assertEquals(5,linea.getX());
		assertEquals(5,linea.getY());
		assertEquals(10,linea.getxFinal());
		assertEquals(10,linea.getyFinal());
		
		assertEquals("Dibujando linea",linea.dibujar());
		assertEquals("Redimensionando linea",linea.redimensionar());
		assertEquals("Me he movido a 5 , 7",linea.moverA(5,7));
	}

	@Test
	public void testCirculo() {
		Circulo circulo;
		circulo=new Circulo(5,15,8);
		
		assertEquals(5,circulo.getX());
		assertEquals(15,circulo.getY());
		assertEquals(8,circulo.getRadio());
		
		assertEquals("Dibujando circulo",circulo.dibujar());
		assertEquals("Redimensionando circulo",circulo.redimensionar());
		assertEquals("Me he movido a 5 , 7",circulo.moverA(5,7));
	}
	
	@Test
	public void testCuadrado() {
		Cuadrado cuadrado;
		cuadrado=new Cuadrado(5,8,4);
		
		assertEquals(5, cuadrado.getX());
		assertEquals(8, cuadrado.getY());
		assertEquals(4, cuadrado.getLargo());
		
		assertEquals("Dibujando cuadrado",cuadrado.dibujar());
		assertEquals("Redimensionando cuadrado",cuadrado.redimensionar());
		assertEquals("Me he movido a 5 , 7",cuadrado.moverA(5,7));
	}
	
	@Test
	public void testRectangulo() {
		Rectangulo rectangulo;
		rectangulo=new Rectangulo(5,8,13,20);
		
		assertEquals(5,rectangulo.getX());
		assertEquals(8,rectangulo.getY());
		assertEquals(13,rectangulo.getxFinal());
		assertEquals(20,rectangulo.getyFinal());
		
		assertEquals("Dibujando rectangulo",rectangulo.dibujar());
		assertEquals("Redimensionando rectangulo",rectangulo.redimensionar());
		assertEquals("Me he movido a 5 , 7",rectangulo.moverA(5,7));
	}
}
