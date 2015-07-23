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

	static final String PATH_FILES 		= "files/";
	static final String PATH_FILES_NEW  = PATH_FILES + "new";
	
	static final String PATH_FICHERO1 	= PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 	= PATH_FILES + "fichero2.txt";
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
	
	
	/***********************************
	 * 				Leer			*
	 ***********************************/
	@Test
	public void testLeer() {
		
		try {
			
			FileReader inputStream = new FileReader(PATH_FICHERO1);
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1 );
			e.printStackTrace();
		}
		
	}
	/***********************************
	 * 		 Crear Directorio		*
	 ***********************************/
	@Test
	@Ignore
	public void testCrearDirectorio() {
		
		File dirNew = new File( PATH_FILES_NEW );
		
		//Comprobamos que no exista
		if ( dirNew.exists() ){
			fail("No deberia existir " + PATH_FILES_NEW );
		}else{
			//creacion directorio
			assertTrue( 
							"No se ha creado directorio " + PATH_FILES_NEW, 
							dirNew.mkdir() 
						);//con el mkdir me lo crea
		}
		
		//eliminar directorio
		assertTrue(
						"No se ha eliminado "+ PATH_FILES_NEW,
						dirNew.delete() 
		);
		
		
	}
	
	/***********************************
	 * 		Leer Primer caracter		*
	 ***********************************/
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
	
	/***********************************
	 * 		Copiar Fichero			*
	 ***********************************/
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
		assertTrue("No se ha podido eliminar " + PATH_FICHERO2, file2.delete() );
	}
	
	/***********************************
	 * 			 Crear Fichero		*
	 ***********************************/
	
	@Test
	
	public void testCrearFichero() {
				
		FileWriter outputStream = null;
		BufferedWriter bfw = null;
		
		try {
			
			outputStream = new FileWriter(PATH_FICHERO_GORDO);
			bfw = new BufferedWriter( outputStream );
			
			for ( int i=0; i < 10000; i++){
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
				//Orden inverso a la creacion para cerrar
				if ( bfw != null ){bfw.close();}
				if ( outputStream != null ){outputStream.close();}
				
				
			}catch(Exception e){
				fail("Cerrando los Streams");
			}	
			
		}//end finally
		
	
	/***********************************
	 * 			Comprobar el tamaño		*
	 ***********************************/
	
	File fGordo = new File(PATH_FICHERO_GORDO);
		try {
			//Si no existe falla
			if( !fGordo.exists() ){
				fail("No existe fichero " + PATH_FICHERO_GORDO );
			}
			//compruebo que el tamaño sea mayor
				assertTrue( "No tiene mas de 700Mb",fGordo.length() < ((700 * 1024)*1024) );	
				
			} catch (Exception e) {
			e.printStackTrace();
			fail("Comprobando tamano " + PATH_FICHERO_GORDO );
			
			}
		
	/***********************************
	 * 			delete fichero			*
	 ***********************************/
	if ( fGordo != null ){
		assertTrue("No se ha borrado " + PATH_FICHERO_GORDO ,
				fGordo.delete() 
				);
	}else{
		fail("No deberia ser null " + PATH_FICHERO_GORDO );
	}
	
	}
	/***********************************
	 * 		Listar Directorio		*
	 ***********************************/
	@Test
	public void testListarDirectorioRecursivamente(){
		
		final String PATH_APP_WORKSPACE = "C:\\desarrollo\\Workspace"; 
		File app = new File (PATH_APP_WORKSPACE);
		
		Utilidades.listarDirectorio(app, " ");
		/*
		if (app.exists() ){
			//por cada elemento que este en el array, dame un fichero(igual que el for)
			for ( File f : app.listFiles() ){
				
				System.out.println(f.getName() );
				if( f.isDirectory() ){
					
					for (File pHijo : f.listFiles() ){
						System.out.println("    "+ fHijo.getName() );
					}
				}
			}
			
		}else{
			fail("No existe "+ PATH_APP_WORKSPACE );
		}
		*/
	}
	
}