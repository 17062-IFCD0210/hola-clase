package com.ipartek.formacion.holaclase.poo.ejemplos;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class PersonaException extends Exception{

	
	//codigos de excepciones
		public static final String  MENOR_DE_EDAD = "Es menor de edad";
		public static final String  MAYOR_DE_EDAD = "Es mayor de edad";
		public static final String  EDAD_NO_VALIDA = "Rango de edad no valido";
		
	//atributos
		String mensaje;
	
	//constructores
	/**
	 * @param message
	 */
	public PersonaException(String mensaje) {
		super();
		this.mensaje=mensaje;
	}
	
	//getters
	
	public String getMensaje(){
		return this.mensaje;
	}
}
