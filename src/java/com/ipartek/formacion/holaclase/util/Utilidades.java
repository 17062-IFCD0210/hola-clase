package com.ipartek.formacion.holaclase.util;

import java.math.BigDecimal;

public class Utilidades {

	
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
	
}
