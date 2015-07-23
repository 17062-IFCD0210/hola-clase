/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

/**
 * Bean para modelar una Persona fisica
 * @author Javi
 *
 */
public class Persona implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Constantes
	//se declara public para poder usarlos desde fuera
	//se declara final pq su valor no cambiara, son constantes
	//se declara static para poder usarlo desde fuera accediendo directamente 
	//al nombre de la clase Persona.EDAD_MINIMA
	public static final int EDAD_MINIMA = 18; 
	public static final int EDAD_MAXIMA = 99;
	
	//Atributos
	private String 	nombre;
	private String 	apellido;
	private int 	edad;
	private String 	email;

	
	//Constructores
	public Persona() {
		super();  //lama al objeto padre
		this.nombre   = "Anonimo";
		this.apellido = "Sin Determinar";
		this.edad	  = EDAD_MINIMA;
		this.email	  = "";
	}
	
	//Constructor con parametros
	
	/**
	 * Constructor con parametros
	 * @param nombre nombre de la Persona
	 * @param edad edad de la Persona
	 */
	public Persona(String nombre, int edad) throws PersonaException {
		this(); //llama al constructor por defecto Persona()
		this.setNombre ( nombre);
		this.setEdad (edad);
	}


	
	//Getters y Setters

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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Edad estara comprendida entre 18 y 99
	 * <ul>
	 *   <li>Si es menor que 18 seteamos a 18</li>
	 *   <li>Si es mayor que 99 seteamos a 99</li>
	 * </ul>
	 * @param edad the edad to set
	 * @throws PersonaException 
	 */
	public void setEdad(int edad) throws PersonaException  {
		this.edad = edad;			
		if(this.edad < 0) {
			this.edad=EDAD_MINIMA;
			throw new PersonaException(PersonaException.EDAD_NO_VALIDA);
		}
		if (edad < EDAD_MINIMA ){
			this.edad=EDAD_MINIMA;
			throw new PersonaException(PersonaException.MENOR_DE_EDAD);
		}else if (edad > EDAD_MAXIMA) {
			this.edad=EDAD_MAXIMA;
			throw new PersonaException(PersonaException.MAYOR_DE_EDAD);				
		} 
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}



	
	//Metodos y Utilidades

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + "]";
	}
	
}
