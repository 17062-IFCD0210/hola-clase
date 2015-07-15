package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.util.Utilidades;



/**
 * Objeto para calcular las vueltas de un cobro de forma mas optima posible
 * 
 * @author Ander Uraga Real
 *
 */
public class Calculadora {

	/**
	 * precio de la compra
	 */
	float precio;

	/**
	 * pago realizado o dinero entregado
	 */
	float pago;

	/**
	 * variable auxiliar donde se guarda el resto de las vueltas
	 */
	float vueltas;
	
	/**
	 * Array con las vueltas
	 */
	int[] aVueltas;

	/**
	 * Array con tipos de Monedas y Billetes
	 * <ul>
	 * <li>billete 50€</li>
	 * <li>billete 20€</li>
	 * <li>billete 10€</li>
	 * <li>billete 5€</li>
	 * <li>moneda 50€</li>
	 * <li>etc...</li>
	 * </ul>
	 */
	public static final float[] BILLETES_MONEDAS = { 50f, 20f, 10f, 5f, 2f, 1f,
			0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };

	/**
	 * valor en euros del billete de menor tamaño
	 */
	static final int BILLETE_MINIMO = 5;

	public Calculadora() {
		super();
		this.pago=0;
		this.precio=0;
		this.aVueltas=new int[BILLETES_MONEDAS.length];
	}

	/**
	 * Obtener las vueltas calculadas, para saber el valor de cada posicion del
	 * array podemos usar la variable: public static final int[]
	 * BILLETES_MONEDAS
	 * 
	 * @return {@code array} de {@code int} con las vueltas
	 */
	public int[] getVueltas() {
		return aVueltas;
	}

	/**
	 * Calcula las vueltas de forma optima para retornar los minimos billetes y
	 * monedas posibles
	 * 
	 * @param pago
	 *            {@code float} dinero entregado o pagado
	 * @param precio
	 *            {@code float} precio a cobrar
	 */
	public void calcular(float pago, float precio) {
		this.pago=pago;
		this.precio=precio;
		this.vueltas=this.pago-this.precio;
		for (int i = 0; i < BILLETES_MONEDAS.length; i++) {
			aVueltas[i] = (int) (vueltas / BILLETES_MONEDAS[i]);
			vueltas = vueltas % BILLETES_MONEDAS[i];
			vueltas = Utilidades.round(vueltas,2);
		}
	}

	/**
	 * Imprimir por pantalla las vueltas del cobro
	 */
	public void imprimirVueltas() {
		for(int i=0; i<aVueltas.length; i++){
			if (BILLETES_MONEDAS[i] >= BILLETE_MINIMO) {
				System.out.print(aVueltas[i] + " billetes de ");
				System.out.printf("%.0f", BILLETES_MONEDAS[i]);
				System.out.println("€");
			} else if (BILLETES_MONEDAS[i] >= 1) {
				System.out.print(aVueltas[i] + " monedas de ");
				System.out.printf("%.0f", BILLETES_MONEDAS[i]);
				System.out.println("€");
			} else {
				System.out.print(aVueltas[i] + " monedas de ");
				System.out.printf("%.2f", BILLETES_MONEDAS[i]);
				System.out.println("€");
			}
		}

	}
	
}