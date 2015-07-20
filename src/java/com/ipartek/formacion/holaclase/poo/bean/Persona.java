/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

/**
 * Bean para modelar una Persona fisica
 * @author ur00
 *
 */
public class Persona {

	//constantes
	public static final int EDAD_MINIMA = 18;
	public static final int EDAD_MAXIMA = 99;
	public static final long NOTA_MEDIA = 5;
	
	//Atributos
	private String  nombre;
	private String  apellido;
	private int     edad;
	private String  email;
	private boolean aprobado;
	private float    nota;
	 
	
	//Constructores
	public Persona() {
		super();
		this.nombre   = "Anonimo";
		this.apellido = "Sin Determinar";
		this.edad     = EDAD_MINIMA;
		this.email    = "";
		this.aprobado = false;
		this.nota     = (long)0.0;
	}

	//consructor con parametros
	
	/**
	 * Constructor con parametros
	 * @param nombre nombre de la Persona
	 * @param edad edad de la Persona
	 */
	public Persona(String nombre, int edad) throws PersonaException{		
		this(); // llamada al constructor por defecto		
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
	 * Edad comprendida entre 18 y 99, casos:
	 * <ul>
	 * 	<li>Si es menor que 18 seteamos a 18</li>
	 * 	<li>Si es mayor que 99 setamos a 99</li> 	
	 * </ul>
	 * @param edad 
	 * @throws PersonaException 
	 */
	public void setEdad(int edad) throws PersonaException {
		
		if( edad < 0 ){
			throw new PersonaException(PersonaException.CODIGO_EXCEPCION_RANGO_EDAD_NO_VALIDO);
		}else if ( edad < EDAD_MINIMA ){			
			this.edad = EDAD_MINIMA;
			throw new PersonaException(PersonaException.CODIGO_EXCEPCION_MENOR_EDAD);
		}else if ( edad > EDAD_MAXIMA ){
			this.edad = EDAD_MAXIMA;
			throw new PersonaException(PersonaException.CODIGO_EXCEPCION_MAYOR_EDAD);
		}else{
			this.edad = edad;
		}
		
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}


	public float getNota() {
		return nota;
	}

	/**
	 * Nota comprendida entre 0 y 10 en caso contrario seteamos a 5
	 * @param nota
	 * @throws PersonaException
	 */
	public void setNota(float nota) throws PersonaException {
		if( nota < 0 || nota > 10){
			this.nota = NOTA_MEDIA;
			throw new PersonaException(PersonaException.MENSAJE_EXCEPCION_RANGO_NOTA_NO_VALIDO);
		} else {
			this.nota = nota;
		}
	}


	
	//Metodos y Utlidades
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + ", aprobado="
				+ aprobado + ", nota=" + nota + "]";
	}  
	
	
	
}
