/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Curso
 *
 */
public class Estanteria {

	//Atributos
	private ArrayList<Libro> libros; //Declaramos un array casteado con la clase Libro llamado libros
	
	//Constructores
	public Estanteria() {
		super();
		libros = new ArrayList<Libro>();
	}
	
	void guardar(Libro libro){
		//libros.add(libro);
	}
	
	/**
	 * Obtenemos el libro por su título
	 * @param titulo título del libro
	 * @return Libro solicitado, si no existe null
	 */
	public Libro extraer(String titulo){
		Libro resul = null;
		Libro libro;
		if (titulo != null){
			Iterator<Libro> it = libros.iterator();
				while ( it.hasNext() ){
					libro = it.next();
					if ( titulo.equalsIgnoreCase(libro.getTitulo())){
						resul = libro;
						break; //para no seguir buscando
					}
				}
				libro=null;
		}
		return resul;
	}
	
	/**
	 * 
	 */
	public int numeroLibros(){
		return libros.size();
	}
}
