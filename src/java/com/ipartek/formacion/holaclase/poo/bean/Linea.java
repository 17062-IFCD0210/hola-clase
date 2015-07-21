package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {

	// private int xFinal,yFinal;
	private Punto puntoFinal;

	/**
	 * Construye un objeto {@code Linea} que extiende de {@code ObjetoGrafico} y
	 * necesitamos indicarle el punto de inicio y fin
	 *
	 * @param x
	 *            coordenada x de inicio
	 * @param y
	 *            coordenada y de inicio
	 * @param xFin
	 *            coordenada x de fin
	 * @param yFin
	 *            coordenada y de fin
	 * @throws CloneNotSupportedException
	 */
	public Linea(Punto pInicio, Punto pFin) throws CloneNotSupportedException {
		super(pInicio);
		this.puntoFinal = pFin;
	}

	public Punto getPuntoFinal() {
		return puntoFinal;
	}

	public void setPuntoFinal(Punto puntoFinal) {
		this.puntoFinal = puntoFinal;
	}

	@Override
	public String dibujar() {
		return Linea.class.getName() + " dibujada";
	}

	@Override
	public String redimensionar() {
		return Linea.class.getName() + " redimensionada";
	}

}
