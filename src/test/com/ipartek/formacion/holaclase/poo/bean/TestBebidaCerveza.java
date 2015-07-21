package com.ipartek.formacion.holaclase.poo.bean;

import org.junit.Test;
import static org.junit.Assert.*;

import com.ipartek.formacion.holaclase.constantes.Vaso;

public class TestBebidaCerveza {

	@Test
	public void testServir() {
        BebidaCerveza birra = new BebidaCerveza(BebidaCerveza.MarcaCerveza.KELER, Vaso.KATXI);
        
        assertEquals("Sirviendo 1000cc. de cerveza KELER", birra.servir());
	}

}
