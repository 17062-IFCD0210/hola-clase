/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.excepciones.PersonaException;

/**
 * Bean para modelar una persona fisica
 * @author David
 *
 */
public class Persona {
	
	//Constantes
	
	public static final int EDAD_MAXIMA=99;
	public static final int EDAD_MINIMA=18;
	
	//Atributos
	
	private String 	nombre;
	private String 	apellidos;
	private int 	edad;
	private String 	email;
	private boolean Aprobado;
	private long	nota;
	
	
	//Constructores
	
	public Persona() {
		super();
		this.nombre 	= "Anonimo";
		this.apellidos	= "Sin Determinar";
		this.edad		= EDAD_MINIMA;
		this.email		= "";
		this.Aprobado	= false;
		this.nota		= (long)0.0;
	}

	//Constructor con parametros
	
	/**
	 * Constructor con parametros
	 * @param nombre nombre de la persona
	 * @param edad edad de la persona
	 * @throws PersonaException 
	 */
	public Persona(String nombre, int edad) throws PersonaException {
		this();
		this.setNombre(nombre);
		this.setEdad(edad);
	}



	//Getters y Setters
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public int getEdad() {
		return edad;
	}

	/**
	 * Edad comprendida entre 18 y 99
	 * <ul>
	 * <li>Si es menor que 18 seteamos a 18</li>
	 * <li>Si es mayor que 99 seteamos a 99</li>
	 * </ul>
	 * @param edad
	 * @throws PersonaException 
	 */
	public void setEdad(int edad) throws PersonaException {
		
		if (edad<0){
			throw new PersonaException(PersonaException.COD_EDAD_NEGATIVA);
		}else if (edad>=0 && edad<EDAD_MINIMA){
			throw new PersonaException(PersonaException.COD_MENOR_EDAD);
		}else if (edad>=EDAD_MINIMA && edad<EDAD_MAXIMA){
			this.edad=edad;
		}else{
			throw new PersonaException(PersonaException.COD_EDAD_ALTA);
		}
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isAprobado() {
		return Aprobado;
	}


	public void setAprobado(boolean aprobado) {
		Aprobado = aprobado;
	}


	public long getNota() {
		return nota;
	}


	public void setNota(long nota) {
		this.nota = nota;
	}
	
	//Metodos y Utilidades
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos
				+ ", edad=" + edad + ", email=" + email + ", Aprobado="
				+ Aprobado + ", nota=" + nota + "]";
	}
	
	
	
	
	
}
