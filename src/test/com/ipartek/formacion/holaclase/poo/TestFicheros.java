package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
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
	static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	
	//1º parrafo de LoremIpsum
	static final String PARRAFO = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod ligula in massa semper vestibulum. Aliquam sed ex risus. Quisque lorem quam, fringilla id neque vitae, facilisis tempor augue. Quisque ullamcorper bibendum erat, ac rutrum tortor posuere vitae. Quisque convallis pretium lacinia. Morbi porttitor leo vitae suscipit luctus. Aliquam sed feugiat dui, at dictum ex. Maecenas ac posuere urna. Mauris at aliquam velit. Curabitur dapibus fermentum lorem. Morbi molestie urna nec quam porta, ut maximus neque tincidunt. Maecenas dictum a justo nec tincidunt. Aliquam condimentum, tellus ac mollis hendrerit, dui orci lacinia nisl, tempor aliquet lorem nibh in nunc. Mauris nec leo mauris. Ut dictum ipsum eros, ut commodo ante ornare eu.";
	
	
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
	public void testLeerPrimerChar() {
		try {
			FileReader inputStream = new FileReader(PATH_FICHERO1);
			
			//leemos primer caracter
			int c =	inputStream.read();
			assertEquals('L', (char)c );		
			
			//saltamos 6 caracteres y volvemos a leer			
			inputStream.skip(6);
			c = inputStream.read();
			assertEquals('p', (char)c );		
				
			
		} catch (Exception e) {
			fail("Excepcion leyendo el primer caracter" );
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
	
	
	
	@Test(timeout=1000*4)
	public void testCrearFichero() {
				
		FileWriter outputStream = null;
		BufferedWriter bfw = null;
		
		try {
			
			outputStream = new FileWriter(PATH_FICHERO_GORDO);
			bfw = new BufferedWriter( outputStream );
			
			for ( int i=0; i < 1000000; i++){
				bfw.write( PARRAFO );
			}	
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			fail("No se ha podido copiar el fichero " + PATH_FICHERO1 + " al fichero " + PATH_FICHERO2 );
			
		} catch (IOException e) {			
			e.printStackTrace();
			fail("No se ha podido escribir en el fichero " + PATH_FICHERO2 );
		}finally{
			
			try{
				
				if ( bfw != null ){bfw.close();}
				if ( outputStream != null ){outputStream.close();}
				
				
			}catch(Exception e){
				fail("Cerrando los Streams");
			}	
			
		}
		
	}
	
	

}
