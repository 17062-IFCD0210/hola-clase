package com.ipartek.formacion.holaclase.poo.bean;

public class Libro implements Cloneable {
	// Atributos
	private int numPags = 0;
	private String dimensiones = "";
	private String autor = "Anonimo";
	private String colorPortada = "";
	private int marcador = 0;
	private String titulo = "";

	// Constructores
	public Libro() {
		super();
	}

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
	}

	public Libro(int numPags, String dimensiones, String autor,
			String colorPortada, int marcador, String titulo) {
		super();
		this.setNumPags(numPags);
		this.setDimensiones(dimensiones);
		this.setAutor(autor);
		this.setColorPortada(colorPortada);
		this.setMarcador(marcador);
		this.setTitulo(titulo);
	}

	// Getters y Setters
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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	// Metodos
	/**
	 * Leer una pagina del libro, se actualiza marcador, no se puede leer mas
	 * del numero de paginas
	 * 
	 * @return pagina actual o marcador
	 */
	public int leer() {
		int result = this.getMarcador();

		if (result < this.getNumPags()) {
			result++;
			this.setMarcador(result);
		}
		return result;
	}

	/**
	 * Aumenta el numero de paginas
	 * 
	 * @return numero de paginas
	 */
	public int escribir() {
		int result = this.getNumPags();
		result++;
		this.setNumPags(result);
		return result;
	}

	/**
	 * Abre el libro y retorna el marcador con la pagina actual
	 * 
	 * @return marcador
	 */
	public int abrir() {
		return this.getMarcador();
	}

	/**
	 * Cierra el libro y retorna numero paginas para finalizar
	 * 
	 * @return numero de paginas restantes
	 */
	public int cerrar() {
		return this.getNumPags() - this.getMarcador();
	}

	@Override
	public String toString() {
		return "Libro [numPags=" + numPags + ", dimensiones=" + dimensiones
				+ ", autor=" + autor + ", colorPortada=" + colorPortada
				+ ", marcador=" + marcador + ", titulo=" + titulo + "]";
	}

	@Override
	public Libro clone() throws CloneNotSupportedException {
		return (Libro) super.clone();
	}

}