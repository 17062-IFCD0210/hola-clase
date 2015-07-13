package com.ipartek.formacion.holaclase.poo.bean;

public class Libro {

	//Constantes
	
	//Atributos
	private int		 numeroPaginas;
	private String   dimensiones;
	private String	 autor;
	private String	 titulo;
	private String	 colorPortada;
	private int	 	 marcador;
	
	
	//Constructores
	public Libro(String titulo) {
		super();
		//inicializamos los atributos para que no esten a null; con this accedemos al atributo de a ppia clase
		
		this.numeroPaginas	= 0;
		this.dimensiones    = "";
		this.autor	        = "anonimo";
		this.titulo		    = titulo;	
		this.colorPortada	= "";	
		this.marcador 		= 0;
	
	}
	
	/**
	 * Constructor con parametros
	 * @param nombre nombre del libro
	 * @param paginas paginas del libro
	 */
	

	//Getters y Setters
	

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

	
	//Metodos y Utilidades
	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + ", dimensiones="
				+ dimensiones + ", autor=" + autor + ", titulo=" + titulo
				+ ", colorPortada=" + colorPortada + ", marcador=" + marcador
				+ "]";
	}

	
	/**
	 * Leer una pagina del libro, se actualiza marcador, no se puede leer mas que el numero de paginas
	 * @return pagina actual  marcador
	 */
	
	
	public int leer (){
		int resul = this.getMarcador();	
		 //No leer mas del numeroPaginas
		if( resul < this.getNumeroPaginas() ){
			resul++;
			this.setMarcador(resul);
		}
		return resul;
	}
	
	/**
	 * 	Aumenta el numero de paginas
	 * @retun numero de paginas total
	 */
	public int escribir (){
		
		int resul = this.getNumeroPaginas();
		resul ++;
		this.setNumeroPaginas(resul);//numeroPaginas=resul; es lo mismo
		return resul;
	}
	
	/**
	 * Abre el libro y retorna el marcador con la pagina actual
	 * @return marcador
	 */
	public int abrir(){
		return this.getMarcador();
	}
	/**
	 * Cierra el Libro y retorna el numero de paginas para finalizar
	 * @return numero de pagnas restantes
	 */
	public int cerrar(){
		return this.getNumeroPaginas() - this.getMarcador();
	}
}
