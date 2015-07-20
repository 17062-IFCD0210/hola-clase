package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoElectrico extends Vehiculo {

	/*Tiene tosos los atributos del Padre + los suyos propios*/
	/*Los atributos del Padre no hace falta definirlo de nuevo, se heredan. Definimos los propios*/
	private int capacidadBaterias;
	
	
	
	/*Hemos usado el POLIMORFISMO para que al construir un Vehiculo Electrico,siempre tenga la 
	  potencia minima de 100, en vez de 0(como el Padre)*/
	public VehiculoElectrico() {
		super();//Hace referencia al padre que es Vehiculo, de quien hereda las propiedades
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
		//como hereda, le digo que haga Check bateria + lo que hace el Padre
		return "Check bateria - " + super.arrancar();
	}
	
	public boolean checkBateria(){
		return true;
	}
	
	

}
