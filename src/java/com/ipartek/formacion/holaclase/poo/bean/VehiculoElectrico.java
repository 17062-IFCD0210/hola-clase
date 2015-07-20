package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoElectrico extends Vehiculo {
	
	/*
	 * Tiene todos los atributos del Padre mas los suyos propios
	 * Los del padre no hace falta definirlos de nuevo, se HEREDAN!!!
	 */
	private int capacidadBaterias;

	/*
	 * Hemos usado el polimorfismo para que al contruir un
	 * VehiculoElectrico la potencia sea de 100 en vez de 0
	 */
	public VehiculoElectrico() {
		super();
		this.setPotencia(100);
		this.setCapacidadBaterias(300);
	}

	public int getCapacidadBaterias() {
		return capacidadBaterias;
	}

	public void setCapacidadBaterias(int capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}

	@Override
	public String arrancar() {		
		return "Check bateria - " + super.arrancar();
	}
	
	
	public boolean checkBateria(){
		boolean resul = true;
		return resul;
	}
}
