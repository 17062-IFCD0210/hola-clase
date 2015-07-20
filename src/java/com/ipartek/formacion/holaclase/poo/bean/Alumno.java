package com.ipartek.formacion.holaclase.poo.bean;

public class Alumno extends Persona {
	
		private boolean  aprobado;
		private float	 nota;
		
		public Alumno() {
			super();
			this.aprobado = false;
			this.nota	  = (float)0.0; //CASTEAR, para poder inicializarlo	
		}

		public boolean isAprobado() {
			return aprobado;
		}

		public void setAprobado(boolean aprobado) {
			this.aprobado = aprobado;
		}

		public float getNota() {
			return nota;
		}

		public void setNota(float nota) {
			this.nota = nota;
		}

		@Override
		public String toString() {
			return "Alumno [aprobado=" + aprobado + ", nota=" + nota + "]";
		}


}
