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
	
	//Constructor
	public Calculadora() {
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

	/**
	 * Calcula las vueltas de forma optima para retornar los minimos billetes y
	 * monedas posibles
	 * 
	 * @param pago
	 *            {@code float} dinero entregado o pagado
	 * @param precio
	 *            {@code float} precio a cobrar
	 */
	public void calcular(float pago, float precio) { //o poner un guión bajo (_) en los parámetros para diferenciar de los atributos
		this.pago = pago;
		this.precio = precio;
		float resto = this.pago - this.precio; //Se puede liar con los parámetros
		
		for (int i=0; i<BILLETES_MONEDAS.length; i++){
			aVueltas[i] = (int) (resto / BILLETES_MONEDAS[i]);
			resto %=  BILLETES_MONEDAS[i];
			resto = Utilidades.round( resto ,2);
		}
	}
	
	/**
	 * Imprimir por pantalla las vueltas del cobro
	 */
	public void imprimirVueltas() {
		String resultado = "";
		resultado = "--------------RESULTADO--------------\n";
		resultado += "Vueltas de " + (this.pago - this.precio) + " Euros:\n\n";
		for (int i=0 ; i<BILLETES_MONEDAS.length ; i++){
			resultado += "En " + aVueltas[i];
			
			if (BILLETES_MONEDAS[i] <= BILLETE_MINIMO)
				resultado += " Billetes de " + aVueltas[i];
			else{
				resultado += " Monedas de " + aVueltas[i];
				if (BILLETES_MONEDAS[i] == 2){
					resultado += " Euros";
				}else if (BILLETES_MONEDAS[i] == 1){
					resultado += " Euro";
				}
			}
		}
		System.out.println(resultado);
	}
}
