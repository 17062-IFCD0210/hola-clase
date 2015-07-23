package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestLara {
	
	final String sFichero		= "files/fichero1.txt";
	
	
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
	public void testTamano() {
		File fichero 	= new File(sFichero);
		try{
			
			if ( !fichero.exists() ){
				System.out.println("El fichero " + sFichero + " no existe");;
				assertTrue("No tiene mas de 500Mb", sFichero.length() < ((500*1024)*1024) );
			}
		}catch (Exception e){
			e.printStackTrace();
			fail("Comprobando tamaño" );
		}
		
	}
		
	}
