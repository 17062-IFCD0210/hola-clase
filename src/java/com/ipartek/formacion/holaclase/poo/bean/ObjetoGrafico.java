package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase abstracta para representar un {@code ObjetoGrafico} Atributos {@code x}
 * e {@code y} para representar la posicion en 2D del objeto
 *
 * @author Raul
 *
 */
public abstract class ObjetoGrafico {
	// Atributos
	private Punto p1;

	// Constructores
	public ObjetoGrafico() {
		super();
	}

	/**
	 * Creamos un {@code ObjetoGrafico} en un punto concreto
	 *
	 * @param x
	 * @param y
	 * @throws CloneNotSupportedException
	 */
	public ObjetoGrafico(Punto p1) throws CloneNotSupportedException {
		super();
		this.p1 = p1.clone();
	}

	// Getters y Setters
	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	// Metodos
	/**
	 * Mover el {@code ObjetoGrafico} a una nueva posicion
	 *
	 * @param pMover
	 *            {@code Punto}
	 */
	public void mover(Punto pMover) {
		this.p1 = pMover;
	}

	/**
	 * Dibuja el {@code ObjetoGrafico}
	 *
	 * @return retorna una cadena de texto diciendo que se ha dibujado
	 */
	public abstract String dibujar();

	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 *
	 * @return retorna una cadena de texto diciendo que se ha redimensionado
	 */
	public abstract String redimensionar();

}
