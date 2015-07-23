package com.ipartek.formacion.holaclase.poo.bean;

public class Cuadrado extends ObjetoGrafico {
	// Atributos
	private Punto p2;
	private Punto p3;
	private Punto p4;

	// Constructores
	public Cuadrado(Punto p1, Punto p2, Punto p3, Punto p4)
			throws CloneNotSupportedException {
		super(p1);
		this.p2 = p2.clone();
		this.p3 = p3.clone();
		this.p4 = p4.clone();
	}

	// Getters y Setters
	public Punto getP2() {
		return p2;
	}

	public void setP2(Punto p2) {
		this.p2 = p2;
	}

	public Punto getP3() {
		return p3;
	}

	public void setP3(Punto p3) {
		this.p3 = p3;
	}

	public Punto getP4() {
		return p4;
	}

	public void setP4(Punto p4) {
		this.p4 = p4;
	}

	// Metodos

	@Override
	public String dibujar() {
		return "Voy a dibujar un cuadrado";
	}

	@Override
	public String redimensionar() {
		return "Voy a redimensionar un cuadrado";
	}

}