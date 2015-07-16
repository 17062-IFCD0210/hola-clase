package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;
import java.util.Iterator;

public class Estanteria {
	
	//Atributos

	private ArrayList<Libro> libros;

	
	//Constructor
	/**
	 * @param libros
	 */
	public Estanteria() {
		super();
		this.libros = new ArrayList<Libro>();
	}
	
	
	//Metodos
	public void guardar(Libro libro){
		libros.add(libro);
	}
	
	/**
	 * Obtenemos el libro por su titulo
	 * @param titulo titulo del libro
	 * @return Libro solicitado, si no existe null
	 */

	public Libro extraer(String titulo){
/* MI SOLUCION:
		Libro resul=null;
		int indice=0;
		while (indice<this.libros.size()){
			if (titulo.equalsIgnoreCase(this.libros.get(indice).getTitulo())){
				resul=this.libros.get(indice);
				break;
			}
			indice++;
		}
		return resul;
*/
		Libro resul=null;
		Libro libro;
		if (titulo!=null){ //protegemos el metodo por si titulo es null
			Iterator<Libro> it=libros.iterator();
			while (it.hasNext()){
				libro=it.next();
				if (titulo.equalsIgnoreCase(libro.getTitulo())){
					resul=libro;
					break; //para que seguir buscando?
				}
			}
			libro=null;
		}
		return resul;
	}

	public int numeroLibros(){
		return this.libros.size();
	}
}
