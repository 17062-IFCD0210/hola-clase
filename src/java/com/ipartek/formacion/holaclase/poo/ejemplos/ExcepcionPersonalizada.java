package com.ipartek.formacion.holaclase.poo.ejemplos;

public class ExcepcionPersonalizada extends Exception {
	
	private String message;
	private int	   codigo;
	
	
	//codiogs de excepcion
	static final int CODIGO_EXCEPCON_SIN_DEFINIR = 0;
	
	/**
	 * @param message
	 * @param codigo
	 */
	
	public ExcepcionPersonalizada ( String message, int codigo ) {
		super();
		this.message = message;
		this.codigo = CODIGO_EXCEPCON_SIN_DEFINIR;
	}

	public String getMessage() {
		return message;
	}


	public int getCodigo() {
		return codigo;
	}

	
}
