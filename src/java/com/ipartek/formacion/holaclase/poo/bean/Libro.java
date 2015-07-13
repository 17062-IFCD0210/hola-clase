/**
 * 
 */
package com.ipartek.formacion.holaclase.poo.bean;

/**
 * @author Curso
 *
 */

public class Libro {

		//Constantes (final indica que es una constante)
		static final int MIN_PAGINAS = 50;
		static final int MAX_PAGINAS = 1000;
		

		//Atributos
		private int		numPaginas;
		private String  dimensiones;
		private String	autor;
		private String	titulo;
		private String	colorPortada;
		private int		marcador;
		
		
		//Constructores, para construir objetos

		/**
		 * @param autor
		 */
		public Libro(String titulo) {
			super();
			this.numPaginas		= 0;
			this.dimensiones	= "";
			this.autor			= "anonimo";
			this.titulo			= titulo;
			this.colorPortada	= "";
			this.marcador		= 0;

		}

		//Getters y Setters

		/**
		 * @return the numPaginas
		 */
		public int getNumPaginas() {
			return numPaginas;
		}


		/**
		 * @return the numPaginas
		 */
		public String getTitulo() {
			return titulo;
		}


		/**
		 * @param numPaginas the numPaginas to set
		 */
		public void setNumPaginas(int numPaginas) {
			this.numPaginas = numPaginas;
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


		public void setTitutlo(String titulo) {
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
			
			this.marcador = marcador;
		}

		/**
		 * Leer una pagina del libro, se actualiza marcador
		 * @return pagina actual o marcador
		 */
		public int leer(){
			
			int resul = this.getMarcador();

			//tope de paginas que se pueden  leer
			if ( resul < this.getNumPaginas()) {
				resul++;
				this.setMarcador(resul);
			}
			
			return resul;
			
		}

		/**
		 * Aumenta el numero de paginas del libro
		 * @return numero de paginas
		 */
		public int escribir(){
			int resul = this.getMarcador();
			resul++;
			this.setNumPaginas(resul);
			return resul;
			
		}
		/**
		 * Abre el libro y retorna el marcador con la pagina actual
		 * 
		 * @return marcador
		 */
		public int abrir(){
			return this.getMarcador();
			
		}
		
		/**
		 * 
		 * @return paginas que quedan por leer
		 */
		public int cerrar(){
			return this.getNumPaginas() - this.getMarcador();
			
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Libro [numPaginas=" + numPaginas + ", dimensiones="
					+ dimensiones + ", autor=" + autor + ", titulo=" + titulo
					+ ", colorPortada=" + colorPortada + ", marcador="
					+ marcador + "]";
		}
		
		
}
