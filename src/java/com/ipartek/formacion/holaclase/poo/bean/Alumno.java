package com.ipartek.formacion.holaclase.poo.bean;

public class Alumno extends Persona {

	//Atributos
	private boolean aprobado;
	private float nota;


	
	//Constructor
	public Alumno() {
		super();
		this.aprobado 	= false;
		this.nota 		= (float)0.0; //castea a long
	}
	
	//Constructor con parametros
	public Alumno(String nombre, int edad, boolean aprobado, float nota)
			throws PersonaException {
		super(nombre, edad);
		this.aprobado = aprobado;
		this.nota = nota;
	}
	
	
	//Getters y setters
	public boolean isAprobado() {
		return aprobado;
	}

	public void setAprobado(boolean pAprobado) {
		this.aprobado = pAprobado;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "] extends" + super.toString();
	}



	


	
	
}
