package com.ipartek.formacion.holaclase.constantes;

/*
 * Un tipo enumerado "complejo", tiene sus propios m�todos y constructor
 */
 
enum Vaso {
    // Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.
    KATXI(999), JARRA(500), TUBO(250), TERCIO(333), CA�A(200);
 
    private int cc; // Variable interna donde almacenaremos la capacidad
 
    // Nuestro constructor nos fuerza a pasar par�metros al definir un nuevo tipo
    Vaso(int cc) {
        this.cc = cc;
    }
 
    // Devuelve la capacidad del vaso
    public int getCentimetrosCubicos() {
        return cc;
    }
}