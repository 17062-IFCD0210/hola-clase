package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {

	private int alto;
	private int ancho;
	
	/**
	 * @param alto
	 * @param ancho
	 */
	public Cuadrado(int alto, int ancho) {
		super();
		this.setAlto(alto);
		this.setAncho(ancho);
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public String dibujar() {
		return "Dibujado un cuadrado desde (" + this.getX() + "," + this.getY() + ") con altura " + this.getAlto() + " y anchura " + this.getAncho();
	}

	@Override
	public String Redimensionar() {
		return "Cuadrado redimensionado";
	}

}
