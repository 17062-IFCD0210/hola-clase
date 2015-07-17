package com.ipartek.formacion.holaclase.poo.ejemplos;

public class PersonaExcepcion extends Exception{

	private static final long serialVersionUID = 8925731860951811970L;
	//Sobreescribimos/Sobrecargamos el m�todo getMessage (ya exist�a en JAVA)
	private String message;

	//C�digos de excepciones
	public static final int CODIGO_EXCEPCION_SIN_DEFINIR = 0;
	public static final String MSG_EDAD_MENOR = "Es menor de edad";
	public static final String MSG_EDAD_MAYOR = "Es mayor de edad";
	public static final String EXCEPCION_RANGO_NO_VALIDO = "Rango de edad no v�lido";
	public static final String EXCEPCION_RANGO_NOTA_NO_VALIDO = "Rango de nota no v�lido";
	
	/**
	 * @param message
	 * @param codigo
	 */
	public PersonaExcepcion (String message) {
		super();
		this.message = message;
	}

	public String getMessage(){ //Sobrecarga de m�todo
		return this.message;
	}
	
}
