package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;

public class Alumno extends Persona {

	private boolean	aprobado;
	private float	nota;
	
	
	public Alumno() {
		super();
		this.setAprobado(false);
		this.setNota((float)0.0);
	}
	
	public Alumno(String nombre, int edad) throws PersonaException {
		super(nombre, edad);
		this.setAprobado(false);
		this.setNota((float)0.0);
	}
	
	/**
	 * @return the aprobado
	 */
	public boolean isAprobado() {
		return aprobado;
	}

	/**
	 * @param aprobado the aprobado to set
	 */
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}

	/**
	 * @return the nota
	 */
	public float getNota() {
		return nota;
	}

	/**
	 * @param nota the nota to set
	 */
	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "] extends " + super.toString();
	}
	
	
}
