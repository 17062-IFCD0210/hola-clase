package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ipartek.formacion.holaclase.constantes.Vaso;
import com.ipartek.formacion.holaclase.poo.bean.BebidaCerveza.MarcaCerveza;

public class TestBebidaCerveza {

	@Test
	public void testServir() {
		
		Vaso cantidad 					 = Vaso.KATXI;
		MarcaCerveza marca = MarcaCerveza.KELER;
		
        BebidaCerveza katxikeler = new BebidaCerveza(marca, cantidad);
        
        assertEquals("Sirviendo 1000cc. de cerveza KELER", katxikeler.servir());
	}

}
