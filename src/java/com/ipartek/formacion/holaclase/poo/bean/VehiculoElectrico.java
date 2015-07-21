package com.ipartek.formacion.holaclase.poo.bean;

public class VehiculoElectrico extends Vehiculo {

	/*Tiene todos los atributos del padre m�s los suyos propios*/
	/*Los del padre no hace falta definirlos de nuevo, se heredan!!!*/
	private int capacidadBaterias;
	
	
	/*Hemos usado el polimorfismo para que al construir un VehiculoElectrico la potencia m�nima sea 100 en vez de 0*/
	public VehiculoElectrico() {
		super(); //Hace referencia a Vehiculo. Las nuevas versiones de Java lo meter�an si no est� escrito
		this.setPotencia(100); //Polimorfismo
		this.capacidadBaterias = 300; //para herencia. Un atributo m�s
	}


	public int getCapacidadBaterias() {
		return capacidadBaterias;
	}


	public void setCapacidadBaterias(int capacidadBaterias) {
		this.capacidadBaterias = capacidadBaterias;
	}


	@Override // sobreeescribimos el m�todo de la clase Vehiculo
	public String arrancar() {
		
		return "Check bater�a - " + super.arrancar();
	}

	public boolean checkBateria(){
		return true;
	}
	
	
	
}
