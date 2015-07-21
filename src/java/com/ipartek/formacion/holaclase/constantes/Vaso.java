package com.ipartek.formacion.holaclase.constantes;

public enum Vaso {
	 // Tipos de vaso disponibles. Pasan al constructor su capacidad en cc.
	KATXI(1000), JARRA(500), TUBO(250), TERCIO(333), CAÑA(200);
	
	// Nuestro constructor nos fuerza a pasar parámetros al definir un nuevo tipo
	private int cc; 
	Vaso(int cc) {
        this.cc = cc;
    }
	// Devuelve la capacidad del vaso
	public int getCentimetrosCubicos() {
        return cc;
    }
}