package com.ipartek.formacion.holaclase.poo.bean;

public class Libro implements Cloneable {

	private int numeroPaginas;
	private String dimensiones;
	private String autor;
	private String titulo;
	private String colorPortada;
	private int marcador;
	
	//Constructores

	/**
	 * Constructor para Libro
	 * @param titulo
	 */
	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.numeroPaginas=0;
		this.dimensiones="";
		this.autor = "anonimo";
		this.colorPortada="";
		this.marcador=0;		
	}



	//Setters y Getters
	/**
	 * @return the numeroPaginas
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * @param numeroPaginas the numeroPaginas to set
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	/**
	 * @return the dimensiones
	 */
	public String getDimensiones() {
		return dimensiones;
	}

	/**
	 * @param dimensiones the dimensiones to set
	 */
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * @return the Titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param Titulo the Titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the colorPortada
	 */
	public String getColorPortada() {
		return colorPortada;
	}

	/**
	 * @param colorPortada the colorPortada to set
	 */
	public void setColorPortada(String colorPortada) {
		this.colorPortada = colorPortada;
	}

	/**
	 * @return the marcador
	 */
	public int getMarcador() {
		return marcador;
	}

	/**
	 * @param marcador the marcador to set
	 */
	public void setMarcador(int marcador) {
		if (marcador>=this.getNumeroPaginas()){
			this.marcador=this.getNumeroPaginas();
		}else{
			this.marcador = marcador;
		}
	}


	//Metodos
	
	/**
	 * Abre el libro por la pagina que indique el marcador
	 * @return marcador
	 */
	public int abrir(){
		return this.getMarcador();
	}
	
	/**
	 * Leer una pagina del libro, se actualiza el marcador avanzando una posicion,
	 * no se puede leer mas del numero de paginas
	 * @return pagina actual
	 */
	public int leer(){
		int resul = this.getMarcador();
		if (resul < this.getNumeroPaginas()){
			resul++;			
			this.setMarcador(resul);
		}
		return resul;
	}
	
	/**
	 * Aumenta el numero de paginas
	 * @return el numero de paginas total 
	 */
	public int escribir(){
		int resul = this.getNumeroPaginas();
		resul++;
		this.setNumeroPaginas(resul);
		return resul;
	}
	
	/**
	 * Devuelve las paginas restantes por leer
	 * @return numero de paginas restantes 
	 */
	public int cerrar(){
		return this.getNumeroPaginas()-this.getMarcador();
	}

	@Override
	public Libro clone() throws CloneNotSupportedException{
		return (Libro)super.clone();
	}
	
}
