package com.ipartek.formacion.holaclase.poo.bean;

public class Libro {
	//Atributos
	private int numPags = 0;
	private String dimensiones = "";
	private String autor = "";
	private String colorPortada = "";
	private int marcador = 0;
	
	//Constructores
	public Libro() {
		super();
	}

	public Libro(int numPags, String dimensiones, String autor,
			String colorPortada, int marcador) {
		super();
		this.setNumPags(numPags);
		this.setDimensiones(dimensiones);
		this.setAutor(autor);
		this.setColorPortada(colorPortada);
		this.setMarcador(marcador);
	}
	
	//Getters y Setters
	public int getNumPags() {
		return numPags;
	}

	public void setNumPags(int numPags) {
		this.numPags = numPags;
	}

	public String getDimensiones() {
		return dimensiones;
	}

	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getColorPortada() {
		return colorPortada;
	}

	public void setColorPortada(String colorPortada) {
		this.colorPortada = colorPortada;
	}

	public int getMarcador() {
		return marcador;
	}

	public void setMarcador(int marcador) {
		this.marcador = marcador;
	}
	
	//Metodos
	
	public void leer() {
		
	}
	
	public void escribir() {
		
	}
	
	public void abrir() {
		
	}
	
	public void cerrar() {
		
	}
}
