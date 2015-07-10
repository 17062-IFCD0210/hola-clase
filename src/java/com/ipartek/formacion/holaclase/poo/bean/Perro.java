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
	private String 	raza;
	private Persona amo;
	private boolean	vacunado;
	private long	peso;
	private int 	edad;
	
	//Constructores
	public Perro(String nombre) {
		super();  //lama al objeto padre
		this.nombre=nombre;
		this.patas=4;
		this.raza="desconocida";
		this.amo = new Persona ("Abandonado",Persona.EDAD_MINIMA);
		this.vacunado=false;
		this.peso=0;
		this.edad=0;
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
	 * @return the raza
	 */
	public String getRaza() {
		return raza;
	}

	/**
	 * @param raza the raza to set
	 */
	public void setRaza(String raza) {
		this.raza = raza;
	}

	/**
	 * @return the amo
	 */
	public Persona getAmo() {
		return amo;
	}

	/**
	 * @param amo the amo to set
	 */
	public void setAmo(Persona amo) {
		this.amo = amo;
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

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}


	//funciones y utilidades
	
	@Override
	public String toString() {
		return "Perro [patas=" + patas + ", nombre=" + nombre + ", raza="
				+ raza + ", amo=" + amo + ", vacunado=" + vacunado + ", peso="
				+ peso + ", edad=" + edad + "]";
	}
	
	/**
	 * Ladrido del Perro
	 * @return String con el ladrido
	 */
	public String ladrar(){
		return "Guau guau";
	}
	
	public void saltar(int metros){
		//metodo que no devuelve ningun valor "void"
		System.out.println(this.nombre + " ha saltado " + metros + " metros");
	}

	
}
