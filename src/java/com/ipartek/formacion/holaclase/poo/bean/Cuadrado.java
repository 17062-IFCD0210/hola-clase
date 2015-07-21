package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {

	private int alto;
	private int ancho;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param alto
	 * @param ancho
	 * @throws CloneNotSupportedException 
	 */
	public Cuadrado(Punto p, int alto, int ancho) throws CloneNotSupportedException {
		super(p);
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
		return "Dibujado un cuadrado desde (" + this.getP1().getX() + "," + this.getP1().getY() + ") con altura " + this.getAlto() + " y anchura " + this.getAncho();
	}

	@Override
	public String Redimensionar() {
		return Cuadrado.class.getName() + " redimensionado";
	}

}
