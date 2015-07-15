package com.ipartek.formacion.holaclase.poo.bean;

public class Libro {

	// constantes

	// variables

	private String autor;
	private String colorPortada;
	private String dimensiones;
	private int marcador;
	private int num_paginas;
	private String titulo;

	// constructores

	public Libro(String titulo) {
		super();
		this.setAutor("Anonimo");
		this.setColorPortada("blanco");
		this.setDimensiones("60x60");
		this.setMarcador(0);
		this.setNum_paginas(0);
		this.setTitulo(titulo);
	}

	public Libro(String autor, String colorPortada, String dimensiones,
			int marcador, int num_paginas, String titulo) {
		super();
		this.autor = autor;
		this.colorPortada = colorPortada;
		this.dimensiones = dimensiones;
		this.marcador = marcador;
		this.num_paginas = num_paginas;
		this.titulo = titulo;
	}

	// setters y getters

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @return the colorPortada
	 */
	public String getColorPortada() {
		return colorPortada;
	}

	/**
	 * @return the dimensiones
	 */
	public String getDimensiones() {
		return dimensiones;
	}

	/**
	 * @return the marcador
	 */
	public int getMarcador() {
		return marcador;
	}

	/**
	 * @return the num_paginas
	 */
	public int getNum_paginas() {
		return num_paginas;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	

	/**
	 * @param autor
	 *            the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @param colorPortada
	 *            the colorPortada to set
	 */
	public void setColorPortada(String colorPortada) {
		this.colorPortada = colorPortada;
	}

	/**
	 * @param dimensiones
	 *            the dimensiones to set
	 */
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	/**
	 * @param marcador
	 *            the marcador to set
	 */
	public void setMarcador(int marcador) {
		this.marcador = marcador;
	}

	/**
	 * @param num_paginas
	 *            the num_paginas to set
	 */
	public void setNum_paginas(int num_paginas) {
		this.num_paginas = num_paginas;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// metodos y utilidades
	
	public int leer() {
		if ( this.getMarcador()<this.num_paginas){
			this.setMarcador(this.getMarcador() + 1);
		}
		return this.getMarcador();
	}
	
	public int abrir() {
		System.out.println("Estas en la pagina: " + this.getMarcador());
		return this.getMarcador();
	}

	public int cerrar() {
		System.out.println("Te quedan "
				+ (this.getNum_paginas() - this.getMarcador())
				+ " paginas por leer.");
		return (this.getNum_paginas() - this.getMarcador());
	}

	public int escribir() {
		this.setNum_paginas(this.getNum_paginas() + 1);
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", colorPortada=" + colorPortada
				+ ", dimensiones=" + dimensiones + ", marcador=" + marcador
				+ ", num_paginas=" + num_paginas + ", titulo=" + titulo + "]";
	}
	
	
}
