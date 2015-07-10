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
		private String	colorPortada;
		private int		marcador;
		
		
		//Constructores, para construir objetos

		/**
		 * @param autor
		 */
		public Libro(String autor) {
			super();
			this.numPaginas		= MIN_PAGINAS;
			this.dimensiones	= "50x50";
			this.autor			= "anonimo";
			this.colorPortada	= "marron";
			this.marcador		= 1;

		}

		//Getters y Setters

		/**
		 * @return the numPaginas
		 */
		public int getNumPaginas() {
			return numPaginas;
		}


		/**
		 * @param numPaginas the numPaginas to set
		 */
		public void setNumPaginas(int numPaginas) {
			this.numPaginas = numPaginas;
			
			if( numPaginas < MIN_PAGINAS) {
				
				this.numPaginas = MIN_PAGINAS;
			
			} else if ( numPaginas > MAX_PAGINAS) {
			
				this.numPaginas = MAX_PAGINAS;
				
			} else {
			
				this.numPaginas = numPaginas;
			}

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
			
			//Si acabamos el libro, el marcador lo ponemos de nuevo a 1 (pagina 1)
			
			if (marcador > MAX_PAGINAS) {
				
				this.marcador = 1;
			} else {
				this.marcador = marcador;
			}
				
				
		}

		public void leer(){
			
			this.getMarcador();
			
		}

		public void escribir(){
			
		}

		public void abrir(){
			
		}

		public void cerrar(){
			
		}
		
		
		
		
		//metodos

		//Metodos y Utilidades
		//@Override, sobreescribimos el método de el padre
		

}
