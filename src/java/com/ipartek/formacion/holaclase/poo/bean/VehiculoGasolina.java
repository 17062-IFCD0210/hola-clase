package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoGasolina extends Vehiculo{

	//Constantes
	public static final String GASOLINA95 = "95";
	public static final String GASOLINA98 = "98";
	
	//Atributos
	private int capacidadDeposito;
	private String combustible;
	/**
	 * 
	 */
	public VehiculoGasolina() {
		super(); //Las nuevas versiones de Java lo meterían si no está escrito 
		this.setPotencia(500);
		
		setCapacidadDeposito(40); //mejor así por si en el setter añadimos código
		//capacidadDeposito = 40; //También
		//this.capacidadDeposito = 40; //También
		setCombustible(GASOLINA95);
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

	
	//Métodos
	@Override // sobreeescribimos el método de la clase Vehiculo
	public String arrancar() {
		
		return "Calentar inyectores - " + super.arrancar();
	}
	
	public boolean checkInyector(){
		return true;
	}
	
}
