package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {

	private int radio;

	
	/**
	 * @param radio
	 */
	public Circulo(int radio) {
		super();
		this.setRadio(radio);
	}

	public int getRadio() {
		return radio;
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}

	
	@Override
	public String dibujar() {
		return "Dibujado un circulo desde (" + this.getX() + "," + this.getY() + ") con radio " + this.getRadio();
	}

	@Override
	public String Redimensionar() {
		return "Circulo redimensionado";
	}

}
