package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {
	
	float largo;
	

	/**
	 * Constructor que crea un cuadrado
	 * @param pInicio: punto del vertice
	 * @param largo: longitud del lado del cuadrado
	 * @throws CloneNotSupportedException 
	 */
	public Cuadrado(Punto pInicio, float largo) throws CloneNotSupportedException{
		super(pInicio);
		this.largo=largo;
	}


	public float getLargo() {
		return largo;
	}

	public void setLargo(float largo) {
		this.largo = largo;
	}

	@Override
	public String dibujar() {
		return ("Dibujando cuadrado");
	}

	@Override
	public String redimensionar() {
		return ("Redimensionando cuadrado");
	}

}
