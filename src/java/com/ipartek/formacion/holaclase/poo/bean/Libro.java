package com.ipartek.formacion.holaclase.poo.bean;

public class Libro implements Cloneable {
	
	private int    numeroPaginas;
	private String dimensiones;
	private String autor;
	private String titulo;
	private String colorPortada;
	private int marcador;
	
	
	/**
	 * Constructor para Libro
	 * @param titulo
	 */
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.numeroPaginas = 0;
		this.dimensiones = "";
		this.autor = "anonimo";
		this.colorPortada = "";
		this.marcador = 0;
	}


	public int getNumeroPaginas() {
		return numeroPaginas;
	}


	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
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


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
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


	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + ", dimensiones="
				+ dimensiones + ", autor=" + autor + ", titulo=" + titulo
				+ ", colorPortada=" + colorPortada + ", marcador=" + marcador
				+ "]";
	}
	
	/**
	 * Leer una pagina del libro, se actualiza marcador, no se pueeder leer mas del numero de paginas del Libro
	 * @return pagina actual o marcador
	 */
	public int leer(){
		int resul = this.getMarcador();
		//No leer mas del numeroPaginas
		if ( resul < this.getNumeroPaginas() ){
			resul++;	
			this.setMarcador(resul);
		}	
		return resul;
	}
	
	/**
	 * Aumenta el numero de paginas
	 * @return numero de paginas
	 */
	int escribir (){		
		int resul = this.getNumeroPaginas();
		resul++;		
		this.setNumeroPaginas(resul);		
		return resul;
	};
	
	/**
	 * Abre el libro y retorna el marcador con la pagina actual
	 * @return marcador
	 */
	public int abrir (){
		return this.getMarcador();
	}
	
	/**
	 * Cierra el Libro y retorna numero paginas para finalizar
	 * @return numero de paginas restantes
	 */
	public int cerrar(){
		return this.getNumeroPaginas() - this.getMarcador();
	}
	
	@Override
	public Libro clone() throws CloneNotSupportedException  {
        return (Libro)super.clone();
    }
	
	

}
