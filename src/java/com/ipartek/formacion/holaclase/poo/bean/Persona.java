/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

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
	 */
	public Persona(String nombre, int edad) {
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
	 */
	public void setEdad(int edad) {
		
		if (edad < EDAD_MINIMA){
			this.edad=EDAD_MINIMA;
		}else if (edad>EDAD_MAXIMA){
			this.edad=EDAD_MAXIMA;
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
