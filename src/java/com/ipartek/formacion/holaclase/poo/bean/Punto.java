package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase interna {@code Punto}
 * @author Curso
 *
 */
public class Punto implements Cloneable{
	private int x;
	private int y;
	
	public Punto (int x, int y) {
		super();
		this.setX(x);
		this.setY(y);			
	}
	
	//getters y setters	
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
	public Punto clone() throws CloneNotSupportedException {
		return (Punto) super.clone();
	}
}
