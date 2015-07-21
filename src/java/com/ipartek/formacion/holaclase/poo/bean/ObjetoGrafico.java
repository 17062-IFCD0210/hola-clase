package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase abstracta para representar un {@code ObjetoGrafico} Atributos {@code x}
 * e {@code y} para representar la posicion en 2D del objeto
 *
 * @author ur00
 *
 */
public abstract class ObjetoGrafico {

	private Punto p1;

	/**
	 * Creamos un objeto {@code ObjetoGrafico} en un {@code Punto}
	 *
	 * @param Punto
	 * @throws CloneNotSupportedException
	 */
	public ObjetoGrafico(Punto p) throws CloneNotSupportedException {
		super();
		this.p1 = p.clone();
	}

	public Punto getP1() {
		return p1;
	}

	public void setP1(Punto p1) {
		this.p1 = p1;
	}

	/**
	 * Mover el {@code ObjetoGrafico} a una nueva posicion
	 *
	 * @param pMober
	 *            {@code Punto} a mover
	 * @throws CloneNotSupportedException
	 */
	public void mover(Punto pMover) throws CloneNotSupportedException {
		this.p1 = pMover.clone();
	}

	/**
	 * Dibuja el {@code ObjetoGrafico}
	 *
	 * @return cadena de texto diciendo que se ha dibujado
	 */
	public abstract String dibujar();

	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 *
	 * @return cadena de texto diciendo que se ha redimensionado
	 */
	public abstract String redimensionar();

}
