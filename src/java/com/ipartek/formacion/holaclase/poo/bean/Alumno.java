package com.ipartek.formacion.holaclase.poo.bean;

public class Alumno extends Persona {
	
	private boolean aprobado;
	private float   nota;
	
	/**
	 * 
	 */
	public Alumno() {
		super();
		this.aprobado = false;
		this.nota     = (float)0.0;
		
	}
	/**
	 * @param nombre
	 * @param edad
	 * @throws PersonaException
	 */
	public Alumno(String nombre, int edad) throws PersonaException {
		super(nombre, edad);
		this.aprobado = false;
		this.nota     = (float)0.0;
	}
	public boolean isAprobado() {
		return aprobado;
	}
	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "] extends " + super.toString();
	}

	
	
	
	
	
	
	
	
}
