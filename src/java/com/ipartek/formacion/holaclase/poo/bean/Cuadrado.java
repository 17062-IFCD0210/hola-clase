package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {
	//Atributos
	
	//Constructores
	
	//Getters y Setters
	
	//Metodos
	public Cuadrado() {
		super();
	}

	public Cuadrado(int x, int y) {
		super(x, y);
	}

	@Override
	public String dibujar() {
		return "Voy a dibujar un cuadrado";
	}

	@Override
	public String redimensionar() {
		return "Voy a redimensionar un cuadrado";
	}

}
