/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;

/**
 * @author Curso
 *
 */
public class Estanteria {
	
	//Para indicar el tipo de lista se indica con un cast "<>", en este caso "<Libro>"
	private ArrayList<Libro>	libros;

	/**
	 * 
	 */
	public Estanteria() {
		super();
		libros = new ArrayList<Libro>();
	}
	
	/**
	 * 
	 * @param libro
	 */
	public void guardar(Libro libro) {
		
		libros.add(libro);
		
	}
	
	/**
	 * Obtenemos el Libro por su titulo
	 * 
	 * @param titulo titulo del Libro
	 * @return Libro solicitado, si no existe null  
	 */
	public Libro extraer( String titulo ){
		
		Libro resul = null;
		Libro lib;
		boolean encontrado = false;
		
		if ( titulo != null) {
		
			for(int i=0; i<this.numeroLibros() && !encontrado; i++){
				
				lib = libros.get(i);
				
				if (lib.getTitulo().equalsIgnoreCase(titulo)) {
					
					resul = lib;
					encontrado = true;
				}
				
			}
		}
		
		return resul;
		
	}
	
	/**
	 * 
	 */
	public int numeroLibros() {
		return libros.size();
	}

}
