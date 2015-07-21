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
		super(); //Las nuevas versiones de Java lo meter�an si no est� escrito 
		this.setPotencia(500);
		
		setCapacidadDeposito(40); //mejor as� por si en el setter a�adimos c�digo
		//capacidadDeposito = 40; //Tambi�n
		//this.capacidadDeposito = 40; //Tambi�n
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

	
	//M�todos
	@Override // sobreeescribimos el m�todo de la clase Vehiculo
	public String arrancar() {
		
		return "Calentar inyectores - " + super.arrancar();
	}
	
	public boolean checkInyector(){
		return true;
	}
	
}
