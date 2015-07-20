package com.ipartek.formacion.holaclase.poo.bean;


public class Linea extends ObjetoGrafico {

	int xFinal,yFinal;
	
	public Linea(){
		super();
		xFinal=0;
		yFinal=0;
	}

	public Linea(int x, int y, int xFinal, int yFinal){
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
		return ("Dibujando linea");

	}

	@Override
	protected String redimensionar() {
		return ("Redimensionando linea");

	}

}
