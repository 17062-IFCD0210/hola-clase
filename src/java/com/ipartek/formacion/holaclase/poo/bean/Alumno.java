package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;

import com.ipartek.formacion.holaclase.poo.bean.Nota;
import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class Alumno extends Persona{
	//Atributos	
	//private Nota nota;
	private ArrayList<String> curso;
	
	//Constructores
	public Alumno(Nota nota, ArrayList<String> curso) {
		super();
		//this.nota = nota;
		this.curso = curso;
	}

	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

//	public Nota getNota() {
//		return nota;
//	}

//	public void setNota(Nota nota) {
//		this.nota = nota;
//	}

	public ArrayList<String> getCurso() {
		return curso;
	}

	public void setCurso(ArrayList<String> curso) {
		this.curso = curso;
	}
	
	//Getters y Setters
	
	
	
}
