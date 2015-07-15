package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class Estanteria {

	//constantes
	
	//atributos
	
	private ArrayList<Libro> coleccion;
	
	//constructores
	public Estanteria() {
		super();
		this.setColeccion(new ArrayList<Libro>());
	}

	//setters y getters
	
	/**
	 * @return the coleccion
	 */
	public ArrayList<Libro> getColeccion() {
		return coleccion;
	}


	/**
	 * @param coleccion the coleccion to set
	 */
	public void setColeccion(ArrayList<Libro> coleccion) {
		this.coleccion = coleccion;
	}

	//metodos y utilidades
	public void guardar(Libro libro){
		this.getColeccion().add(libro);
	}
	
	public Libro extraer(String titulo){
		Libro resul = null;
		Libro libro;
		if (titulo!=null){
			Iterator<Libro> it = this.getColeccion().iterator();
			while (it.hasNext()){
				libro = it.next();
				if (libro.getTitulo().equalsIgnoreCase(titulo)){
					resul=libro;
					break;
				}
			}
			libro=null;
		}
		return resul;
	};
	
	public int numLibros(){
		System.out.println("La estanteria tiene: "+this.getColeccion().size()+" libros.");
		return this.getColeccion().size();
	}
	
	public void listar(){
		this.getColeccion().toString();
	}
}
