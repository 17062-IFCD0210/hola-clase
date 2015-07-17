package com.ipartek.formacion.holaclase.poo.ejemplos;

public class ExcepcionPersonalizada extends Exception{
	
	//Sobreescribimos/Sobrecargamos el m�todo getMessage (ya exist�a en JAVA)
	private String message;
	private int codigo;
	
	//C�digos de excepciones
	public static final int CODIGO_EXCEPCION_SIN_DEFINIR = 0;
	
	/**
	 * @param message
	 * @param codigo
	 */
	public ExcepcionPersonalizada(String message, int codigo) {
		super();
		this.message = message;
		this.codigo = CODIGO_EXCEPCION_SIN_DEFINIR;
	}

	public String getMessage(){
		return this.message;
	}
	
	public int getCodigo(){
		return this.codigo;
	}

}
