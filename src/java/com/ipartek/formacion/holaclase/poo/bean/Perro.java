package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

/**
 * Clase perro
 * @author Raul
 *
 */

public class Perro {
	//Atributos
	private String nombre = "";
	private String raza = "Desconocida";
	private Persona dueno = new Persona();
	private int patas = 4;
	private boolean vacunado = false;
	private long peso = (long)0.0;
	private int edad = 0;

	//Constructores
	public Perro() {
		super();
	}

	public Perro(String nombre) {
		super();
		this.setNombre(nombre);
		this.setRaza(raza);
		this.setDueno(new Persona("Abandonado", Persona.EDAD_MIN));
		this.setPatas(patas);
		this.setVacunado(vacunado);
		this.setPeso(peso);
		this.setEdad(edad);
	}



	public Perro(String nombre, String raza, Persona dueno, int patas,
			boolean vacunado, long peso) {
		super();
		this.setNombre(nombre);
		this.setRaza(raza);
		this.setDueno(dueno);
		this.setPatas(patas);
		this.setVacunado(vacunado);
		this.setPeso(peso);
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
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	//Metodos
	
	
	public String ladrar() {
		return ("Guau Guau");
	}
	
	public void saltar(int metros) {
		System.out.println(this.nombre + " ha saltado " + metros + " metros.");
	}

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", dueno="
				+ dueno + ", patas=" + patas + ", vacunado=" + vacunado
				+ ", peso=" + peso + ", edad=" + edad + "]";
	}
}
