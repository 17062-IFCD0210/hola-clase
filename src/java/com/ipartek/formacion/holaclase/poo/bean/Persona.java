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

	public static final long NOTA_MIN = (long)0.0;
	public static final long NOTA_MAX = (long)10.0;
	
	//Atributos
	private String nombre = "Anonimo";
	private String apellido = "Sin Determinar";
	private int edad = EDAD_MIN;
	private String email = "";
	private boolean aprobado = false;
	private long nota = NOTA_MIN;
	
	//Constructores
	public Persona() {
		super();
	}
	
	public Persona(String nombre, int edad) throws ExcepcionPersona {
		this(); // Llamada al constructor por defecto (Persona())
		this.setNombre(nombre);
		this.setEdad(edad);
	}



	public Persona(String nombre, String apellido, int edad, String email,
			boolean aprobado, long nota) throws ExcepcionPersona {
		super();
		//Nombre
		this.setNombre(nombre);
		
		//Apellido
		this.setApellido(apellido);
		
		//Edad
		this.setEdad(edad);
		
		//Email
		this.setEmail(email);
		
		//Aprobado
		this.setAprobado(aprobado);
		
		//Nota
		this.setNota(nota);
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

	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public long getNota() {
		return nota;
	}
	
	/**
	 * Nota comprendida entre 0 y 10, casos:
	 * <ul>
	 * 	<li>Si es menor de 0 seteamos a 0</li>
	 * 	<li>Si es mayor de 10 seteamos a 10</li>
	 * </ul>
	 * @param nota
	 */
	public void setNota(long nota) {
		if(nota < NOTA_MIN) {
			this.nota = NOTA_MIN;
		} else if(nota > NOTA_MAX) {
			this.nota = NOTA_MAX;
		} else {
			this.nota = nota;
		}
	}
	
	//Metodos y utilidades
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", email=" + email + ", aprobado="
				+ aprobado + ", nota=" + nota + "]";
	}
	
	
}


