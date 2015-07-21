package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {
	
	int largo;
	

	/**
	 * Constructor que crea un punto (el cuadrado menor posible)
	 */
	public Cuadrado(){
		super();
		largo=0;
	}

	/**
	 * Constructor que crea un cuadrado
	 * @param x: coordenada x del centro
	 * @param y: coordenada y del centro
	 * @param largo: longitud del lado del cuadrado
	 */
	public Cuadrado(int x, int y, int largo){
		super();
		super.setX(x);
		super.setY(y);
		this.largo=largo;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	@Override
	protected String dibujar() {
		return ("Dibujando cuadrado");
	}

	@Override
	protected String redimensionar() {
		return ("Redimensionando cuadrado");
	}

}
