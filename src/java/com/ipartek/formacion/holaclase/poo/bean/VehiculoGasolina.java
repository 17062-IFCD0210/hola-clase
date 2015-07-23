package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase VehiculoGasolina que hereda de su padre Vehiculo Todos los atributos
 * del padre se heredan automaticamente
 * 
 * @author Raul
 *
 */
public class VehiculoGasolina extends Vehiculo {
	// Constantes
	public static final String GASOLINA95 = "95";
	public static final String GASOLINA98 = "98";

	// Atributos
	private int capacidadDeposito;
	private String combustible;

	// Constructores
	public VehiculoGasolina() {
		super();
		this.setPotencia(500);
		this.setCapacidadDeposito(40);
		this.setCombustible(GASOLINA95);
	}

	// Getters y Setters
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

	// Metodos
	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return "Calentar inyectores - " + super.arrancar();
	}

	public boolean checkInyector() {
		return true;
	}
}