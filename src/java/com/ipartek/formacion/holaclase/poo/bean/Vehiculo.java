package com.ipartek.formacion.holaclase.poo.bean;

public class Vehiculo {

	private String modelo;
	private int    numeroPlazas;
	private String dimensiones;
	private int    potencia;
	
	
	public Vehiculo() {
		super();
		this.modelo = "Sin determinar";
		this.numeroPlazas = 1;
		this.dimensiones = "";
		this.potencia = 0;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getNumeroPlazas() {
		return numeroPlazas;
	}


	public void setNumeroPlazas(int numeroPlazas) {
		this.numeroPlazas = numeroPlazas;
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


	@Override
	public String toString() {
		return "Vehiculo [modelo=" + modelo + ", numeroPlazas=" + numeroPlazas
				+ ", dimensiones=" + dimensiones + ", potencia=" + potencia
				+ "]";
	}
	
	public String arrancar(){
		return "Vehiculo arrancado";
	}
	
	
	
}
