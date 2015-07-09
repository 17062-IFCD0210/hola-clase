/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Bean para modelar una Persona fisica
 * @author ur00
 *
 */
public class Persona {

	//constantes
	public final int EDAD_MINIMA = 18;
	public final int EDAD_MAXIMA = 99;
	
	//Atributos
	private String  nombre;
	private String  apellido;
	private int     edad;
	private String  email;
	private boolean aprobado;
	private long    nota;
	 
	
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
	public Persona(String nombre, int edad) {		
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
	 */
	public void setEdad(int edad) {
		
		if ( edad < EDAD_MINIMA ){
			this.edad = EDAD_MINIMA;
		}else if ( edad > EDAD_MAXIMA ){
			this.edad = EDAD_MAXIMA;
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


	public long getNota() {
		return nota;
	}


	public void setNota(long nota) {
		this.nota = nota;
	}


	
	
	//Metodos y Utlidades
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + ", aprobado="
				+ aprobado + ", nota=" + nota + "]";
	}  
	
	
	
}
