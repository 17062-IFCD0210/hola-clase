package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoGasolina extends Vehiculo {
	
	//Constantes
	public static final String GASOLINA95 = "95";
	public static final String GASOLINA98 = "98";
	
	
	//Atributos propios
	private int capacidadDeposito;
	private String combustible;
	
	//Constructor
	public VehiculoGasolina() {
		super();
		this.setPotencia(500);
		this.setCapacidadDeposito(40);
		this.setCombustible(GASOLINA95);
		
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

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String arrancar() {
		//como hereda, le digo que haga Check bateria + lo que hace el Padre
		return "Calentar Inyectores - " + super.arrancar();
	}
	public boolean checkInyector(){
		return true;
	}
	
}
