package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ipartek.formacion.holaclase.constantes.Vaso;
import com.ipartek.formacion.holaclase.poo.bean.BebidaCerveza.MarcaCerveza;

public class TestCerveza {

	@Test
	public void testServir() {
		Vaso katxi = Vaso.KATXI;
		MarcaCerveza keler = BebidaCerveza.MarcaCerveza.KELER;
		BebidaCerveza beb = new BebidaCerveza(keler, katxi);

		assertEquals("Sirviendo 1000cc. de cerveza KELER", beb.servir());

	}
}