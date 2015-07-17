package com.ipartek.formacion.holaclase.poo.ejemplos;

public class PersonaExcepcion extends Exception{

	private static final long serialVersionUID = 8925731860951811970L;
	//Sobreescribimos/Sobrecargamos el método getMessage (ya existía en JAVA)
	private String message;

	//Códigos de excepciones
	public static final int CODIGO_EXCEPCION_SIN_DEFINIR = 0;
	public static final String MSG_EDAD_MENOR = "Es menor de edad";
	public static final String MSG_EDAD_MAYOR = "Es mayor de edad";
	public static final String EXCEPCION_RANGO_NO_VALIDO = "Rango de edad no válido";
	public static final String EXCEPCION_RANGO_NOTA_NO_VALIDO = "Rango de nota no válido";
	
	/**
	 * @param message
	 * @param codigo
	 */
	public PersonaExcepcion (String message) {
		super();
		this.message = message;
	}

	public String getMessage(){ //Sobrecarga de método
		return this.message;
	}
	
}
