package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {

	private int radio;

	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param radio
	 */
	public Circulo(int x, int y, int radio) {
		super(x,y);
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
		return Circulo.class.getName() + " redimensionado";
	}

}
