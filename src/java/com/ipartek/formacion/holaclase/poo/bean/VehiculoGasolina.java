package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoGasolina extends Vehiculo{
	
	//Constantes
	public static final String GASOLINA95 = "95";
	public static final String GASOLINA98 = "98";
	
	//Atributos
	private int capacidadDeposito;
	private String combustible;
	
	//Constructor
	public VehiculoGasolina() {
		super();
		this.setPotencia(500);	
		this.setCombustible(GASOLINA95);
		this.setCapacidadDeposito(40);
	}

	//getters y setters
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
		return "Calentar inyectores - " + super.arrancar();
	}
	
	public boolean checkInjector(){
		boolean resul = true;
		return resul;
	}
	
}
