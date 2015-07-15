package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;

public class Utilidades {

	
	public static final int ASCENDENTE = 0;
	public static final int DESCENDENTE = 1;
	
	/**
	    * Round redondea numeros decimales
	    * 
	    * @param d numero decimal a redondear
	    * @param decimalPlace numero de decimales
	    * @return numero redondeado
	    */

	    public static float round(float d, int decimalPlace) {
	    	//al ser public se puede usar desde fuera
	    	//al ser static no hay que crear el objeto para usar la funcion
	        return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
	    }
	    
	    /**
	     * <b>ORDENACION POR EL METODO DE LA BURBUJA</b><br>  
	     * Ordena el array en sentido ascendente o descendente
	     * @param array el array a ordenar
	     * @param orden ASCENDENTE o DESCENDENTE
	     * @return array ordenado
	     */
	    public static int[] ordenarNoEficiente(int[] array, int orden){
	    	int[] resul=array;
	    	int auxiliar=0;
	    	    	
    		for(int i=0;i<array.length;i++){	
    			for(int j=i;j<array.length;j++){
    				if((resul[i]>resul[j] && orden==ASCENDENTE)||(resul[i]<resul[j] && orden==DESCENDENTE)){
    					auxiliar=resul[i];
    					resul[i]=resul[j];
    					resul[j]=auxiliar;
    				}
    			}
    		}
	    	return resul;
	    }
	    
	    
	    /**
	     * <b>ORDENACION POR EL METODO DE LA BURBUJA MEJORADO</b><br> 
	     * Ordena el array en sentido ascendente o descendente
	     * mas eficientemente que el metodo de la burbuja
	     * @param array el array a ordenar
	     * @param orden ASCENDENTE o DESCENDENTE
	     * @return array ordenado
	     */	    
	    public static int[] ordenar(int[] array, int orden){
	    	int[] resul=array; 
	    	int auxiliar=0;
	    	int bandera = 0;
	    	
    		for(int i=0;i<array.length;i++){	
    			bandera = 0;
    			for(int j=i;j<array.length;j++){
    				if((resul[i]>resul[j] && orden==ASCENDENTE)||(resul[i]<resul[j] && orden==DESCENDENTE)){
    					auxiliar=resul[i];
    					resul[i]=resul[j];
    					resul[j]=auxiliar;
    					bandera = 1;
    				}
    			}
    			if (bandera == 0) break;
    		}
	    	return resul;
	    }
}
