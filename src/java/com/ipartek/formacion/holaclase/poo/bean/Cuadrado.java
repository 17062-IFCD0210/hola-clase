package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {
	
	int largo;
	
	public Cuadrado(){
		super();
		largo=0;
	}

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
