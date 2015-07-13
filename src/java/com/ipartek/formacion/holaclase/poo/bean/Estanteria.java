package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;



public class Estanteria {

	private ArrayList<Libro> libros;

	
	public Estanteria() {
		super();
		libros = new ArrayList<Libro>();
	}
	
	
	public void guardar(Libro libro){
		//libros.add(libro);	
	};
	
	/**
	 * Obtenemos el Libro por su titulo 
	 * @param titulo titulo del Libro
	 * @return Libro solicitado, si no existe null
	 */
	public Libro extraer( String titulo ){
		return null;
	};
	
	
	public int numeroLibros(){
		return libros.size();
	}
	
	
	
	
	
	
}
