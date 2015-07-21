package com.ipartek.formacion.holaclase.poo.bean;

public class Linea extends ObjetoGrafico {



	private int xFin;
	private int yFin;
	
	/**
	 * Construye un objeto {@code Linea extends ObjetoGrafico}
	 * necesitamos indicarle el punto de inicio y de fin
	 * @param x coordenada x de inicio
	 * @param y coordenada y de fin
	 * @param xFin coordenada x de fin
	 * @param yFin coordenada y de fin
	 */
	public Linea(int x, int y, int xFin, int yFin) {
		super(x, y);
		this.xFin = xFin;
		this.yFin = yFin;
	}
	
	
	
	//Getters y setters
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
				//Coje el nombre de la clase
	}

	@Override
	String redimensionar() {
		return Linea.class.getName() + " redimensionada";
	}
	

}
