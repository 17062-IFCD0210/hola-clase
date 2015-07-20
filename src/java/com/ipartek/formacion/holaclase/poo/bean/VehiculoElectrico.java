package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoElectrico extends Vehiculo {
	
	/* Tiene todos los atributos del padre mas los suyos propios.
	  Los del padre no hace falta definirlos de nuevo, se heredan.*/
	 
	private int capacidadBaterias;
	 
	
	/* Hemos usado el polimorfismo para que al construir un
	   coche electrico siempre tenga la potencia minima de 100.*/
	public VehiculoElectrico() {
		super();
		this.setPotencia(100);
		this.capacidadBaterias = 300;
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
	
	public boolean checkBateria() {
		return true;
	} 
	
	

}
