package com.ipartek.formacion.holaclase.poo.bean;

public class Vehiculo {
	
	private String modelo;
	private int    numeroPlazas;
	private String dimensiones;
	private int    potencia;

	
	public Vehiculo() {
		super();
		this.setModelo("Sin determinar");
		this.setNumeroPlazas(1);
		this.setDimensiones("");
		this.setPotencia(0);
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
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
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
