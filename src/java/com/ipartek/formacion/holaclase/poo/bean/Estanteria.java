package com.ipartek.formacion.holaclase.poo.bean;

import java.util.ArrayList;

public class Estanteria {
	
	//Atributos
	
	private ArrayList<Libro> coleccion = new ArrayList();
	private int numeroLibros;
	
	//Constructores

	public Estanteria(){
		coleccion.add(null);
	}
	
	//Setters y Getters
	
	/**
	 * @return the numeroLibros
	 */
	public int getNumeroLibros() {
		return numeroLibros;
	}


	//Metodos
	
	public void guardar(Libro l){
		coleccion.add(l);
		this.numeroLibros++;
	}
}
