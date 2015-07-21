package com.ipartek.formacion.holaclase.poo.bean;

/**
 * Clase abstracta para representar un {@code ObjetoGrafico} Atributos {@code x}
 * e {@code y} para representar la posicion en 2D del objeto
 *
 * @author Javi
 *
 */
public abstract class ObjetoGrafico {

	private Punto p1;

	/**
	 * Creamos un {@code ObjetoGrafico} en un {@code Punto}
	 *
	 * @param Punto
	 * @throws CloneNotSupportedException
	 * @throws Exception
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
	 * @param pMover
	 *            {@code Punto} a mover nueva posicion x
	 *
	 * @return
	 * @throws CloneNotSupportedException
	 */
	public void moverA(Punto pMover) throws CloneNotSupportedException {
		this.p1 = pMover.clone();

	}

	/**
	 * Dibuja el {@code ObjetoGrafico}
	 *
	 * @return una cadena de texto diciendo que se ha dibujado
	 */
	public abstract String dibujar();

	/**
	 * Redimensiona el {@code ObjetoGrafico}
	 *
	 * @return una cadena de texto diciendo que se ha redimensionado
	 */
	public abstract String redimensionar();

	/**
	 * Clase interna Punto
	 *
	 * @author Javi
	 *
	 */
	public class Punto implements Cloneable {
		private int x;
		private int y;

		public Punto(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

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
		public Punto clone() throws CloneNotSupportedException {
			return (Punto) super.clone();
		}

	}
}
