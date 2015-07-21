package com.ipartek.formacion.holaclase.constantes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBebidasCerveza {

	@Test
	public void test() {
		
		Vaso katxi = Vaso.KATXI;
		BebidaCerveza.MarcaCerveza marca = BebidaCerveza.MarcaCerveza.KELER;
		
		BebidaCerveza katxiKeler = new BebidaCerveza(marca, katxi);
		
		assertEquals("Sirviendo 999cc. de cerveza KELER", katxiKeler.servir());
	}

}
