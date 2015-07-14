package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void test() {
		
		
		Calculadora calc = new Calculadora();
		calc.calcular(2000f, 1326.24f);
		
		int[] vueltas = calc.getVueltas();

		// Comprobar todas las posiciones del array de vueltas
		
		assertEquals(13,vueltas[0]);
		assertEquals(1,vueltas[1]);
		assertEquals(0,vueltas[2]);
		assertEquals(0,vueltas[3]);
		assertEquals(1,vueltas[4]);
		assertEquals(1,vueltas[5]);
		assertEquals(1,vueltas[6]);
		assertEquals(1,vueltas[7]);
		assertEquals(0,vueltas[8]);
		assertEquals(1,vueltas[9]);
		assertEquals(0,vueltas[10]);
		assertEquals(1,vueltas[11]);
		calc.imprimirVueltas();

		
		
		calc.calcular( 0f, 0f);	
		vueltas = calc.getVueltas();
		assertEquals(  0 , vueltas[0]);
		assertEquals(  0 , vueltas[1]);
		assertEquals(  0 , vueltas[2]);
		assertEquals(  0 , vueltas[3]);
		assertEquals(  0 , vueltas[4]);
		assertEquals(  0 , vueltas[5]);
		assertEquals(  0 , vueltas[6]);
		assertEquals(  0 , vueltas[7]);
		assertEquals(  0 , vueltas[8]);
		assertEquals(  0 , vueltas[9]);
		assertEquals(  0 , vueltas[10]);
		assertEquals(  0 , vueltas[11]);

		
		calc.calcular( 10f, 10f);	
		vueltas = calc.getVueltas();
		assertEquals(  0 , vueltas[0]);
		assertEquals(  0 , vueltas[1]);
		assertEquals(  0 , vueltas[2]);
		assertEquals(  0 , vueltas[3]);
		assertEquals(  0 , vueltas[4]);
		assertEquals(  0 , vueltas[5]);
		assertEquals(  0 , vueltas[6]);
		assertEquals(  0 , vueltas[7]);
		assertEquals(  0 , vueltas[8]);
		assertEquals(  0 , vueltas[9]);
		assertEquals(  0 , vueltas[10]);
		assertEquals(  0 , vueltas[11]);
			
		
		calc.calcular( 5.00f, 4.75f);	
		vueltas = calc.getVueltas();
		assertEquals("Billete 50" ,  0 , vueltas[0]);
		assertEquals("Billete 20" ,  0 , vueltas[1]);
		assertEquals("Billete 10" ,  0 , vueltas[2]);
		assertEquals("Billete  5" ,  0 , vueltas[3]);
		assertEquals("Moneda   2" ,  0 , vueltas[4]);
		assertEquals("Moneda   1" ,  0 , vueltas[5]);
		assertEquals("Moneda  0.50",  0 , vueltas[6]);
		assertEquals("Moneda  0.20",  1 , vueltas[7]);
		assertEquals("Moneda  0.10",  0 , vueltas[8]);
		assertEquals("Moneda  0.05",  1 , vueltas[9]);
		assertEquals("Moneda  0.02",  0 , vueltas[10]);
		assertEquals("Moneda  0.01",  0 , vueltas[11]);
		
		
		calc.calcular( 88.89f, 0.01f);	
		vueltas = calc.getVueltas();
		assertEquals("Billete 50" ,   1 , vueltas[0]);
		assertEquals("Billete 20" ,   1 , vueltas[1]);
		assertEquals("Billete 10" ,   1 , vueltas[2]);
		assertEquals("Billete  5" ,   1 , vueltas[3]);
		assertEquals("Moneda   2" ,   1 , vueltas[4]);
		assertEquals("Moneda   1" ,   1 , vueltas[5]);
		assertEquals("Moneda  0.50",  1 , vueltas[6]);
		assertEquals("Moneda  0.20",  1 , vueltas[7]);
		assertEquals("Moneda  0.10",  1 , vueltas[8]);
		assertEquals("Moneda  0.05",  1 , vueltas[9]);
		assertEquals("Moneda  0.02",  1 , vueltas[10]);
		assertEquals("Moneda  0.01",  1 , vueltas[11]);
		
		
/**********************************************************/		
		
		calc.calcular(10f, 5.75f);
		vueltas = calc.getVueltas();
		calc.imprimirVueltas();		
		assertEquals("0 billetes de 50",0,vueltas[0]);
		assertEquals("0 billetes de 20",0,vueltas[1]);
		assertEquals("0 billetes de 10",0,vueltas[2]);
		assertEquals("0 billetes de 5",0,vueltas[3]);
		assertEquals("2 monedas de 2",2,vueltas[4]);
		assertEquals("0 monedas de 1",0,vueltas[5]);
		assertEquals("0 monedas de 0.50",0,vueltas[6]);
		assertEquals("1 monedas de 0.20",1,vueltas[7]);
		assertEquals("0 monedas de 0.10",0,vueltas[8]);
		assertEquals("1 monedas de 0.05",1,vueltas[9]);		
		assertEquals("0 monedas de 0.02",0,vueltas[10]);
		assertEquals("0 monedas de 0.01",0,vueltas[11]);				
		
		calc.calcular(15f, 25.75f);
		vueltas = calc.getVueltas();
		calc.imprimirVueltas();		
		assertEquals(0,vueltas[0]);
		assertEquals(0,vueltas[1]);
		assertEquals(0,vueltas[2]);
		assertEquals(0,vueltas[3]);
		assertEquals(0,vueltas[4]);
		assertEquals(0,vueltas[5]);
		assertEquals(0,vueltas[6]);
		assertEquals(0,vueltas[7]);
		assertEquals(0,vueltas[8]);
		assertEquals(0,vueltas[9]);
		assertEquals(0,vueltas[10]);
		assertEquals(0,vueltas[11]);
	
	}

}
