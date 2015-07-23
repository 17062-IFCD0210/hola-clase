package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;

import com.ipartek.formacion.holaclase.poo.bean.Nota;
import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;

public class Alumno extends Persona{
	//Constantes
	public static final float NOTA_MIN = (float)0.0;
	public static final float NOTA_MAX = (float)10.0;
	
	//Atributos	
	private boolean aprobado = false;
	private float nota = NOTA_MIN;
	
	//Constructores
	public Alumno() {
		super();
	}
	
	public Alumno(String nombre, int edad) throws ExcepcionPersona {
		super(nombre,edad);
		this.aprobado = aprobado;
		this.nota = nota;
	}
	
	//Getters y Setters
	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	public float getNota() {
		return nota;
	}
	
	/**
	 * Nota comprendida entre 0 y 10, casos:
	 * <ul>
	 * 	<li>Si es menor de 0 seteamos a 0</li>
	 * 	<li>Si es mayor de 10 seteamos a 10</li>
	 * </ul>
	 * @param nota
	 * @throws ExcepcionPersona 
	 */
	public void setNota(float nota) throws ExcepcionPersona {
		if(nota < NOTA_MIN) {
			throw new ExcepcionPersona(ExcepcionPersona.MESSAGE_NOTA_MENOR);
		} else if(nota > NOTA_MAX) {
			throw new ExcepcionPersona(ExcepcionPersona.MESSAGE_NOTA_MAYOR);
		} else {
			this.nota = nota;
		}
	}
	
	//Metodos
	@Override
	public String toString() {
		return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "]" + super.toString();
	} 
	
	
}
