package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.constantes.Vaso;

public class BebidaCerveza {
	enum MarcaCerveza {
		AMBAR, GUINNESS, HEINEKEN, KELER
	} // Tipos enumerados sencillos. Solo tenemos estas marcas

	private Vaso vaso;
	private MarcaCerveza marca;

	BebidaCerveza(MarcaCerveza marca, Vaso vaso) {
		this.marca = marca;
		this.vaso = vaso;
	}

	public String servir() {
		return "Sirviendo " + vaso.getCentimetrosCubicos() + "cc. de cerveza "
				+ marca;
	}
}