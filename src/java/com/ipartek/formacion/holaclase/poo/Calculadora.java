package com.ipartek.formacion.holaclase.poo;

import java.math.BigDecimal;
import java.text.DecimalFormat;

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
	private float precio;

	/**
	 * pago realizado o dinero entregado
	 */
	private float pago;

	/**
	 * Array con las vueltas
	 */
	private int[] aVueltas;

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
		this.pago = 0;
		this.precio = 0;
		this.aVueltas = new int[BILLETES_MONEDAS.length];
	}

	/**
	 * Obtener las vueltas calculadas, para saber el valor de cada posicion del
	 * array podemos usar la variable: public static final int[]
	 * BILLETES_MONEDAS
	 * 
	 * @return {@code array} de {@code int} con las vueltas
	 */
	public int[] getVueltas() {
		return this.aVueltas;
	}
	
	public float getPago(){
		return Utilidades.round(this.pago, 2);
	}
	
	public float getPago( int numeroDecimales ){
		return Utilidades.round(this.pago, numeroDecimales);
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
		this.pago = pago;
		this.precio = precio;
		float resto = this.pago - this.precio;

		for (int i = 0; i < aVueltas.length; i++) {
			aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
			resto %= BILLETES_MONEDAS[i];		
			resto = Utilidades.round(resto, 2);
			
		}

	}
	
	

	/**
	 * Imprimir por pantalla las vueltas del cobro
	 */
	public void imprimirVueltas() {
		System.out.println("Nos devuelven " + (this.pago - this.precio)
				+ " Euros");
		String imprimir = "";
		for (int i = 0; i < aVueltas.length; i++) {

			imprimir = aVueltas[i] + " ";
			if (BILLETE_MINIMO <= BILLETES_MONEDAS[i]) {
				imprimir += "Billetes " + (int) BILLETES_MONEDAS[i] + " €";
			} else {
				imprimir += "Monedas " + BILLETES_MONEDAS[i] + " €";
			}

			System.out.println(imprimir);
		}
	}

}
