package com.ipartek.formacion.holaclase.poo.bean;

public class PersonaException extends Exception {
	
	private static final long serialVersionUID = -5289811322076285476L;

	private String message;
		
	//mensajes para las excepciones
	public static final String MSG_EDAD_MENOR = "Es menor de edad";
	public static final String MSG_EDAD_MAYOR = "Es mayor de edad";
	public static final String MSG_EDAD_RANGO = "Rango de edad no valido";
	
	
	/**
	 * @param message
	 */
	public PersonaException(String message) {
		super();
		this.message = message;		
	}

	public String getMessage(){	
		return this.message;
	}
	
	
}
