package com.ipartek.formacion.holaclase.poo.excepciones;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1881671040091981187L;
	private String message;
	private int codigo;
	
	//CODIGOS
	public static int COD_EDAD_NEGATIVA=0;
	public static int COD_MENOR_EDAD=1;
	public static int COD_EDAD_ALTA=2;
	
	public static ArrayList<String> MENSAJE=new ArrayList<String>(Arrays.asList("Rango de edad no valido","Es menor de edad","Es demasiado mayor"));
			 
	
	/**
	 * @param message
	 * @param codigo
	 */
	public PersonaException(String message, int codigo) {
		super();
		this.message = message;
		this.codigo = codigo;
	}

	/**
	 * @param message
	 */
	public PersonaException(String message) {
		super();
		this.message = message;
		this.codigo = MENSAJE.indexOf(message);
	}
	
	/**
	 * @param codigo
	 */
	public PersonaException(int codigo) {
		super();
		this.codigo = codigo;
		this.message = MENSAJE.get(codigo);
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}
	
	
	
	
	
}
