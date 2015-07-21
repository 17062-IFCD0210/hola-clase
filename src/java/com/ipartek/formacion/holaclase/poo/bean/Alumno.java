package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaExcepcion;

public class Alumno extends Persona {

	
	//Atributos
	private boolean aprobado;
	private float nota;

	//Constructores
	public Alumno() {
		super(); //constructor del padre
		setAprobado(true);
		setNota((float)6.0); //hay que castear el valor con el propio long
	}

	public Alumno(String nombre, int edad) throws PersonaExcepcion {
		super(nombre, edad); //constructor del padre con parámetros
		setAprobado(false);
		setNota((float)4.5); //hay que castear el valor con el propio long
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
	public String toString() { //añadimos que extiende de los datos de la clase Persona
		return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "] extends" + super.toString();
	}
	
	
}
