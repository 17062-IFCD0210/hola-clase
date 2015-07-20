package com.ipartek.formacion.holaclase.poo.bean;

public abstract class ObjetoGrafico {
	
	private int x = 0;
	private int y = 0;
	
		
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

	
	public String moverA (int nuevaX, int nuevaY){
		this.setX(nuevaX);
		this.setY(nuevaY);
		
		return "Objeto Grafico movido a: x=" + this.getX() + " y=" + this.getY();
	}
	
	protected abstract String dibujar();
	
	protected abstract String Redimensionar();

}
