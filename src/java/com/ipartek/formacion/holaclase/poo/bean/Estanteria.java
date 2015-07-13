package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;
import java.util.Iterator;



public class Estanteria {

	private ArrayList<Libro> libros;

	
	public Estanteria() {
		super();
		libros = new ArrayList<Libro>();
	}
	
	
	public void guardar(Libro libro){
		libros.add(libro);	
	};
	
	/**
	 * Obtenemos el Libro por su titulo 
	 * @param titulo titulo del Libro
	 * @return Libro solicitado, si no existe null
	 */
	public Libro extraer( String titulo ){
		Libro resul = null;
		Libro libro;
		if ( titulo != null ){
			Iterator<Libro> it = libros.iterator();		
			while ( it.hasNext() ) {
				libro = it.next();
				if ( titulo.equalsIgnoreCase(libro.getTitulo())){
					resul = libro;					
					break; // para que seguir buscando?
				}
			}
			libro=null;
		}	
		return resul;
	};
	
	
	public int numeroLibros(){
		return libros.size();
	}
	
	
	
	
	
	
}
