package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

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
		
		//NO se puede INSTANCIAR una clase abstracta
		//ObjetoGrafico og = new ObjetoGrafico(0,0);
		
		
		//Se puede instanciar una Linea, puesto que tiene todos los metodos del padre implementados
		Punto pInicio = new Punto (0 ,0);
		Punto pFin 	  = new Punto (10 ,10);
		
		Linea linea = new Linea(pInicio, pFin);
		
		Punto pMover = new Punto(20, 25);
		linea.mover(pMover);
		assertEquals("No se ha movido correctamente en X",
				20, linea.getX() 
				);
		assertEquals("No se ha movido correctamente en Y", 
				25, linea.getY() 
				);
		
		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Linea dibujada",
					linea.dibujar() );
		assertEquals("com.ipartek.formacion.holaclase.poo.bean.Linea redimensionada",
					linea.redimensionar() );
			
	}
	
	@Test
	public void testCuadrado() {
		Cuadrado cuadrado = new Cuadrado (10, 10, 10, 10);
		
		cuadrado.mover(15, 15);
		assertEquals("No se ha movido correctamente en X",
				15, cuadrado.getLX() 
				);
		assertEquals("No se ha movido correctamente en Y", 
				15, cuadrado.getLY() 
				);
	}
}
