package com.ipartek.formacion.holaclase.poo.ejemplos;

public class ExcepcionPersonalizada extends Exception {

	
	private String message;
	private int codigo;
	
	//codigos de excepciones
	static final int CODIGO_EXCEPCION_SIN_DEFINIR = 0;
	
	
	//constructores
	/**
	 * @param message
	 */
	public ExcepcionPersonalizada(String message) {
		super();
		this.message = message;
		this.codigo = CODIGO_EXCEPCION_SIN_DEFINIR;
	}
	
	/**
	 * @param message
	 * @param codigo
	 */
	public ExcepcionPersonalizada(String message, int codigo) {
		super();
		this.message = message;
		this.codigo = codigo;
	}

	//getters
	
	public String getMessage(){
		return this.message;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
}
