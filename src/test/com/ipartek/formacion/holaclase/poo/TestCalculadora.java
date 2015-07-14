package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculadora {

	@Test
	public void test() {
		Calculadora calc = new Calculadora();
		calc.calcular(2000f, 1326.24f);
		
		//TODO comprobar todas las vueltas del array
		int[] vueltas = calc.getVueltas();
		
		fail("Comprobar todas las posiciones del array de vueltas");
		
		
	}

}
