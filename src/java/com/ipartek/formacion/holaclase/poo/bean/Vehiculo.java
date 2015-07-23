package com.ipartek.formacion.holaclase.poo.bean;

public class Vehiculo {
	//Atributos
	private int numPlazas;
	private String dimensiones;
	private int potencia;
	private String modelo;
	
	//Constructores
	public Vehiculo() {
		super();
		this.setNumPlazas(1);
		this.setDimensiones("");
		this.setPotencia(0);
		this.setModelo("Sin Determinar");
	}
	
	//Getters y Setters
	public int getNumPlazas() {
		return numPlazas;
	}

	public void setNumPlazas(int numPlazas) {
		this.numPlazas = numPlazas;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	//Metodos
	@Override
	public String toString() {
		return "Vehiculo [numPlazas=" + numPlazas + ", dimensiones="
				+ dimensiones + ", potencia=" + potencia + ", modelo=" + modelo
				+ "]";
	}
	
	public String arrancar() {
		return "Vehiculo Arrancado";
	}
	
	
	
}
