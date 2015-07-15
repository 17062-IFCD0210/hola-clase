package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;

public class Utilidades {
	
	static final int O_ASC = 0;
	static final int O_DES = 1;
	
	
	public static float round(float d, int decimalPlace) {
        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
	}

	
	public static int[] ordenar(int[] aSinOrdenar, int orden){
		
		int[] aOrdenado;  
		int auxiliar;
		
		aOrdenado = new int[aSinOrdenar.length];
		
		
		switch (orden) {
		
		case O_ASC:
			aOrdenado = aSinOrdenar.clone();
		
			for (int i=0; i<aOrdenado.length; i++) {
					
				for(int j=1; j <aOrdenado.length -1; j++) {
	
					if(aOrdenado[j] > aOrdenado[j-1]) {
						
						auxiliar = aOrdenado[j]; 
						
						aOrdenado[j]   = aOrdenado[j-1];
						aOrdenado[j-1] = auxiliar;
						
					}
					
				}
			}
			break;
			
		case O_DES:
			aOrdenado = aSinOrdenar.clone();
			for (int i=0; i<aOrdenado.length; i++) {
				
				for(int j=1; j <aOrdenado.length -1; j++) {
	
					if(aOrdenado[j] < aOrdenado[j-1]) {
						
						auxiliar = aOrdenado[j]; 
						
						aOrdenado[j]   = aOrdenado[j-1];
						aOrdenado[j-1] = auxiliar;
						
					}
					
				}
			}
			break;
			
		default:
			
			aOrdenado = null;
			
		}

		System.out.println("------------Sin Ordenar-------------------");
		for(int i=0; i<aSinOrdenar.length; i++) {
			
				System.out.println(aSinOrdenar[i]);

		}
		System.out.println("---------------------------------------------");
		

		System.out.println("------------Ordenado -------------------");
		for(int i=0; i<aOrdenado.length; i++) {
			
				System.out.println(aOrdenado[i]);

		}
		System.out.println("---------------------------------------------");

		return aOrdenado;
		
	}
}
