package com.ipartek.formacion.holaclase.poo.bean;


public class Linea extends ObjetoGrafico {
	//Atributos
	
	//Constructores
	public Linea() {
		super();
	}

	public Linea(int x, int y) {
		super(x, y);
	}
	
	//Getters y Setters
	
	
	//Metodos
	@Override
	public String dibujar() {
		return "Voy a dibujar una linea";
	}

	@Override
	public String redimensionar() {
		return "Voy a redimensionar una linea";
	}

}
