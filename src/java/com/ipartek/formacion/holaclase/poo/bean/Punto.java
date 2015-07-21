package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase {@code Punto} que se dedica a coger los puntos {@code X} e {@code Y} de
 * la clase
 *
 * @author Raul
 *
 */
public class Punto implements Cloneable {
	// Atributos
	private int x;
	private int y;

	// Constructores
	public Punto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}

	// Getters y Setters
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

	// Metodos
	@Override
	public Punto clone() throws CloneNotSupportedException {
		return (Punto) super.clone();
	}
}
