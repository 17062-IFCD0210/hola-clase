package com.ipartek.formacion.holaclase.poo.bean;

public class Libro implements Cloneable {
		//Atributos
		private int 	numPaginas;
		private String 	dimensiones;
		private String 	autor;
		private String 	titulo;
		private String 	colorPortada;
		private int		marcador;

		//Constructores
		public Libro(String titulo) {
			super();
			this.titulo = titulo;
			this.numPaginas = 0;
			this.dimensiones = "";
			this.autor = "anonimo";
			this.colorPortada = "";
			this.marcador = 0;
		}
		

		//Getters and setters
		public int getNumPaginas() {
			return numPaginas;
		}

		public void setNumPaginas(int numPaginas) {
			this.numPaginas = numPaginas;
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

		
		//Funciones y utilidades
		@Override
		public String toString() {
			return "Libro [numPaginas=" + numPaginas + ", dimensiones="
					+ dimensiones + ", autor=" + autor + ", titulo=" + titulo
					+ ", colorPortada=" + colorPortada + ", marcador="
					+ marcador + "]";
		}
		
		/**
		 * Leer una pagina del libro, se actualiza marcador. No se puede leer mas del numero de paginas.
		 * @return pagina actual o marcador
		 */
		public int leer() {
			int resul = this.getMarcador();
			//No leer mas del numero de paginas
			if ( resul < this.getNumPaginas() ){
				resul++;
				this.setMarcador(resul);
				
			}
			resul++;
			this.setMarcador(resul);
			return resul;
		}
		
		/**
		 * Aumenta el numero de paginas
		 * @return numero de paginas totales
		 */
		public int escribir(){
			
			int resul = this.getNumPaginas();
			resul++;
			this.setNumPaginas(resul);  //ó this.numPaginas = resul;
			return resul;
			
		};
		
		
		/**
		 * Abre el libro y retorna el marcador por la pagina actual
		 * @return marcador
		 */
		public int abrir (){
			return this.getMarcador();
		}
		
		
		/**
		 * Cierra el libro y retorna numero de paginas restantes
		 * @return numero de paginas restantes
		 * @return
		 */
		public int cerrar(){
			return this.getNumPaginas() - this.getMarcador();
		}
		 
		
		@Override
		public Libro clone() throws CloneNotSupportedException   {
	        return (Libro)super.clone();
	    }
		
		
}
