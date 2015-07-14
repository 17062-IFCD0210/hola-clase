package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;

public class Utilidades {

	//Atributos
	final static byte ASCENDENTE = 0; //static para que sea accesible desde fuera de la clase
	final static byte DESCENDENTE = 1;
	
	/**
	    * Round redondea numeros decimales
	    * 
	    * @param d numero decimal a redondear
	    * @param decimalPlace numero de decimales
	    * @return numero redondeado
	    */

	    public static float round(float d, int decimalPlace) {
	        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
	    }
	
	    public static int[] ordenarArray(int[] vector, byte orden){
	    	
	    	int nTemp = 0;
	    	
	    	if (vector.length>1){ //para que no casque por length+1
	    		if (orden == ASCENDENTE){
			    	for (int i=0 ; i<vector.length-1 ; i++){
			    		for (int j=1 ; j<vector.length ; j++){
			    			if ( vector[i] > vector[j]){ 
				    			nTemp = vector[j];
				    			vector[j] = vector[i];
				    			vector[i] = nTemp;
				    		}
			    		}
			    	}
	    		}else
		    		if (orden == DESCENDENTE){
				    	for (int i=0 ; i<vector.length-1 ; i++){
				    		for (int j=1 ; j<vector.length ; j++){
				    			if ( vector[i] < vector[j]){ 
					    			nTemp = vector[j];
					    			vector[j] = vector[i];
					    			vector[i] = nTemp;
					    		}
				    		}
				    	}
		    		}
		    }
	    	
	    	/*if (vector.length>1){ //para que no casque por length+1
		    	for (int i=0 ; i<vector.length-1 ; i++){
		    		for (int j=0 ; j<vector.length-2 ; j++){
			    		if ( vector[i] > vector[i+1]){ 
			    			nTemp = vector[i+1];
			    			vector[i+1] = vector[i];
			    		}
		    		}
		    	}
	    	}*/
	    	
	    	return vector;
	    }
	    

}
