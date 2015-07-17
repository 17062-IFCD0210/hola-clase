/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * @author Curso
 *
 */
public class Libro implements Cloneable {

	
	//Atributos encapsulados
	private String titulo;
	private int numeroPaginas;
	private String dimensiones;
	private String autor;
	private String colorPortada;
	private int marcador;
	//Atributos sin encapsular
	//public int marcador = 0;
	
	//Constructores

	public Libro(String titulo) {
		super();
		this.titulo = titulo;
		this.numeroPaginas = 0;
		this.dimensiones = "";
		this.autor = "An�nimo";
		this.colorPortada = "";
		this.marcador = 0;
	}

	//Getters y Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		numeroPaginas = numeroPaginas;
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
	
	@Override
	public String toString() {
		return "Libro [numeroPaginas=" + numeroPaginas + ", dimensiones="
				+ dimensiones + ", autor=" + autor + ", titulo=" + titulo
				+ ", colorPortada=" + colorPortada + ", marcador=" + marcador
				+ "]";
	}
	
	/**
	 * Leer una p�gina del libro, se actualiza marcador, no se puede leer m�s del n�mero de p�ginas
	 * @return p�gina actual o marcador
	 */
	//M�todos o funciones
	public int leer(){
		int resul = this.getMarcador();
		//No leer mas del numeroPaginas
		if ( resul < this.getNumeroPaginas() ){
			this.setMarcador(++resul);//Se suma la variable y luego entra en el m�todo
		}	
		return resul;
	}
	
	/**
	 * Aumenta el n�mero de p�ginas
	 * @return n�mero de p�ginas
	 */
	public int escribir (){
		int resul = this.getNumeroPaginas();
		resul++;
		this.setNumeroPaginas(resul);
		return resul;
	}
	
	/**
	 * Abre el libro y retorna el marcador con p�gina actual 
	 * @return marcador
	 */
	public int abrir(){
		return getMarcador();
	}
	
	/**
	 * Cierra el libro y retorna n�mero de p�ginas para finalizar
	 * @param pagina
	 * @return n�mero de p�ginas restantes
	 */
	public int cerrar(){
		return this.getNumeroPaginas() - this.getMarcador();
	}
	
	@Override
	public Libro clone() throws CloneNotSupportedException  {
        return (Libro)super.clone();
    }
}
