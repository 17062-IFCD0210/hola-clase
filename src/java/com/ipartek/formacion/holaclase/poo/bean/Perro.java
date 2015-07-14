/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

class Perro {
	
	//Constantes
	private final int NUM_PATAS = 4;
	
	//Atributos
	private int patas;
	private String nombre;
	private String raza;
	private Persona amo;
	private boolean vacunado;
	private long peso;
	private int edad;
	
	// Constructores
	public Perro(String nombre) {
		super();
		this.nombre   = nombre;
		this.patas    = NUM_PATAS;
		this.raza     = "desconocida";
		this.amo      = new Persona("Abandonado", Persona.EDAD_MINIMA);
		this.vacunado = false;
		this.peso     = 0;
		this.edad     = 0;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNUM_PATAS() {
		return NUM_PATAS;
	}

	
	//Funciones
	@Override
	public String toString() {
		return "Perro [NUM_PATAS=" + NUM_PATAS + ", patas=" + patas
				+ ", nombre=" + nombre + ", raza=" + raza + ", amo=" + amo
				+ ", vacunado=" + vacunado + ", peso=" + peso + ", edad="
				+ edad + ", toString()=" + super.toString() + "]";
	}
	
	/**
	 * Ladrido del Perro
	 * @return String con el ladrido
	 */
	public String ladrar(){
		return "GUAU GUAU GUAU GUAU!!!";  
	}
	
	public void saltar(int metros){ //Función que no devuelve un valor (void)
		System.out.println(this.nombre + " ha saltado " + metros + " metros");
	}
}
