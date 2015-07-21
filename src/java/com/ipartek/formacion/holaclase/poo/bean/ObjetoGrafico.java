package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase Abstracta para representar un {@code ObjetoGrafico}
 * Atributos {@code x} e {@code y} para representar la posicion en 2D del objeto
 * @author Curso
 *
 */

public abstract class ObjetoGrafico {

	private Punto p1;

	/**
	 * Creamos un objeto {@code ObjetoGrafico} en un {@code Punto} concreto (x,y)
	 * 
	 * @param Punto
	 */
	public ObjetoGrafico(Punto p) throws CloneNotSupportedException{
		super();
		this.p1 = p.clone();
	}

	/**
	 * Mover el <code>ObjetoGrafico</code> a una nueva posicion
	 * @param mMover {@code Punto} a mover
	 */
	public void mover( Punto pMover) {
		this.p1 = pMover.clone();
	}
	/**
	 * Dibuja el {@code ObjetoGrafico}
	 * @return una cadena de texto diciendo que se ha dibujado
	 */
	public abstract String dibujar();
	
	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 * @return cadena de texto diciendo que se ha redimensionado
	 */
	public abstract String redimensionar();
	
	public class Punto{
		private int x;
		private int y;
		
	public Punto(int x, int y){
			super();
			this.x = x;
			this.y = y;
		}
		
		//Getters y Setters
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		
		
		
		
	
	}
		

}
