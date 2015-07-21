package com.ipartek.formacion.holaclase.poo.bean;


public class Linea extends ObjetoGrafico {

	private int distanciaX;
	private int distanciaY;

	/**
	 * Creamos una {@code Linea extends ObjetoGrafico} que se inicia en un punto y termina en otro
	 * @param x coordenada de inicio x
	 * @param y coordenada de inicio y
	 * @param distanciaX coordenada de fin x
	 * @param distanciaY coordenada de fin y
	 */
	public Linea(int x, int y, int distanciaX, int distanciaY) {
		super(x,y);
		this.setDistanciaX(distanciaX);
		this.setDistanciaY(distanciaY);
	}

	public int getDistanciaX() {
		return distanciaX;
	}

	public void setDistanciaX(int distanciaX) {
		this.distanciaX = distanciaX;
	}

	public int getDistanciaY() {
		return distanciaY;
	}

	public void setDistanciaY(int distanciaY) {
		this.distanciaY = distanciaY;
	}



	@Override
	public String dibujar() {
		return "Dibujada una linea desde (" + this.getX() + "," + this.getY() + ") hasta (" +
										this.getDistanciaX() + "," + this.getDistanciaY() + ").";
	}

	@Override
	public String Redimensionar() {
		return Linea.class.getName() + " redimensionada";
	}

}
