package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase VehiculoElectrico que hereda de Vehiculo Tiene todos los atributos del
 * padre mas los suyos propios Los del padre no hace falta definirlos de nuevo,
 * se heredan automaticamente
 * 
 * @author Raul
 *
 */
public class VehiculoElectrico extends Vehiculo {
	// Atributos
	private int capacidadBateria;

	// Constructores
	/**
	 * Hemos usado el polimorfismo para que el construir un vehiculo la potencia
	 * minima sea de 100 en vez de 0
	 */
	public VehiculoElectrico() {
		super();
		this.setPotencia(100);
		this.setCapacidadBateria(300);
	}

	// Getters y Setters
	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	// Metodos
	@Override
	public String arrancar() {
		return "Check Bateria - " + super.arrancar();
	}

	public boolean checkBateria() {
		return true;
	}
}