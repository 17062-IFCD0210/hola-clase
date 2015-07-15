package com.ipartek.formacion.holaclase.poo.ejemplos;

public class ExcepcionPersona extends Exception{
	private String message;
	private int codigo;
	
	public static final int CODIGO_EDAD_NEGATIVA = 0;
	public static final int CODIGO_EDAD_MENOR = 1;
	public static final int CODIGO_EDAD_MAYOR = 2;
	
	public static final String MESSAGE_EDAD_NEGATIVA = "Rango de edad no valido";
	public static final String MESSAGE_EDAD_MENOR = "Es menor de edad";
	public static final String MESSAGE_EDAD_MAYOR = "Es mayor de edad";
	
	public ExcepcionPersona(String message, int codigo) {
		super();
		this.message = message;
		this.codigo = codigo;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public int getCodigo() {
		return this.codigo;
	}
}
