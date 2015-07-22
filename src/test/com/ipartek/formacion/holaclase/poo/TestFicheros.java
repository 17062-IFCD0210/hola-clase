package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestFicheros {

	static final String PATH_FILES = "files/";
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	
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
	public void testLeer() {
		
		try {
			FileReader inputStream = new FileReader(PATH_FICHERO1);
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1 );
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void testCopiar() {
		
		FileReader inputStream  = null;
		FileWriter outputStream = null;
		
		try {
			inputStream  = new FileReader(PATH_FICHERO1);
			outputStream = new FileWriter(PATH_FICHERO2);
			
			int c;
			while ( (c=inputStream.read()) != -1 ){
				outputStream.write(c);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			fail("No se ha podido copiar el fichero " + PATH_FICHERO1 + " al fichero " + PATH_FICHERO2 );
			
		} catch (IOException e) {			
			e.printStackTrace();
			fail("No se ha podido escribir en el fichero " + PATH_FICHERO2 );
		}finally{
			
			try{
				if ( inputStream != null ) {inputStream.close();}
				if ( outputStream != null ){outputStream.close();}
				
			}catch(Exception e){
				fail("Cerrando los Streams");
			}	
			
		}
		
	}

}
