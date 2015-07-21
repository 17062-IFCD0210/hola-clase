package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.bean.ObjetoGrafico.Punto;

public class Linea extends ObjetoGrafico {
	
	private Punto p2;
	
	/**
	 * Costruye un objeto {@code Linea extends ObjetoGrafico} y necesitamos indicarle el punto de inicio y fin
	 * @throws CLoneNotSupportedException  			
	 */
	public Linea(Punto pInicio, Punto pFin) {
		super(pInicio);
		this.p2 = pFin;
	}
	

	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
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

