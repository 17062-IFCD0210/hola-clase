package com.ipartek.formacion.holaclase.constantes;

public enum Vaso {
	 // Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.
    KATXI(1000),JARRA(500), TUBO(250), TERCIO(333), CA�A(200);

 // Variable interna donde almacenaremos la capacidad
    private int cc; 

    // Nuestro constructor nos fuerza a pasar par�metros al definir un nuevo tipo
    Vaso(int cc) {
        this.cc = cc;
    }

    // Devuelve la capacidad del vaso
    public int getCentimetrosCubicos() {
        return cc;
    }
}
