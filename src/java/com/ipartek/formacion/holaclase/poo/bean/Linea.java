package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {

	private Punto p2;

	/**
	 * Construye un objeto {@code Linea extends ObjetoGrafico} necesitamos
	 * indicarle el punto de inicio y fin
	 *
	 * @throws CloneNotSupportedException
	 *
	 */
	public Linea(Punto pInicio, Punto pFin) throws CloneNotSupportedException {
		super(pInicio);
		this.p2 = pFin.clone();
	}

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
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
