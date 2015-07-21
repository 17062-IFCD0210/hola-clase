package com.ipartek.formacion.holaclase.poo.bean;

public class Vehiculo {

	private int numeroPlazas;
	private String dimensiones;
	private int potencia;
	private String modelo;

	public Vehiculo() {
		super(); //Hace referencia a Java.Lang.Object
		this.modelo = "Sin determinar";
		this.numeroPlazas = 1;
		this.dimensiones ="";
		this.potencia = 0;
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

	@Override //Sobreescribe/recarga el método ya existente de Java.Lang.Object
	public String toString() {
		return "Vehiculo [numeroPlazas=" + numeroPlazas + ", dimensiones="
				+ dimensiones + ", potencia=" + potencia + ", modelo=" + modelo
				+ "]";
	}
	
	//Métodos
	//final public String arrancar(){ //No puede sobreescribirse en sus hijos. Capamos la herencia
	public String arrancar(){ //No puede sobreescribirse en sus hijos. Capamos la herencia
		return "Vehículo arrancado";
	}
	
	
	
	
	
	
	
	
	
	
}
