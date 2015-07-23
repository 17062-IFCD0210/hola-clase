package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.junit.Ignore;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.bean.PersonaException;
import com.ipartek.formacion.holaclase.util.Utilidades;

public class TestFicheros {
	
	/** JAVA 6 **/
	public static final String PATH_FILES = "files\\";
	public static final String PATH_FILES_NEW = PATH_FILES + "new";
	
	public static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	public static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	public static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	
	
	/** JAVA 7 **/
	public static final String PATH = "C:\\desarrollo\\workspace\\hola-clase\\";
	public static final String PATH_NEW = PATH + "files\\new\\";	
	public static final String PATH_NEW_HOLA = PATH_NEW + "hola";	
	
	public static final String FILE_EXTENSION = ".txt";
	public static final String PARRAFO = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed augue lacus, ullamcorper sit amet lorem sit amet, placerat scelerisque ipsum. Vivamus faucibus, arcu sed pretium congue, augue risus tincidunt nulla, vitae maximus mauris justo sit amet nunc. Vivamus erat orci, auctor sit amet fringilla sit amet, auctor sed nulla. Ut a mauris quis justo hendrerit laoreet sit amet vitae metus. Donec elementum vehicula tortor, at elementum magna bibendum tempus. Etiam suscipit bibendum nisl pharetra facilisis. Phasellus vel magna interdum, tempor eros at, molestie risus. Nunc et consectetur dolor, non pharetra dui. Vestibulum libero elit, finibus quis porttitor eu, lobortis eu nulla. Aenean lorem est, elementum ut rhoncus in, elementum at dui. Donec porta aliquet semper.";
	
	
	/***************************************
	 **** 			TEST COPIAR			****
	 ***************************************/
	@Test
	public void testCopiar() {
			
		/**
		 * Copiar un fichero existente en otro que no existe.
		 */
		FileReader inputStream  = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader(PATH_FICHERO1);
			outputStream = new FileWriter(PATH_FICHERO2);
			
			int c;
			while ( (c = inputStream.read() ) != -1 ) {
				outputStream.write(c);
			}
			
		} catch (FileNotFoundException e) {
			fail("No se a podido abrir el fichero: " + PATH_FICHERO1);			
		} catch (IOException e) {
			fail("No se a podido escribir en el fichero: " + PATH_FICHERO2);
		} finally {
			try {
				if(inputStream != null) inputStream.close();
				if(outputStream != null) outputStream.close();
			} catch (IOException e) {
				fail("No se a podido copiar el fichero: " + PATH_FICHERO1 + " al fichero: " + PATH_FICHERO2);
			}			
		}	
		
		
		/**
		 * Comprobar caracter a caracter que dos ficheros son identicos
		 */
		FileReader inputStreamF1  = null;
		FileReader inputStreamF2  = null;
		
		try {
			
			inputStreamF1 = new FileReader(PATH_FICHERO1);
			inputStreamF2 = new FileReader(PATH_FICHERO2);
			
			int cF1, cF2;
			do{
				cF1 = inputStreamF1.read();
				cF2 = inputStreamF2.read();
				assertTrue(cF1 == cF2);
			} while (cF1 != -1 && cF2 != -1);
	
		} catch ( IOException e) {
			fail("fallo al comprobar");
		} finally {
			try {
				if(inputStreamF1 != null) inputStreamF1.close();
				if(inputStreamF2 != null) inputStreamF2.close();
			} catch (IOException e){
				fail("fallo el comprobar -- cerrar");
			}			
		}
		
		
		/**
		 * Borrado del fichero2
		 */
		/** JAVA 7 **/
		Path path = Paths.get(PATH + PATH_FICHERO2);
		try {
			Files.delete(path);
		} catch (IOException e) {
			fail("No se a podido borrar");
		}

	}
	
	
	/***************************************
	 **** 		TEST LEER 1 CHAR		****
	 ***************************************/
	@Test
	public void testLeerPrimerChar() {
		
		FileReader inputStream = null;
		
		try {
			
			inputStream = new FileReader(PATH_FICHERO1);			
			assertEquals('L', (char) inputStream.read()); //L	
			
			inputStream.skip(6);	//Saltamos seis caracteres ("orem i")
			
			assertEquals('p', (char) inputStream.read()); //p			
			
		} catch (FileNotFoundException e) {
			fail("No se a podido abrir el fichero: " + PATH_FICHERO1);
		} catch (IOException e) {
			fail("No se a podido leer el fichero: " + PATH_FICHERO1);
		} finally {
			try {
				inputStream.close();
			} catch (IOException e) {
				fail("No se a podido cerrar el fichero: " + PATH_FICHERO1);
			}
		}		
	}
	
	
	/***************************************
	 **** 		TEST CREAR FICHERO		****
	 ***************************************/
	@Test(timeout=500*23)		//23*500ms = 11,5s
	@Ignore
	public void testCrearFichero() {		
		
		/**
		 * Crear un fichero que no existe y llenarlo con mucho texto
		 */
		FileWriter outputStream = null;
		BufferedWriter bfw = null;		
		
		try {		
			
			outputStream = new FileWriter(PATH_FICHERO_GORDO);			
			bfw = new BufferedWriter(outputStream);	
			
			for(int i=0; i < 1000000; i++){
				bfw.write(PARRAFO);
			}	
			
		} catch (FileNotFoundException e) {
			fail("No se a podido abrir el fichero: " + PATH_FICHERO1);			
		} catch (IOException e) {
			fail("No se a podido escribir en el fichero: " + PATH_FICHERO2);
		} finally {			
			try {				
				if(bfw != null)	bfw.close();
				if(outputStream != null) outputStream.close();				
			} catch (IOException e) {
				fail("No se a podido copiar el fichero: " + PATH_FICHERO1 + " al fichero: " + PATH_FICHERO2);
			}			
		}	
		
		/**
		 * Comprobar el tamaño de fichero_gordo >700MB
		 */
		File fGordo = null;
		
		try {
			
			/** JAVA 7 **/ 
			Path path = Paths.get(PATH + PATH_FICHERO_GORDO);
			assertTrue("Es menor de 700MB",Files.size(path) >  700*1024*1024);
			
			/** JAVA 6 **/
			fGordo = new File(PATH_FICHERO_GORDO);
			if(!fGordo.exists()){
				fail("fichero no existe");
			}
			assertTrue("Es menor de 700MB",fGordo.length() > 700*1024*1024);

		} catch (IOException e) {
			fail("error en el tamaño");
		}
		
		/**
		 * Eliminar fichero_gordo.txt
		 */
		/** JAVA 6 **/
		if(fGordo != null){
			assertTrue("No se ha borrado", fGordo.delete());
		} else {
			fail("No deberia de ser null");
		}
		
	}
	
	
	/***************************************
	 **** 	  TEST CREAR DIRECTORIO		****
	 **** 	 		 JAVA 6				****
	 ***************************************/
	@Test
	public void testCrearDirectorioJ6() {
		/**
		 * Crear directorio "new" si no existe
 		 */
		File dirNew = new File(PATH_FILES_NEW);
		if(dirNew.exists()){
			fail("No deberia existir" + PATH_FILES_NEW);
		} else {
			assertTrue("No se ha creado directorio", dirNew.mkdir());
		}
		
		/**
		 * Crear los ficheros holaN.txt
		 */
		FileWriter outputStream = null;
		for (int i=1; i<101 ;i++){
			try {
				outputStream = new FileWriter(PATH_NEW_HOLA + i + FILE_EXTENSION);
			} catch (IOException e) {
				fail("No se a podido crear fichero " + PATH_NEW_HOLA + i);
			} finally {
				if(outputStream != null)
					try {
						outputStream.close();
					} catch (IOException e) {
						fail("Error al cerrar fichero " + PATH_NEW_HOLA + i);
					}
			}
		}
		
		/**
		 * Recorrer directorio new y testear que existen uno a uno todos los ficheros
		 */			
		if(dirNew.exists()){
			File[] f = dirNew.listFiles();
			assertTrue(100 == f.length);
			
			for (int i=0 ; i<100 ; i++){
				
				assertTrue(f[i].exists());
				
			}
		}
		
		/**
		 * Borrar directorio new y su contenido
		 */
		//ficheros
		File fhola = null;
		for(int i=1; i < 101 ; i++){
			fhola = new File(PATH_NEW_HOLA + i + FILE_EXTENSION);
			assertTrue("No se ha borrado", fhola.delete());
		}
		//directorio
		assertTrue("No se ha eliminado directorio", dirNew.delete());
	}
	
		
	/***************************************
	 **** 	  TEST CREAR DIRECTORIO		****
	 **** 	 		 JAVA 7				****
	 ***************************************/
	@Test
	public void testCrearDirectorioJ7() {

		/**
		 * Crear directorio "new" si no existe
 		 */
		Path path = Paths.get(PATH_NEW);
		if (Files.notExists(path)){
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				fail("Error al crear directorio");
			}
		}
		
		/**
		 * Crear los ficheros holaN.txt
		 */
		for(int i=1; i<101 ; i++){
			path = Paths.get(PATH_NEW_HOLA + i + FILE_EXTENSION);
			try {
				Files.createFile(path);
			} catch (IOException e) {
				fail("Error al crear los ficheros holaNº.txt");
			}
		}
		
		/*
		 * TODO  recorrer carpeta new y testear que existen uno a uno todos los ficheros
		 * Files.walkFileTree(path, null);
		 */		
		
		/**
		 * Borrar directorio new y su contenido
		 */
		for(int i=1; i<101 ; i++){
			path = Paths.get(PATH_NEW_HOLA + i + FILE_EXTENSION);
			try {
				Files.delete(path);
			} catch (IOException e) {
				fail("Error al borrar los ficheros holaNº.txt");
			}
		}
		path = Paths.get(PATH_NEW);
		try {
			Files.delete(path);
		} catch (IOException e) {
			fail("Error al borrar el directorio new");
		}
		
	}
	

	/***************************************
	 **** 	 TEST LISTAR DIRECTORIO		****
	 **** 	 	  NO RECURSIVO			****
	 **** 	 		 JAVA 6				****
	 ***************************************/
	@Test
	@Ignore
	public void testListarDirectorioNORecursivo(){
		final String PATH_APP_HTML = "C:\\desarrollo\\HTML";
		
		File app = new File(PATH_APP_HTML);
		if (app.exists()){
			
			for ( File f : app.listFiles() ){				
				System.out.println(f.getName());				
				if(f.isDirectory() ){					
					for (File fHijo : f.listFiles() ){
						System.out.println("    " + fHijo.getName());
						if(fHijo.isDirectory() ){					
							for (File fNieto : fHijo.listFiles() ){
								System.out.println("        " + fNieto.getName());
							}					
						}	
					}					
				}				
			}
			
		} else {
			fail("No existe " + PATH_APP_HTML);
		}
	}
	
	
	/***************************************
	 **** 	 TEST LISTAR DIRECTORIO		****
	 **** 	 	 RECURSIVAMENTE			****
	 **** 	 		 JAVA 6				****
	 ***************************************/
	@Test
	@Ignore
	public void testListarDirectorioRecursivamente(){
		final String PATH_APP_HTML = "C:\\desarrollo\\HTML";
		
		File app = new File(PATH_APP_HTML);
		if (app.exists()){
			
			Utilidades.listarDirectorio(app, "->");
			
		} else {
			fail("No existe " + PATH_APP_HTML);
		}
	}
	
	
	@Test
	public void testObjectFile() {		//162 object stream
		
		Persona personOut = null;
		Persona personIn = null;
		
		Persona personOut2 = null;
		Persona personIn2 = null;
		
		
		/**
		 * Object to file (Serializar)
		 */
		FileOutputStream outputStream = null;
		ObjectOutputStream out =  null;
		try {
			personOut = new Persona("ieltxu", 27);
			personOut2 = new Persona("pepe", 50);
			
			outputStream = new FileOutputStream(PATH_FILES + "persona.dat");
			out = new ObjectOutputStream(outputStream);
			
			out.writeObject(personOut);	
			out.writeObject(personOut2);
			
			
		} catch (PersonaException e) {
			fail("No se a podido crear Objeto Persona");
		} catch (FileNotFoundException e) {
			fail("Fichero persona.dat no encontrado");
		} catch (IOException e) {
			fail("Error al abrir fichero");
		} finally {			
			try {
				if (out != null ) out.close();
				if (outputStream != null ) outputStream.close();
			} catch (IOException e) {
				fail("Fallo al cerrar fichero");
			}			
		}
		
		/**
		 * File to Object (Deserializar)
		 */
		FileInputStream inputStream = null;
		ObjectInputStream in =  null;		
		try {
			inputStream = new FileInputStream(PATH_FILES + "persona.dat");
			in = new ObjectInputStream(inputStream);
			
			personIn = (Persona) in.readObject();
			personIn2 = (Persona) in.readObject();
						
			assertEquals("ieltxu", personIn.getNombre());
			assertEquals(27, personIn.getEdad());
			
			assertEquals("pepe", personIn2.getNombre());
			assertEquals(50, personIn2.getEdad());
			
		} catch (FileNotFoundException e) {
			fail("Fichero persona.dat no encontrado");
		} catch (IOException e) {
			fail("Error al abrir fichero");
		} catch (ClassNotFoundException e) {
			fail("Objeto Persona no encontrado en el fichero");
		} finally {
			try {
				if (in != null ) in.close();
				if (inputStream != null ) inputStream.close();
			} catch (IOException e) {
				fail("Fallo al cerrar fichero");
			}
		}
		

	}

	
}
