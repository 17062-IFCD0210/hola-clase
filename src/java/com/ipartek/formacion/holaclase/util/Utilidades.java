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
		int primero;
		int segundo;
		
		aOrdenado= new int[aSinOrdenar.length];
		
		boolean ordenado = false;
		
		//orden indica si se ordena de forma ascendente o descendente
		
		while (!ordenado) {
		
			ordenado = true;
			//Primero comprobar si ya está ordenado
			for (int i=0; i<aSinOrdenar.length; i++) {
				
				for(int j=i+1; j <aSinOrdenar.length -1; j++) {
					
					if (aSinOrdenar[i] > aSinOrdenar[j]) {
						
						ordenado = false;
					}
					
				}
			}
			
			//Si  no está ordenado lo ordenamos
			
			if(!ordenado) {
			
				for (int i=0; i<aSinOrdenar.length -1; i++) {
			
					if(aSinOrdenar[i] > aSinOrdenar[i+1]) {
						
						primero = aSinOrdenar[i+1]; 
						segundo = aSinOrdenar[i];
						
						aSinOrdenar[i+1] = primero; 
						aSinOrdenar[i] = segundo;
						
					}
				}
			}
		
		}

		return aSinOrdenar;
		
	}
}
