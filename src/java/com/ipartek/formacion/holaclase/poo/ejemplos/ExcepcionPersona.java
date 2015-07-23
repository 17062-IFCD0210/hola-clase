package com.ipartek.formacion.holaclase.poo.ejemplos;

/**
 * Excepcion de Persona que controlara las edades metidas
 * @author Raul
 *
 */
public class ExcepcionPersona extends Exception{

	/**
	 * Numero de version serial
	 */
	private static final long serialVersionUID = 2875765634289207183L;

	private String message;
	
	public static final String MESSAGE_EDAD_NEGATIVA = "Rango de edad no valido";
	public static final String MESSAGE_EDAD_MENOR = "Es menor de edad";
	public static final String MESSAGE_EDAD_MAYOR = "Es mayor de edad";
	
	public static final String MESSAGE_NOTA_MAYOR = "Nota mayor de 10";
	public static final String MESSAGE_NOTA_MENOR = "Nota menor de 0";
	
	public ExcepcionPersona(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
