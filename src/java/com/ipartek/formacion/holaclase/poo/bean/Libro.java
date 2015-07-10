package com.ipartek.formacion.holaclase.poo.bean;

public class Libro {

	private int numeroPaginas;
	private String dimensiones;
	private Persona autor;
	private String colorPortada;
	private int marcador;
	
	//Constructores
	public Libro(){
		super();
		this.numeroPaginas=0;
		this.dimensiones="10x10";
		this.autor = new Persona ("Anonimo",Persona.EDAD_MINIMA);
		this.colorPortada="Negra";
		this.setMarcador(0);
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
	public Persona getAutor() {
		return autor;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(Persona autor) {
		this.autor = autor;
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
	 */
	public void abrir(){
		
	}
	
	/**
	 * Actualiza el marcador avanzando una posicion
	 */
	public void leer(){
		this.setMarcador(this.getMarcador()+1);
	}
	
	
	public void escribir(){
	}
	
	/**
	 * Devuelve las paginas restantes por leer
	 */
	public int cerrar(){
		return this.getNumeroPaginas();
	}

}
