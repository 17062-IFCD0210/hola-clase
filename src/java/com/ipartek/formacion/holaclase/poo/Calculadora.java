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

	public Calculadora() {
		super();
//		aVueltas = new int[12];
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
		
		if(pago>precio){
			float resto = pago - precio;
			int indice = 0;
			float parteEntera=0f;
				
			do{
				parteEntera=(int) (resto/BILLETES_MONEDAS[indice]);
				//uso el metodo redondear de la clase Utilidades
				resto=Utilidades.round(resto%BILLETES_MONEDAS[indice],2);
				aVueltas[indice] = (int)parteEntera;
				indice++;
			}
			while(resto>=0 && indice<=11);			
		}
		else{ 
			for(int i=0;i<aVueltas.length;i++) aVueltas[i]=0; 
		}
	}

	/**
	 * Imprimir por pantalla las vueltas del cobro
	 */
	public void imprimirVueltas() {	
		int i=0;
		System.out.println("------------- RESULTADO ---------------------");
		System.out.println("Vueltas de " + (float)(pago - precio) + " Euros:");
		for (i=0;i<12;i++){
			if(i<=3){
				System.out.println("En " + aVueltas[i] + " Billetes de " + (int)BILLETES_MONEDAS[i]);
			}
			else{
				System.out.println("En " + aVueltas[i] + " Monedas de " + BILLETES_MONEDAS[i]);
			}
		}
		System.out.println("---------------------------------------------");
	}

	/**
	 * Redondear un número
	 * @param numero numero a redondear
	 * @param digitos digitos con los que se quiera redondear
	 * @return el numero redondeado
	 */
	public static float redondear(float numero,int digitos)
	{
	      int cifras=(int) Math.pow(10,digitos);
	      return (float) (Math.rint(numero*cifras)/cifras);
	}

	
}
