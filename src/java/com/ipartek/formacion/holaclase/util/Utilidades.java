package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidades {
	public static final int ASCENDENTE  = 0;
	public static final int DESCENDENTE = 1;


	/**
     * Round redondea numeros decimales
     * 		@param de numero decimal a redondear
     * 		@param decimalPlace numero de decimales
     * 		@return numero redondeado
     */
    public static float round(float d, int decimalPlace) {
         return BigDecimal.valueOf(d).setScale(decimalPlace,BigDecimal.ROUND_HALF_UP).floatValue();
    }
    
    /**
     * funcion que ordena un array de manera ascendente o descendente
     * 	@param array	Array con numeros a ordenar
     * 	@param orden	orden de ordenacion: ascendente(0) o descendente(1)
     * 	@return			retorna el array ordenado
     */
    public static int[] ordenar(int[] array, int orden){
		
    	//clonar array para evitar que array y arrayOrdenado apunten al mismo sitio de memoria
    	//Si igualaramos a array, estriamos poninedo que tanto n, nAscd,nDescd son iguales
    	int[] arrayOrdenado = array.clone();
    	
    	//Variable para comparar los valores del array de dos en dos.
    	int ayudante1 = 0;
    	int ayudante2 = 0;
    	
    	/**
    	 * Bucle que se repite tantas veces como tamaño del array para cerciorarse de que se ordena correctamente
    	 * 
    	 * TODO Optimizar bucle, para suprimir las vueltas que da de mas.
    	 */
    	for(int cnt=0; cnt<array.length; cnt++){    	
	    	
    		//Intento de ordenacion del array (Ordena el array en distintas pasadas por este codigo)
    		for(int i=0, j=1; j<array.length; i++,j++){
	    		
    			ayudante1 = arrayOrdenado[i];
	    		ayudante2 = arrayOrdenado[j];
	        	
	    		switch (orden){
	    			case ASCENDENTE:
	    				if(ayudante1 < ayudante2){
	    					//arrayOrdenado[i] = ayudante1;
	    					//arrayOrdenado[j] = ayudante2;
	    				}else{
	    					arrayOrdenado[i] = ayudante2;
	    					arrayOrdenado[j] = ayudante1;
	    				}    			
	    				break;
	    			case DESCENDENTE:
	    				if(ayudante1 > ayudante2){
	    					//arrayOrdenado[i] = ayudante1;
	    					//arrayOrdenado[j] = ayudante2;
	    				}else{
	    					arrayOrdenado[i] = ayudante2;
	    					arrayOrdenado[j] = ayudante1;
	    				}    			
	    				break;
	        	}	
	    	}
    	}    	    	
		return arrayOrdenado;
    }
	
    /**
     * Funcion que verifica si el parametro pasado tiene un formato de email.
     * @param correo email a verificar
     * @return retorna booleano: true si es email, false si no lo es.
     */
    public static boolean isEmail(String correo) {
        Pattern pat = null;
        Matcher mat = null;        
        pat = Pattern.compile("^([0-9a-zA-Z]([_.w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-w]*[0-9a-zA-Z].)+([a-zA-Z]{2,9}.)+[a-zA-Z]{2,3})$");
        mat = pat.matcher(correo);
        if (mat.find()) {
            System.out.println("[" + mat.group() + "]");
            return true;
        }else{
            return false;
        }        
    }
    /**
     * Metodo tonto para pruebas(import export .jar)
     */
    public static void cantar(){
    	System.out.println("Cantanndoooo");
    }
	
}