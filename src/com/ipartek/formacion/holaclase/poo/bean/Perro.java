/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * @author Curso
 *
 */
public class Perro {

	
	//Atributos
	private int 	patas;
	private String 	nombre;
	private String 	dueno;
	private boolean	vacunado;
	private long	peso;
	
	//Constructores
	public Perro() {
		super();  //lama al objeto padre
		this.patas	  = 4;
		this.nombre   = "Perro";
		this.dueno 	  = "Perrera";
		this.vacunado =	false;
		this.peso	  = (long)0.0;
		
	
	}

	//Getters y setters
	
	/**
	 * @return the patas
	 */
	public int getPatas() {
		return patas;
	}

	/**
	 * @param patas the patas to set
	 */
	public void setPatas(int patas) {
		this.patas = patas;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the dueno
	 */
	public String getDueno() {
		return dueno;
	}

	/**
	 * @param dueno the dueno to set
	 */
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	/**
	 * @return the vacunado
	 */
	public boolean isVacunado() {
		return vacunado;
	}

	/**
	 * @param vacunado the vacunado to set
	 */
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}

	/**
	 * @return the peso
	 */
	public long getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(long peso) {
		this.peso = peso;
	}
	
	//Metodos y Utilidades
	public String ladrar(){
		return "guau guau";
	}

	
}
