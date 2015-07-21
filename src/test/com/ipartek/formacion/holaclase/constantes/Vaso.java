package com.ipartek.formacion.holaclase.constantes;

public enum Vaso {
	KATXI(1000), JARRA(500), TUBO(250), TERCIO(333), CAÑA(200);

	private int cc; // Variable interna donde almacenaremos la capacidad

	// Nuestro constructor nos fuerza a pasar parámetros al definir un nuevo
	// tipo
	Vaso(int cc) {
		this.cc = cc;
	}

	// Devuelve la capacidad del vaso
	public int getCentimetrosCubicos() {
		return cc;
	}
}
