package com.ipartek.formacion.holaclase.poo.bean;

public class Circulo extends ObjetoGrafico {

	float radio;
	
	/**
	 * Constructor que crea un punto 
	 * @param pInicio: punto del centro
	 * @param radio: radio del circulo
	 * @throws CloneNotSupportedException 
	 */
	public Circulo(Punto pInicio, float radio) throws CloneNotSupportedException{
		super(pInicio);
		this.radio=radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	@Override
	public String dibujar() {
		return ("Dibujando circulo");
	}

	@Override
	public String redimensionar() {
		return ("Redimensionando circulo");
	}

}
