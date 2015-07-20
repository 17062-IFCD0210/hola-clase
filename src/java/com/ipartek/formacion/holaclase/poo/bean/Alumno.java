package com.ipartek.formacion.holaclase.poo.bean;

public class Alumno extends Persona {
	
	public static final long NOTA_MEDIA = 5;
	
	private boolean aprobado;
	private float   nota;

	
	public Alumno() throws PersonaException{
		super();
		this.aprobado = false;
		this.setNota(0);
	}
	
	public Alumno(String nombre, int edad) throws PersonaException{
		super(nombre, edad);
		this.aprobado = false;
		this.setNota(0);
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

	/**
	 * Nota comprendida entre 0 y 10 en caso contrario seteamos a 5
	 * @param nota
	 * @throws PersonaException
	 */
	public void setNota(float nota) throws PersonaException {
		if( nota < 0 || nota > 10){
			this.nota = NOTA_MEDIA;
			throw new PersonaException(PersonaException.MENSAJE_EXCEPCION_RANGO_NOTA_NO_VALIDO);
		} else {
			this.nota = nota;
		}
	}

	@Override
	public String toString() {
		return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "] extends " + super.toString();
	}
}
