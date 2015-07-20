package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoDiesel extends Vehiculo {
	
	//Constantes
	public static final String DIESEL = "diesel";
		
	//Atributos
	private int capacidadDeposito;
	private String combustible;
	
	public VehiculoDiesel() {
		super();
		this.setPotencia(450);
		this.setCapacidadDeposito(50);
		this.combustible = DIESEL;
	}

	public int getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public void setCapacidadDeposito(int capacidadDeposito) {
		this.capacidadDeposito = capacidadDeposito;
	}

	public String getCombustible() {
		return combustible;
	}
	
}
