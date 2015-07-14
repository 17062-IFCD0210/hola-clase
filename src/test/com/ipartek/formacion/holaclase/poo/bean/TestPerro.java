package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class TestPerro {
	
	Perro perro1;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//Se ejecuta ANTES de comenzar cada la Clase de test
	} 

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		//Se ejecuta DESPUÉS de comenzar la Clase de test
	} 

	@Before
	public void setUp() throws Exception {
		//Se ejecuta ANTES de comenzar cada test
		perro1 = new Perro("Pintto");
	} 

	@After
	public void tearDown() throws Exception {
		//Se ejecuta DESPUÉS de comenzar cada test
		perro1 = null; //para que luego libere la memoria al Garbage Collector
	} 

	@Test //Anotación
	public  void testPerro() {
		//fail("Not yet implemented");
		assertEquals("Pintto", perro1.getNombre());
		assertEquals(4, perro1.getPatas());
		assertEquals("desconocida", perro1.getRaza());
		
		Persona amo = perro1.getAmo();
		if ( amo != null){
			assertEquals("Abandonado", amo.getNombre());
			assertEquals( Persona.EDAD_MINIMA , amo.getEdad());
		} else{
			fail("No tiene amo");
		}
		
		assertFalse( "Está vacunado" , perro1.isVacunado() );
		assertEquals(0,  perro1.getPeso());
		assertEquals(0,  perro1.getEdad());
	}
	
	@Test
	public void testLadrar() {
		//fail("Not yet implemented");
		assertTrue( "No ladra", "GUAU GUAU GUAU GUAU!!!".equals( perro1.ladrar() ) ); //true -> test pasa
	}

}
