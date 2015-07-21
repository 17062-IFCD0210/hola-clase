package com.ipartek.formacion.holaclase.poo.bean;

import com.ipartek.formacion.holaclase.constantes.Vaso;

public class BebidaCerveza {
	enum MarcaCerveza {KELER, AMBAR, GUINNESS, HEINEKEN }

	private Vaso vaso;
	private MarcaCerveza marca;
	
	//Getters and Setters	
	public Vaso getVaso() {
		return vaso;
	}
	
	public void setVaso(Vaso vaso) {
		this.vaso = vaso;
	}
	
	public MarcaCerveza getMarca() {
		return marca;
	}
	
	public void setMarca(MarcaCerveza marca) {
		this.marca = marca;
	}
	
	
	BebidaCerveza(MarcaCerveza marca, Vaso vaso) {
	    this.marca = marca;
	    this.vaso = vaso;
	}
	
	public String servir() {
		return ("Sirviendo " + vaso.getCentimetrosCubicos() + "cc. de cerveza " + marca);
		}
}