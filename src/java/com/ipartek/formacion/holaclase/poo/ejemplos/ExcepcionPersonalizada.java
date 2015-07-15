package com.ipartek.formacion.holaclase.poo.ejemplos;

public class ExcepcionPersonalizada extends Exception{
	
	private String message;
	private int codigoError;

	//codigo de excepciones
	public static final int CODIGO_EXCEPCION_SIN_DEFINIR = 0;
		
	
	/**
	 * @param codigoError
	 * @param message
	 */
	public ExcepcionPersonalizada(String message, int codigoError) {
		super();
		this.codigoError = codigoError;
		this.message = message;
	}

	/**
	 * @param message
	 */
	public ExcepcionPersonalizada(String message) {
		super();
		this.message = message;
		this.codigoError = CODIGO_EXCEPCION_SIN_DEFINIR;
	}

	public String getMessage() {
		return this.message;
	}
	
	public int getCodigoError(){
		return this.codigoError;
	}

}
