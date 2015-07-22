package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testFicheros {

	static final String PATH_FILES = "files/";
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	static final String PATH_DIRECTORIO_NEW = "\\files\\new\\"; //Necesario escapar \ por problemas de compilación
	static final String PATH_FICHERO = PATH_FILES + "/new/fichero";
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

	@Test(timeout=1000*3) //Si tarda más de 3 segundos que pare
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
		}
	}
	
	@Test
	public void testEscribirJava7() {
		//Con la clase Path de Java7
		Path path = null;
		Files fichero = null;
		
		try {
			
			path = Paths.get(PATH_FICHERO_GORDO);			
			if (fichero.exists(path)){
				if (fichero.size(path) > 700){
					assertTrue("El tamaño es mayor de 700MB", fichero.size(path) > 700);
					
					if(!fichero.isDirectory(path)){
						fichero.delete(path);
						assertTrue("Ya se ha borrado el fichero gordo", !fichero.exists(path));
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido borrar el fichero PATH_FICHERO_GORDO");
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido comprobar el tamaño");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testEscribirJava6() {
		//Sin la clase Path de Java6
		Path path = null;
		Files fichero = null;
		
		try {
			
			path = Paths.get(PATH_FICHERO_GORDO);			
			if (fichero.exists(path)){
				if (fichero.size(path) > 700){
					assertTrue("El tamaño es mayor de 700MB", fichero.size(path) > 700);
					
					if(!fichero.isDirectory(path)){
						fichero.delete(path);
						assertTrue("Ya se ha borrado el fichero gordo", !fichero.exists(path));
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido borrar el fichero PATH_FICHERO_GORDO");
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido comprobar el tamaño");
			e.printStackTrace();
		}
	}
	
	@Test
	public void testComprobar() {
		
		Path path = null; //Clase
		Files fichero = null; //Clase
		FileWriter outputStream = null; //Objeto
		
		try {
			
			path = Paths.get(PATH_DIRECTORIO_NEW);			
			if (!fichero.exists(path)){
				outputStream = new FileWriter(PATH_DIRECTORIO_NEW); // la contrabarra \ está escapada (\\) para evitar problemas de compilación
				outputStream = new FileWriter(PATH_FICHERO + 1 + ".txt");	
				
			}
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido borrar el fichero PATH_FICHERO_GORDO");
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido comprobar el tamaño");
			e.printStackTrace();
		}
	}
}
