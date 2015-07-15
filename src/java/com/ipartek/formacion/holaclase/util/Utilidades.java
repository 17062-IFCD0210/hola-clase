package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;

public class Utilidades {

	/**
	 * Round to certain number of decimals
	 * 
	 * @param d
	 * @param decimalPlace
	 * @return
	 */
	public static float round(float d, int decimalPlace) {
		BigDecimal bd = new BigDecimal(Float.toString(d));
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.floatValue();
	}
	
	/**
	 * Metodo para ordenar array de integers de manera ascendente o descendente
	 * @param array Array con integers que queremos ordenar
	 * @param orden [0-1] variable integer con valor 0 para ordenar de forma ascendente
	 * y 1 (o distinto de 0) para ordenar de forma descendente 
	 */
	public static void ordenar(int[] array, int orden){
		int aux = 0;
		
		if (orden==0){
			for (int i=0; i<array.length-1;i++){
				if (array[i]>array[i+1]){
					aux=array[i];
					array[i]=array[i+1];
					array[i+1]=aux;
					ordenar(array,orden);
				}
			}
		}else{
			for (int i=array.length-1; i>=1;i--){
				if (array[i]>array[i-1]){
					aux=array[i];
					array[i]=array[i-1];
					array[i-1]=aux;
					ordenar(array,orden);
				}
			}
		}
	}
}
