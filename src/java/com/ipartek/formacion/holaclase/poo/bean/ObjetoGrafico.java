package com.ipartek.formacion.holaclase.poo.bean;

public abstract class ObjetoGrafico {
	
	private int x,y;
	
	
	protected abstract String dibujar();
	protected abstract String redimensionar();

	public ObjetoGrafico(){
		super();
		x=0;
		y=0;
	}
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	String moverA(int nuevaX, int nuevaY){
		return("Me he movido a " + nuevaX + " , " + nuevaY);
		
	}
	 
	
}
