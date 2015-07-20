package com.ipartek.formacion.holaclase.poo.bean;

public class Rectangulo extends ObjetoGrafico {

	int xFinal,yFinal;
	
	public Rectangulo(){
		super();
		xFinal=0;
		yFinal=0;
	}

	public Rectangulo(int x, int y, int xFinal, int yFinal){
		super();
		super.setX(x);
		super.setY(y);
		this.xFinal=xFinal;
		this.yFinal=yFinal;
	}
	
	
	public int getxFinal() {
		return xFinal;
	}

	public void setxFinal(int xFinal) {
		this.xFinal = xFinal;
	}

	public int getyFinal() {
		return yFinal;
	}

	public void setyFinal(int yFinal) {
		this.yFinal = yFinal;
	}
	
	@Override
	protected String dibujar() {
		return ("Dibujando rectangulo");

	}

	@Override
	protected String redimensionar() {
		return ("Redimensionando rectangulo");

	}
}
