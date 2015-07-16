package com.ipartek.formacion.holaclase.poo.bean;

public class Perro {
	
	//Atributos
	private int     patas;
	private String  nombre;
	private String  raza;
	private Persona amo;
	private boolean vacunado;
	private long    peso;
	private int     edad;
	
	
	
	//constructores
	
	public Perro(String nombre) {
		super();
		this.nombre = nombre;
		this.patas  = 4;
		this.raza   = "desconocida";
		try{
			this.amo = new Persona( "Abandonado" , Persona.EDAD_MINIMA );
		}catch(PersonaException e){			
			e.printStackTrace();
		}	
		this.vacunado = false;
		this.peso    = 0;
		this.edad    = 0;
	}

	//getters y setters

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

	
	
	
	//funciones y utilidades
	@Override
	public String toString() {
		return "Perro [patas=" + patas + ", nombre=" + nombre + ", raza="
				+ raza + ", amo=" + amo + ", vacunado=" + vacunado + ", peso="
				+ peso + ", edad=" + edad + "]";
	}
	
	/**
	 * 	Ladrido del Perro
	 * @return String con el ladrido
	 */
	public String ladrar(){
		return "GUA gua gua GUA!!!!";
	}	
	
	public void saltar( int metros, int altura ){
		
		System.out.println( this.nombre + " ha saltado " + metros + " metros"  );
		
	}
	
}
