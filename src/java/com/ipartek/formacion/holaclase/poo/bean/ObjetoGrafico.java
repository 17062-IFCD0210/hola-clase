package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase abstracta para representar un {@code ObjetoGrafico}
 * Atributos {@code x} e {@code y} para representar la posicion en 2D del {@code ObjetoGrafico}
 * @author Curso
 *
 */
public abstract class ObjetoGrafico {
	
	private Punto p1;
	
	/**
	 * Creamos un {@code ObjetoGrafico} en un punto concreto
	 * @param x coordenada x
	 * @param y coordenada y
	 * @throws CloneNotSupportedException 
	 */
	public ObjetoGrafico(Punto p) throws CloneNotSupportedException {
		super();
		this.p1 = p.clone();
	}
	
		
	//getters y setters
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p) throws CloneNotSupportedException {
		this.p1 = p.clone();
	}
	
	
	/**
	 * Mover el {@code ObjetoGrafico} a una nueva posicion
	 * @param pMover {@code Punto} a mover
	 * @return retorna un String con la descripcion del movimiento.
	 * @throws CloneNotSupportedException 
	 */
	public String moverA (Punto pMover) throws CloneNotSupportedException{
		this.p1 = pMover.clone();
		
		return "Objeto Grafico movido a: x=" + this.p1.getX() + " y=" + this.p1.getY();
	}
	
	/**
	 * Dibuja el {@code ObjetoGrafico}
	 * @return retorna un String con la descripcion del {@code ObjetoGrafico} dibujado
	 */
	public abstract String dibujar();
	
	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 * @return retorna un String diciendo que se ha redimensionado
	 */
	public abstract String Redimensionar();
	
	
	

}
