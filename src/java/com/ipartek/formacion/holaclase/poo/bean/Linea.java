package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {

	private int xFin;
	private int yFin;

	/**
	 * Construye un objeto {@code Linea extends ObjetoGrafico} necesitamos
	 * indicarle el punto de inicio y fin
	 * 
	 * @param x
	 *            cordenada X de inicio
	 * @param y
	 *            cordenada y de inicio
	 * @param xFin
	 *            cordenada X de fin
	 * @param yFin
	 *            cordenada y de fin
	 */
	public Linea(int x, int y, int xFin, int yFin) {
		super(x, y);
		this.xFin = xFin;
		this.yFin = yFin;
	}

	public int getxFin() {
		return xFin;
	}

	public void setxFin(int xFin) {
		this.xFin = xFin;
	}

	public int getyFin() {
		return yFin;
	}

	public void setyFin(int yFin) {
		this.yFin = yFin;
	}

	@Override
	String dibujar() {
		return Linea.class.getName() + " dibujada";
	}

	@Override
	String redimensionar() {
		return Linea.class.getName() + " redimensionada";
	}

}
