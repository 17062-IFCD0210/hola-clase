package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {

	private int distanciaX;
	private int distanciaY;

	/**
	 * @param distanciaX
	 * @param distanciaY
	 */
	public Linea(int distanciaX, int distanciaY) {
		super();
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
		return "Linea redimensionada";
	}

}
