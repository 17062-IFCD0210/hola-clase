package com.ipartek.formacion.holaclase.poo.bean;

public abstract class ObjetoGrafico {
	//Atributos
	private int x;
	private int y;
	
	//Constructores
	public ObjetoGrafico() {
		super();
		this.setX(0);
		this.setY(0);
	}
	
	public ObjetoGrafico(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}


	//Getters y Setters
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
	
	//Metodos
	public String mover(int nuevaX, int nuevaY) {
		return "Me he movido a la posicion X: " + nuevaX + " Y: " + nuevaY; 
	}
	
	public abstract String dibujar();
	public abstract String redimensionar();


}
