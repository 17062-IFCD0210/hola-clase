package com.ipartek.formacion.holaclase.poo.bean;

public class Libro {
		//Atributos
		private int numPaginas;
		private String dimensiones;
		private String autor;
		private String colorPortada;
		private int marcador;

		//Constructores
		public Libro(int numPaginas, String dimensiones, String autor,
				String colorPortada, int marcador) {
			super();
			this.numPaginas = numPaginas;
			this.dimensiones = dimensiones;
			this.autor = autor;
			this.colorPortada = colorPortada;
			this.marcador = marcador;
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
		
		 
}
