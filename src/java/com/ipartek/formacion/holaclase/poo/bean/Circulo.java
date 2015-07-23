package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {
	// Atributos

	// Constructores
	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(Punto p1) throws CloneNotSupportedException {
		super(p1);
	}

	// Getters y Setters

	// Metodos
	@Override
	public String dibujar() {
		return "Voy a dibujar un circulo";
	}

	@Override
	public String redimensionar() {
		return "Voy a redimensionar un circulo";
	}

}
