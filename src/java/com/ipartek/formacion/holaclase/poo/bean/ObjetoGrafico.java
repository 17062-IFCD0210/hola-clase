package com.ipartek.formacion.holaclase.poo.bean;


/**
 * Clase abstracta para representar un {@code ObjetoGrafico}
 * Atributos {@code x} e {@code y} para representar la posicion en 2D del objeto
 * @author Curso
 *
 */
public abstract class ObjetoGrafico {
	
	private int x;
	private int y;
	
	

	/**
	 * Creamos un {@code ObjetoGrafico} en un punto concreto
	 * @param x
	 * @param y
	 */
	public ObjetoGrafico(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	
	//Getters y setters
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


	@Override
	public String toString() {
		return "ObjetoGrafico [x=" + x + ", y=" + y + "]";
	}
	
	
	/**
	 * Mover el {@code ObjetoGrafico} a una nueva posicion
	 * @param x
	 * @param y
	 */
	void mover(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Dibuja el {@code ObjetoGrafico}
	 * @return una cadena de texto diciendo que se ha dibujado
	 */
	abstract String dibujar();
	
	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 * @return una cadena de texto diciendo que se ha redimensionado
	 */
	abstract String redimensionar();
	
	
}
