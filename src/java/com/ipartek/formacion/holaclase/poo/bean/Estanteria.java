package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;

public class Estanteria {
	//Atributos
	private ArrayList<Libro> libros;  // Castear o definir que tipo de objeto tiene esa ArrayList

	
	//Constructores
	public Estanteria() {
		super();
		libros = new ArrayList<Libro>();
	}

	public void guardar(Libro libro){
		libros.add(libro);
		
	};

	
	/**
	 * Obtenemos el libro por su titulo
	 * @param titulo titulo del libro
	 * @return Libro solicitado, si no existe =  null
	 */
	public Libro extraer ( String titulo ){
		return null;
		
	};
	
	public int numeroLibros(){
		return libros.size();
	}

	
	
}
