package com.ipartek.formacion.holaclase.poo.bean;

public abstract class ObjetoGrafico {
	
	int x;
	int y;
	
	
	
	public ObjetoGrafico() {
		super();
		this.x = 0;
		this.y = 0;
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


	@Override
	public String toString() {
		return "ObjetoGrafico [x=" + x + ", y=" + y + "]";
	}
	
	public String mover(int x, int y){
		return "Elemento movido";  
	}
	
	
	abstract void dibujar();
	abstract void redimensionar();
	
	
}
