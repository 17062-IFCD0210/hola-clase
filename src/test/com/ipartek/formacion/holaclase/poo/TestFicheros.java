package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ipartek.formacion.holaclase.util.Utilidades;

public class TestFicheros {

	static final String PATH_FILES = "files/";
	static final String PATH_FILES_NEW = PATH_FILES + "new";
	
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	
	//1� parrafo de LoremIpsum
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
	public void testCrearDirectorio() {
		
		
		
		File dirNew = new File( PATH_FILES_NEW );
		
		//comprobar que no exista
		if ( dirNew.exists() ){
			fail("No deberi existir " + PATH_FILES_NEW );
		}else{
			//creacion directorio
			assertTrue(
					"No se ha creado directorio " + PATH_FILES_NEW,  
					dirNew.mkdir() 
				);
		}
		
		
		//eliminar directorio
		assertTrue(
				"No se ha eliminado directorio " + PATH_FILES_NEW,  
				dirNew.delete()
		);		
		
		
		
		
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
		
		//eliminar fichero creado
		File file2 = new File (PATH_FICHERO2);
		assertTrue("No se ha podido eliminar " + PATH_FICHERO2, file2.delete()  );
		
		
		
	}
	
	
	
	@Test /*(timeout=1000*4)*/
	@Ignore
	public void testCrearFichero() {
		
		
		/******************************** 
		 *         crear fichero        *
		 ********************************/
		
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
			
		}//end finally
		
		
		
	/******************************** 
	 *         comprobar tama�o     *
	 ********************************/
	File fGordo = null;
	
	try{	
		fGordo = new File(PATH_FICHERO_GORDO);
		if ( !fGordo.exists() ){
			fail("No existe fichero " + PATH_FICHERO_GORDO );
		}
		assertTrue ("No tiene mas de 700Mb", fGordo.length() > 700 * 1024 * 1024 );
		
		
	}catch(Exception e){
		e.printStackTrace();
		fail("Comprobando tamano " + PATH_FICHERO_GORDO );
	}	
		
		
	/******************************** 
	 *         delete fichero        *
	 ********************************/
		
	if ( fGordo != null ){
		
		assertTrue("No se ha borrado " + PATH_FICHERO_GORDO ,
				   fGordo.delete()
				  );
		
	}else{
		fail("No deberia ser null " + PATH_FICHERO_GORDO );
	}
		
		
	}
	
	@Test 
	@Ignore
	public void testListarDirectorioNORecursivamente(){

		
		final String PATH_APP_HTML = "C:\\desarrollo\\html";
		File app = new File (PATH_APP_HTML);
		
		Utilidades.listarDirectorio(app, " ");
		
		/*
		if ( app.exists() ){
			
			for ( File f : app.listFiles()){
				
				System.out.println( f.getName() );
				
				if ( f.isDirectory() ){
					
					for (File pHijo : f.listFiles() ){
						System.out.println( "    " + pHijo.getName() );
					}
					
				}
				
			}
			
		}else{
			fail("No existe " + PATH_APP_HTML );
		}
		*/
		
	}

	
	
}
