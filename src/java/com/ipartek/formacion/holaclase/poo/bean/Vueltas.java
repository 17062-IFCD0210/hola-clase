package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.Calculadora;

public class Vueltas {
	
	public static void main(String[] args){
		Calculadora calc = new Calculadora();
		calc.calcular(2000f, 1326.24f);
		calc.imprimirVueltas();
	}
}
