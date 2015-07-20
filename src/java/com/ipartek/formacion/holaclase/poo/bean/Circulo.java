package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {

	Circulo ci = new Circulo();
	private int size;
	
	public Circulo(){
		super();
		ci.size = 100;
		ci.x = 150;
		ci.y = 10;
		ci.dibujar();
	}
		
	@Override
	void dibujar() {
		System.out.println("Circulo dibujado");
		
	}

	@Override
	void redimensionar() {
		System.out.println("Circulo redimensonado");
		

		
	}

}
