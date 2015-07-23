package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {
	// Atributos
	private Punto p2;

	// Constructores
	/**
	 * Construye un objeto {@code ObjetoGrafico}
	 *
	 * @param pInicio
	 * @param pFin
	 * @throws CloneNotSupportedException
	 */
	public Linea(Punto pInicio, Punto pFin) throws CloneNotSupportedException {
		super(pInicio);
		this.p2 = pFin.clone();
	}

	// Getters y Setters
	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	// Metodos
	@Override
	public String dibujar() {
		return Linea.class.getSimpleName() + " dibujada";
	}

	@Override
	public String redimensionar() {
		return Linea.class.getSimpleName() + " redimensionada";
	}

}
