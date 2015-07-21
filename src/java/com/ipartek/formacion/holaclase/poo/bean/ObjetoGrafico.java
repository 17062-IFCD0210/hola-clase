package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase abstracta para representar un {@code ObjetoGrafico}
 * Atributos {@code x} e {@code y} para representar la posicion en 2D del {@code ObjetoGrafico}
 * @author Curso
 *
 */
public abstract class ObjetoGrafico {
	
	private int x;
	private int y;
	
	/**
	 * Creamos un {@code ObjetoGrafico} en un punto concreto
	 * @param x coordenada x
	 * @param y coordenada y
	 */
	public ObjetoGrafico(int x, int y) {
		super();
		this.setX(x);
		this.setY(y);
	}
	
	
	//getters y setters	
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

	/**
	 * Mover el {@code ObjetoGrafico} a una nueva posicion
	 * @param nuevaX nueva posicion X
	 * @param nuevaY nueva posicion Y
	 * @return retorna un String con la descripcion del movimiento.
	 */
	public String moverA (int nuevaX, int nuevaY){
		this.setX(nuevaX);
		this.setY(nuevaY);
		
		return "Objeto Grafico movido a: x=" + this.getX() + " y=" + this.getY();
	}
	
	/**
	 * Dibuja el {@code ObjetoGrafico}
	 * @return retorna un String con la descripcion del {@code ObjetoGrafico} dibujado
	 */
	protected abstract String dibujar();
	
	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 * @return retorna un String diciendo que se ha redimensionado
	 */
	protected abstract String Redimensionar();

}
