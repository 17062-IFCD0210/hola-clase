package com.ipartek.formacion.holaclase.poo.bean;


public class Linea extends ObjetoGrafico {

	private Punto p2;

	/**
	 * Creamos una {@code Linea extends ObjetoGrafico} que se inicia en un punto y termina en otro
	 * @param x coordenada de inicio x
	 * @param y coordenada de inicio y
	 * @param distanciaX coordenada de fin x
	 * @param distanciaY coordenada de fin y
	 * @throws CloneNotSupportedException 
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
		return "Dibujada una linea desde (" + super.getP1().getX() + "," + this.getP1().getY() + ") hasta (" +
										this.p2.getX() + "," + this.p2.getY() + ").";
	}


	@Override
	public String Redimensionar() {
		return Linea.class.getName() + " redimensionada";
	}

}
