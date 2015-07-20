package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

/**
 * Bean para modelar una Persona fisica
 * @author Raul
 * @version 1.0
 * @date 2015/07/09
 */

public class Persona {
	//Constantes
	public static final int EDAD_MIN = 18;
	public static final int EDAD_MAX = 99;

	//Atributos
	private String nombre = "Anonimo";
	private String apellido = "Sin Determinar";
	private int edad = EDAD_MIN;
	private String email = "";
	
	//Constructores
	public Persona() {
		super();
	}
	
	public Persona(String nombre, int edad) throws ExcepcionPersona {
		this(); // Llamada al constructor por defecto (Persona())
		this.setNombre(nombre);
		this.setEdad(edad);
	}

	public Persona(String nombre, String apellido, int edad, String email) throws ExcepcionPersona {
		super();
		//Nombre
		this.setNombre(nombre);
		
		//Apellido
		this.setApellido(apellido);
		
		//Edad
		this.setEdad(edad);
		
		//Email
		this.setEmail(email);
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}
	/**
	 * Comprobacion de edades segun su rango
	 * <ul>
	 *  <li>Si es menor de 0 lanzamos excepcion de menor de 0</li>
	 * 	<li>Si es menor de 18 lanzamos excepcion de menor de 18</li>
	 * 	<li>Si es mayor de 99 lanzamos excepcion de mayor de 99</li>
	 * </ul>
	 * @param edad devuelve la edad correcta (Entre 18 y 99)
	 * @throws ExcepcionPersona puede lanzar excepciones para casos excepcionales
	 */
	public void setEdad(int edad) throws ExcepcionPersona{
		if(edad < 0) {
			throw new ExcepcionPersona(ExcepcionPersona.MESSAGE_EDAD_NEGATIVA);
		} else if(edad > EDAD_MAX) {
			throw new ExcepcionPersona(ExcepcionPersona.MESSAGE_EDAD_MAYOR);
		} else if(edad < EDAD_MIN && edad >=0){
			throw new ExcepcionPersona(ExcepcionPersona.MESSAGE_EDAD_MENOR);
		} else {
			this.edad = edad;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//Metodos y utilidades
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + "]";
	}
	
	
}


