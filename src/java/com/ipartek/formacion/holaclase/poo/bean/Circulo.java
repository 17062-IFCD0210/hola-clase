package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {

	private int radio;

	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param radio
	 * @throws CloneNotSupportedException 
	 */
	public Circulo(Punto p, int radio) throws CloneNotSupportedException {
		super(p);
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
		return "Dibujado un circulo desde (" + this.getP1().getX() + "," + this.getP1().getY() + ") con radio " + this.getRadio();
	}

	@Override
	public String Redimensionar() {
		return Circulo.class.getName() + " redimensionado";
	}

}
