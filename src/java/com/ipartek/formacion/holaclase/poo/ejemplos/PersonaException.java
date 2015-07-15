package com.ipartek.formacion.holaclase.poo.ejemplos;

public class PersonaException extends Exception{
	
	private String message;
	private int codigoError;

	//codigo de excepciones
	public static final int CODIGO_EXCEPCION_SIN_DEFINIR 		  = 0;
	public static final int CODIGO_EXCEPCION_MENOR_EDAD 		  = 1;
	public static final int CODIGO_EXCEPCION_MAYOR_EDAD 		  = 2;
	public static final int CODIGO_EXCEPCION_RANGO_EDAD_NO_VALIDO = 3;
	
	public static final String MENSAJE_EXCEPCION_SIN_DEFINIR 		  = "Excepcion sin definir";
	public static final String MENSAJE_EXCEPCION_MENOR_EDAD 		  = "Es menor de edad";
	public static final String MENSAJE_EXCEPCION_MAYOR_EDAD 		  = "Es mayor de edad";
	public static final String MENSAJE_EXCEPCION_RANGO_EDAD_NO_VALIDO = "Rango de edad no valido";
	
	

	/**
	 * @param message
	 * @param codigoError
	 */
	public PersonaException(String message, int codigoError) {
		super();
		this.message = message;
		this.codigoError = codigoError;
	}

	/**
	 * @param message
	 */
	public PersonaException(String message) {
		super();
		this.message = message;
		this.codigoError = CODIGO_EXCEPCION_SIN_DEFINIR;
	}
	
	/**
	 * @param codigoError
	 */
	public PersonaException(int codigoError) {
		super();
		this.codigoError = codigoError;
		switch (codigoError) {
			case CODIGO_EXCEPCION_MAYOR_EDAD:
				this.message = MENSAJE_EXCEPCION_MAYOR_EDAD;
				break;
			case CODIGO_EXCEPCION_MENOR_EDAD:
				this.message = MENSAJE_EXCEPCION_MENOR_EDAD;
				break;
			case CODIGO_EXCEPCION_RANGO_EDAD_NO_VALIDO:
				this.message = MENSAJE_EXCEPCION_RANGO_EDAD_NO_VALIDO;
				break;
			default:
				this.message = MENSAJE_EXCEPCION_SIN_DEFINIR;
				break;
		}
	}

	public String getMessage() {
		return this.message;
	}
	
	public int getCodigoError(){
		return this.codigoError;
	}
	

}
