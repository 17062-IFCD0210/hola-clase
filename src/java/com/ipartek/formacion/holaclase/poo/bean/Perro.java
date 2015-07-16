/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.excepciones.PersonaException;

/**
 * Bean para modelar un perro fisico
 * 
 * @author David
 *
 */
public class Perro {

	// constantes

	
	// atributos
	
	private Persona amo;
	private int edad;
	private String nombre;
	private int patas;
	private long peso;
	private String raza;
	private boolean vacunado;

	// constructores

	public Perro(String nombre){
		super();
		this.nombre = nombre;
		this.patas = 4;
		this.raza = "desconocida";
		try{
		this.amo = new Persona("Abandonado", Persona.EDAD_MINIMA);
		}catch(PersonaException e){
			e.printStackTrace();
		}
		this.vacunado = false;
		this.peso = 0;
		this.edad = 0;
	}

	// getters y setters

	/**
	 * @return the amo
	 */
	public Persona getAmo() {
		return amo;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the patas
	 */
	public int getPatas() {
		return patas;
	}

	/**
	 * @return the peso
	 */
	public long getPeso() {
		return peso;
	}

	/**
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @return the vacunado
	 */
	public boolean isVacunado() {
		return vacunado;
	}

	/**
	 * @param amo
	 *            the amo to set
	 */
	public void setAmo(Persona amo) {
		this.amo = amo;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param patas
	 *            the patas to set
	 */
	public void setPatas(int patas) {
		this.patas = patas;
	}

	/**
	 * @param peso
	 *            the peso to set
	 */
	public void setPeso(long peso) {
		this.peso = peso;
	}

	/**
	 * @param raza
	 *            the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	/**
	 * @param vacunado
	 *            the vacunado to set
	 */
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	// metodos y utilidades

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Perro [amo=" + amo + ", edad=" + edad + ", nombre=" + nombre
				+ ", patas=" + patas + ", peso=" + peso + ", raza=" + raza
				+ ", vacunado=" + vacunado + "]";
	}

	/**
	 * Ladrido del perro
	 * @return String con el ladrido
	 */
	public String ladrar(){
		return ("Guau! Guau!");
	}
	
	public void saltar(int metros){
		System.out.println(this.getNombre() + " ha saltado "+ metros + " metros.");
	}
}
