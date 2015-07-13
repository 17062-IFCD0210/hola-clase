/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * @author Curso
 *
 */
public class Perro {
	//Constantes
	
	//Atributos
	int		 patas;
	String   nombre;
	int	     edad;
	String	 raza;
	Persona  amo;
	boolean  vacunado;
	long	 peso;
	
	//Constructores
	public Perro(String nombre){
		super();
		this.nombre = nombre;
		this.patas  = 4;
		this.raza   = "Desconocida";
		this.amo	= new Persona ("Abandonado" , Persona.EDAD_MINIMA );
		this.vacunado = false;
		this.peso = 0;
		this.edad = 0;
	}


	
	//Getters y Setters
	
	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public Persona getAmo() {
		return amo;
	}

	public void setAmo(Persona amo) {
		this.amo = amo;
	}

	public boolean isVacunado() {
		return vacunado;
	}

	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}




	
	
	
	//Metodos y Utilidades
	@Override
	public String toString() {
		return "Perro [patas=" + patas + ", nombre=" + nombre + ", edad="
				+ edad + ", raza=" + raza + ", amo=" + amo + ", vacunado="
				+ vacunado + ", peso=" + peso + "]";
	}
	
	/**
	 * Ladrido del Perro
	 * @return String con el ladrido
	 */
	public String ladrar(){
		return "GUAU guau guau GUAU!!!";
	}
	public void saltar( int metros){
		System.out.println(this.nombre + " ha saltado" + metros + " metros");
	}
}
