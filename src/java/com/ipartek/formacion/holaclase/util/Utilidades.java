package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;

public class Utilidades {
	//Atributos
	public static final int ASC = 0;
	public static final int DESC = 1;
	
	//Constructores
	
	//Getters y Setters
	
	//Metodos
	
	/**
	 * Funcion que redondea los decimales largos
	 * @param d numero decimal a redondear
	 * @param decimalPlace numero de decimales a redondear
	 * @return numero redondeado
	 */
	public static float round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd.floatValue();
    }
	
	
	/**
	 * Funcion que ordena ascendentemente o descendentemente un array de enteros
	 * @param array array desordenado que hay que ordenar
	 * @param orden numero que se le pasa (0 == ASC, 1== DESC)
	 * @return array ordenado
	 */
	public static int[] ordenar (int array[], int orden) {
		int aux=0;
		for(int i=0; i<array.length; i++) {
			for (int j=(i+1); j<array.length; j++) {
				if(orden == ASC) {
					if(array[i]>array[j]) {
						aux= array[i];
						array[i]=array[j];
						array[j]= aux;
					}
				} 
				if(orden == DESC){
					if(array[i]<array[j]) {
						aux= array[i];
						array[i]=array[j];
						array[j]= aux;
					}
				}
			}
		}
		return array;
	}
	
}
