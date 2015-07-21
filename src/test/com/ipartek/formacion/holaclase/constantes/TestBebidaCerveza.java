package com.ipartek.formacion.holaclase.constantes;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestBebidaCerveza {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {

		Vaso katxi = Vaso.KATXI;
		BebidaCerveza beber = new BebidaCerveza(BebidaCerveza.MarcaCerveza.KELER, katxi);
		
		assertEquals("Sirviendo 1000cc. de cerveza KELER",beber.servir());
	}
}
