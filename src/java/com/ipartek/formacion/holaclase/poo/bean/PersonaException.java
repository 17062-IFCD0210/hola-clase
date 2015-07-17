package com.ipartek.formacion.holaclase.poo.bean;

public class PersonaException extends Exception{

	private static final long serialVersionUID = 6536726064726981926L;

	private String message; //Atributo privado
	
	//mensajes para las excepciones,publicos para poder usarlos fuera
	public static final String MSG_EDAD_MENOR = "Es menor de edad";
	public static final String MSG_EDAD_MAYOR = "Es mayor de edad";
	public static final String MSG_EDAD_RANGO = "Rango de edad no valido";
	public static final String MSG_NOTA_RANGO = "El formato de la nota no es valido";

	/**
	 * 
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
