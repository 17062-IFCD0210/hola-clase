package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ipartek.formacion.holaclase.util.Utilidades;

public class testFicheros {

	static final String PATH_FILES = "files/";
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	static final String PATH_FILES_NEW = PATH_FILES + "new";
	static final String PATH_FICHERO = PATH_FILES + "new/fichero";
	static final String PARRAFO = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque molestie vehicula laoreet. Sed blandit justo vel tempor faucibus. Fusce pretium scelerisque nisl, placerat ornare massa consectetur a. Mauris vestibulum fermentum mattis. Mauris faucibus porta nunc, non blandit velit pellentesque sed. Duis sagittis pharetra felis vel feugiat. In nunc lectus, ultrices at nisi quis, scelerisque commodo nibh. Vestibulum volutpat velit lectus, et pellentesque purus lobortis elementum.";
	
	
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
			fail("No se ha podido abrir el fichero PATH_FICHERO1");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testCopiar() {

		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			
			inputStream = new FileReader(PATH_FICHERO1);
			outputStream = new FileWriter(PATH_FICHERO2);
			
			int c;
			while ( (c = inputStream.read()) != -1 ){
				outputStream.write(c);
			}
			
			
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido copiar el fichero PATH_FICHERO1" + " al " + PATH_FICHERO2);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en el fichero PATH_FICHERO2");
			e.printStackTrace();
		}
		finally{
			try{
				if (inputStream !=null){ inputStream.close();}
				if (outputStream !=null){ outputStream.close();}
			}catch(Exception e){
				fail("Cerrando los Streams");
			}
		}
		
		//Eliminar fichero creado
		File file2 = new File(PATH_FICHERO2);
		assertTrue("No se ha podido eliminar " + PATH_FICHERO2, file2.delete());
	}
	
	@Test
	public void testLeerPrimerChar() {
		
		try {
			
			FileReader inputStream = new FileReader(PATH_FICHERO1);
			
			//leemos primer caracter
			int c = inputStream.read();
			assertEquals('L', (char)c);
			
			//Saltamos 6 caracteres y volvemos a leer
			inputStream.skip(6);
			c = inputStream.read();
			assertEquals('p', (char)c);
			//System.out.println((char)inputStream.read()); //Lo mismo
						
		} catch (FileNotFoundException e) {
			fail("No se ha podido abrir el fichero PATH_FICHERO1");
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido leer el fichero PATH_FICHERO1");
			e.printStackTrace();
		}
	}

	@Test(timeout=1000*4) //Si tarda más de 3 segundos que pare
	@Ignore //No ejecuta el test
	public void testCrearFichero(){

		FileWriter outputStream = null;
		BufferedWriter bfw = null;
		
		try {
			
			outputStream = new FileWriter(PATH_FICHERO_GORDO);
			bfw = new BufferedWriter(outputStream); // Con el Buffer es más rápido
			
			for (int i=0; i<1000000; i++){
				bfw.write(PARRAFO);
			}
			
		} catch (IOException e) {
			fail("No se ha podido escribir en el fichero " + PATH_FICHERO_GORDO);
			e.printStackTrace();
		}  finally {
			try{
					if (bfw != null){bfw.close();}
					if (outputStream !=null){ outputStream.close();}
				} catch (IOException e) {
					fail("Cerrando los Streams");
					e.printStackTrace();
			}
		}//end finally
		
		/*********************
		 *   Crear fichero   *
		 ********************/
		File fGordo=null;
		try{
			fGordo = new File(PATH_FICHERO_GORDO);
			if ( !fGordo.exists() ){
				fail("No existe fichero" + PATH_FICHERO_GORDO);
			}
			assertTrue("No tiene más de 700 MB", fGordo.length() > 700*1024);
			
		}catch (Exception e){
			e.printStackTrace();
			fail("Comprobando tamaño " + PATH_FICHERO_GORDO);
		}
		
		/**********************
		 *   Borrar fichero   *
		 *********************/
		if ( fGordo != null ){
			assertTrue("No se ha borrado el fichero Gordo", fGordo.delete());
		}else{
			
		}
	}
	
	/**
	 * Creamos el directorio new en /files y 100 ficheros
	 */
	@Test
	public void testCrearDirectorio() {
		
		File dirNew = new File(PATH_FILES_NEW + "/");
		
		//Comprobar que no exista
    		if (dirNew.exists()){
			//Eliminar directorio
			try{
				for ( File fich : dirNew.listFiles() ){
					assertTrue("No se ha eliminado directorio " + PATH_FILES_NEW, dirNew.delete());
				}
			
				//fail("No debería existir " + PATH_FILES_NEW);
			}catch(Exception e){
				fail("No se ha podido borrar el directorio " + PATH_FILES_NEW);
				e.printStackTrace();
			}
		}else{
			//Creación directorio
			assertTrue("No se ha creado directorio " + PATH_FILES_NEW, dirNew.mkdir());
			}
		
		Crear100Ficheros(1); //Recorremos de forma recursiva
		
		//Los borramos de nuevo
		try{
			for ( File fich : dirNew.listFiles() ){
				fich.delete();
			}
			assertTrue("No se ha eliminado directorio " + PATH_FILES_NEW, dirNew.delete());
			
			//fail("No debería existir " + PATH_FILES_NEW);
		}catch(Exception e){
			fail("No se ha podido borrar el directorio " + PATH_FILES_NEW);
			e.printStackTrace();
		}
		
	}
	
	
	/**
	 * Función recursiva que crea 100 ficheros fichero1.txt, fichero2.txt, ... hasta 100
	 * @param contador para renombrar cada fichero creado
	 */
	public static void Crear100Ficheros(int contador) {
		
		String nombreFichero = PATH_FICHERO + contador + ".txt";
		File f = new File(nombreFichero);
		
		//Comprobar que no exista
		if (f.exists()){
			fail("No debería existir " + nombreFichero);
		}else{
			//Creación fichero
			if (contador < 101){
				try {
					
					assertTrue("No se ha creado directorio " + nombreFichero, f.createNewFile());
					if ( f.exists() ){
					}
				} catch (IOException e) {
					fail("No se ha podido crear el fichero");
					e.printStackTrace();
				}
				Crear100Ficheros(++contador);
			}
			/*for (int i=1; i<101; i++){
				try {
					f.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}*/
		}
	}

	@Test
	@Ignore //No ejecuta el test
	public void testListarDirectorioRecursivamente() {
		
		final String PATH_APP_HTML = "C:\\Home\\Proyectos\\eclipse\\Servers";
		File app = new File(PATH_APP_HTML);
		
		Utilidades.listarDirectorio(app, " "); //De forma recursiva
		
		/*//Comprobar que no exista
		if (app.exists()){
			
			for ( File f : app.listFiles() ){ //for each
				System.out.println( f.getName() );
				
				if ( f.isDirectory() ){
					for ( File pHijo : f.listFiles() ){
						System.out.println("    " + pHijo.getName());
					}
				}
			}
		}else{
			fail("No debería existir " + PATH_FILES_NEW);
		}*/

	}
	
}
