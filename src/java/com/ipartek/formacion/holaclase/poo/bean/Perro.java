/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Bean para modelar un Perro
 * @author Mikel
 *
 */
public class Perro {
	
	//Atributos
	private String 	nombre;
	private String 	raza;
	private Persona amo;
	private int 	patas;
	private boolean vacunado;
	private long 	peso;
	private int 	edad;
	

	//Constructores
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.patas = 4;
		this.raza = "desconocida";
		this.amo = new Persona ("Abandonado", Persona.EDAD_MINIMA ); //Al ser un atributo estatico se puede acceder al atributo?
		this.vacunado = false;
		this.peso = 0;
		this.edad = 0;
	}

	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
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


	public int getPatas() {
		return patas;
	}


	public void setPatas(int patas) {
		this.patas = patas;
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


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	//Funciones y utilidades
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", amo=" + amo
				+ ", patas=" + patas + ", vacunado=" + vacunado + ", peso="
				+ peso + ", edad=" + edad + "]";
	}
	
	/**
	 * Ladrido del perro
	 * @return String con el ladrido
	 */
	public String ladrar() {
		return "guau guau guau guau!!";
	}
	
	public void saltar( int metros, int altura ) {
		System.out.println(this.nombre + " ha saltado " + metros + " metros");
	}
	

} // FIN public class Perro
