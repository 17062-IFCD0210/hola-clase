package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoGasolina extends Vehiculo {
	
	//Constantes
	public static final String GASOLINA95 = "95";
	public static final String GASOLINA98 = "98";
	
	//Atributos
	private int CapacidadDeposito;
	private String combustible;

	//Constructor
	public VehiculoGasolina() {
		super();
		this.setCapacidadDeposito(40);
		this.setPotencia(500);
		this.setCombustible(GASOLINA95);
		
	}
	
	
	//Getters y Setters
	public int getCapacidadDeposito() {
		return CapacidadDeposito;
	}

	public void setCapacidadDeposito(int capacidadDeposito) {
		CapacidadDeposito = capacidadDeposito;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public static String getGasolina95() {
		return GASOLINA95;
	}

	public static String getGasolina98() {
		return GASOLINA98;
	}
	
	@Override
	public String arrancar() {
		return "Calentar inyectores - " + super.arrancar();
	}
	
	public boolean checkInyector() {
		return true;
	} 
	
			
}
