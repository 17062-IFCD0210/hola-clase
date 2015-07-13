package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;

public class Estanteria {
	//Atributos
	private ArrayList<Libro> coleccion = new ArrayList<Libro>();
	
	//Constructores
	public Estanteria() {
		super();
	}
	
	//Getters y Setters
	public ArrayList<Libro> getColeccion() {
		return coleccion;
	}

	public void setColeccion(ArrayList<Libro> coleccion) {
		this.coleccion = coleccion;
	}
	
	//Metodos
	
	public int numLibros() {
		return coleccion.size();
	}

	public void listaLibros() {
		for(int i=0; i<coleccion.size(); i++) {
			System.out.println(coleccion.get(i).toString());
		}
	}
	
	public void guardar(Libro libro) {
		coleccion.add(libro);
	}
	
	/**
	 * Obtenemos el Libro por su titulo
	 * @param titulo titulo del libro
	 * @return Libro solicitado, si no existe null
	 */
	public Libro extraer(String titulo) {
		Libro libro = null;
		for(int i=0; i<coleccion.size(); i++) {
			if(coleccion.get(i).getTitulo().equals(titulo)) {
				libro = coleccion.get(i);
				break;
			}
		}
		return libro;
	}
}
