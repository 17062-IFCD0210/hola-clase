package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {

	int radio;
	
	public Circulo(){
		super();
		radio=0;
	}

	public Circulo(int x, int y, int radio){
		super();
		super.setX(x);
		super.setY(y);
		this.radio=radio;
	}
	
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	protected String dibujar() {
		return ("Dibujando circulo");
	}

	@Override
	protected String redimensionar() {
		return ("Redimensionando circulo");
	}

}
