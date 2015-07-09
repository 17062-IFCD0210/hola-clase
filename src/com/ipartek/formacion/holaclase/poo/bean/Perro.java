package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase perro
 * @author Raul
 *
 */

public class Perro {
	//Atributos
	private String nombre = "";
	private String raza = "";
	private Persona dueno;
	private int patas = 0;
	private boolean vacunado = false;
	long peso = (long)0.0;
	
	//Constructores
	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String nombre, String raza, Persona dueno, int patas,
			boolean vacunado, long peso) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.dueno = dueno;
		this.patas = patas;
		this.vacunado = vacunado;
		this.peso = peso;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Persona getDueno() {
		return dueno;
	}

	public void setDueno(Persona dueno) {
		this.dueno = dueno;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}
	
	
	//Metodos
	public void ladrar() {
		System.out.println("Guau Guau");
	}
}
