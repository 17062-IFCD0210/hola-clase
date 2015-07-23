package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

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
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.PersonaException;
import com.ipartek.formacion.holaclase.util.Utilidades;

public class TestFicheros {
	
	static final String PATH_FILES = "files/";
	static final String PATH_FILES_NEW = PATH_FILES + "new";
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	//1� parrafo de LoremIpsum
	static final String PARRAFO="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec tellus magna, gravida id nisi faucibus, eleifend ultricies augue. Phasellus sit amet vestibulum felis. Nullam vitae suscipit erat. Proin et nunc et nunc ullamcorper venenatis. Etiam efficitur risus quis neque dictum, a venenatis diam tempor. In hac habitasse platea dictumst. Quisque feugiat semper faucibus. Nam gravida posuere neque in dignissim. Aenean lectus nisi, maximus eu hendrerit sed, tristique a enim. Ut sapien massa, congue vitae nisl eu, dapibus fermentum eros. Sed tincidunt ex quis maximus luctus. Mauris rhoncus, odio vel sagittis condimentum, diam neque posuere purus, at interdum urna magna non mi. Mauris vel urna vel diam posuere ornare nec quis sem. Fusce vestibulum venenatis blandit.";
	
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
			fail("No se ha podido abrir el fichero "+PATH_FICHERO1);
			e.printStackTrace();
		}
	}
		
	@Test
	public void testCopiar() {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		FileReader ficheroCopia = null;
		
		try {
			inputStream = new FileReader(PATH_FICHERO1);			
			outputStream = new FileWriter(PATH_FICHERO2);
			
			int c;
			while((c = inputStream.read())!=-1){
				outputStream.write(c);
			}
			
			
			//Comprobar caracter a caracter que fichero1 = fichero2
			inputStream.skip(0);
			ficheroCopia = new FileReader(PATH_FICHERO2);
			boolean iguales = true;
			int cCopia;
			while(((c = inputStream.read())!=-1)&&((cCopia = ficheroCopia.read())!=-1)&&(iguales)){
				if (c!=cCopia)iguales=false;
			}
			assertTrue("Son diferentes",iguales);
					
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido copiar el fichero "+PATH_FICHERO1+" al fichero "+PATH_FICHERO2);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en el fichero "+PATH_FICHERO2);
			e.printStackTrace();
		}finally{
			try{
				if (inputStream !=null){inputStream.close();}
				if (outputStream !=null){outputStream.close();}
				if (ficheroCopia !=null){ficheroCopia.close();}
			}catch(Exception e){
				fail("Cerrando los streams");
			}
			
			
		}
		
		//eliminar fichero creado
		assertTrue("No se ha podido eliminar "+PATH_FICHERO2,new File(PATH_FICHERO2).delete());
	}
	
	@Test
	public void testLeerPrimerChar() {
		FileReader inputStream = null;
		FileWriter outputStream = null;
		
		try {
			inputStream = new FileReader(PATH_FICHERO1);			
			int c;
			c = inputStream.read();
			
			assertTrue(Character.valueOf('L')==c);
			assertTrue((char)c == 'L');
		
			//saltamos 6 carateres y volvemos a leer
			inputStream.skip(6);
			c = inputStream.read();
			
			/* otra forma seria avanzar 1 a 1 los 6 caracteres
			int i=0;
			while(((c = inputStream.read())!=-1) && i<6){i++;}
			*/
			
			assertTrue((char)c == 'p');

			
		} catch (FileNotFoundException e) {
			fail("Excepcion leyendo el primer caracter");
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en el fichero "+PATH_FICHERO2);
			e.printStackTrace();
		}finally{
			try{
				if (inputStream !=null){inputStream.close();}
				if (outputStream !=null){outputStream.close();}
			}catch(Exception e){
				fail("Cerrando los streams");
			}

		}
	}
	
	@Test//(timeout=1000*6) //damos 6 segundos de tiempo
	@Ignore //para que no se ejecute este test
	public void testCrearFichero() {
		
		FileWriter outputStream = null;
		BufferedWriter bfw = null;  //declaramos el buffer
		
		try {	
			//metemos 1000000 de parrafos en el fichero, tarda 18 segundos en hacerlo
			outputStream = new FileWriter(PATH_FICHERO_GORDO);
			
			bfw = new BufferedWriter(outputStream);
			
			for(int i=0;i<1000000;i++){
				//outputStream.write(PARRAFO);
				bfw.write(PARRAFO);
			}
			
	
			
		} catch (FileNotFoundException e) {
			fail("No se ha podido copiar el fichero "+PATH_FICHERO1+" al fichero "+PATH_FICHERO2);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en el fichero "+PATH_FICHERO_GORDO);
			e.printStackTrace();
		}finally{
			try{
				if (bfw != null) {bfw.close();}
				if (outputStream !=null){outputStream.close();}
			}catch(Exception e){
				fail("Cerrando los streams");
			}
			
	
		}// end finally
		
		//Comprobar que size>700 MBytes
		File fGordo=null;
		long tam = 0;
		try {
			fGordo = new File(PATH_FICHERO_GORDO);
			tam = fGordo.length();
			if(!fGordo.exists()){
				fail("No existe fichero "+PATH_FICHERO_GORDO);
			}
			assertTrue("El tama�o es menor de 700 Mbytes",700*1024*1024 < tam);	
		} catch (Exception e) {
			e.printStackTrace();
			fail("Comprobando tama�o "+PATH_FICHERO_GORDO);
		}
		
		//System.out.println(tam/1024);
		
		//Borrar FICHERO_GORDO
		
		if(fGordo!=null){
			assertTrue("No se ha borrado "+PATH_FICHERO_GORDO, fGordo.delete());
		}else{
			fail("No deberia ser null "+PATH_FICHERO_GORDO);
		}

		try {
			Files.delete(Paths.get(PATH_FICHERO_GORDO));
		} catch (IOException e) {
			fail("Error al borrar el fichero "+PATH_FICHERO_GORDO);
			e.printStackTrace();
		}			
	}
	
	@Test
	public void testCrearDirectorioJavi() {	
//		Path path = null;
		String ruta = "files/new";
		String nombre = "hola";
		String extension = ".txt";
		FileWriter fichero = null;

		File directorio = new File(ruta);
		directorio.mkdir();
		
		try {
			
			//Crear muchos ficheros hola
			for (int i=0;i<10;i++){
				//crea el fichero
				fichero = new FileWriter(ruta+"/"+nombre+i+extension);
				//escribe en el fichero
				fichero.write("Contenido del fichero " + nombre+i+extension);
				fichero.close();
			}
			
			//testear que existen los ficheros creados
			File[] lista = directorio.listFiles();
			for (int i = 0; i < lista.length; i++){
				assertEquals("No encuentro el archivo "+ nombre+i+extension,lista[i].getName(),nombre+i+extension);
			}
			
		} catch (IOException e) {
			fail("Error al escribir en el fichero");
			e.printStackTrace();
		} finally{
			// eliminar la carpeta new y todos los archivos que contenga

			File[] lista = directorio.listFiles();
			for (int i = 0; i < lista.length; i++){
				if(!lista[i].delete())fail("Error al borrar el archivo "+lista[i].getName());
			}
			if(!directorio.delete())fail("Error al borrar el directorio");
			
		}
	}
	
	@Test
	@Ignore
	public void testCrearDirectorio() {
		String nombre = "hola";
		String extension = ".txt";
		FileWriter fichero = null;
		
		//comprobar que no exista
		File dirNew = new File(PATH_FILES_NEW);
		if (dirNew.exists()){
			fail("No deberia existir "+PATH_FILES_NEW);
		}else{
			//creacion directorio
			assertTrue("No se ha creado directorio "+PATH_FILES_NEW,dirNew.mkdir());
		}
		
		try {
			
			//Crear muchos ficheros hola
			for (int i=0;i<10;i++){
				//crea el fichero
				fichero = new FileWriter(PATH_FILES_NEW+"/"+nombre+i+extension);
				//escribe en el fichero
				fichero.write("Contenido del fichero " + nombre+i+extension);
				fichero.close();
			}
			
			//testear que existen los ficheros creados
			File[] lista = dirNew.listFiles();
			for (int i = 0; i < lista.length; i++){
				assertEquals("No encuentro el archivo "+ nombre+i+extension,lista[i].getName(),nombre+i+extension);
			}
			
		} catch (IOException e) {
			fail("Error al escribir en el fichero");
			e.printStackTrace();
		}
		//eliminar los archivos creados
		File[] lista = dirNew.listFiles();
		for (int i = 0; i < lista.length; i++){
			if(!lista[i].delete())fail("Error al borrar el archivo "+lista[i].getName());
		}
		if(!dirNew.delete())fail("Error al borrar el directorio");		
		
		//eliminar directorio
		//assertTrue("No se ha eliminado directorio "+PATH_FILES_NEW,dirNew.delete());
	}
	

	@Test
	@Ignore
	public void testBorrarDirectorio() {
		String ruta = "files/new";
		File directorio = new File(ruta);
		System.out.println("Eliminando archivos");
		File[] lista = directorio.listFiles();
		for (int i = 0; i < lista.length; i++){
			lista[i].delete();
			lista[i].deleteOnExit();
			System.out.println(   lista[i].getName());
		}
	}

	
	@Test 
	@Ignore
	public void testListarDirectorioNORecursivamente(){
	//Queremos listar la carpeta C:\Desarrollo\HTML
		
		final String PATH_APP_HTML = "C:\\Desarrollo\\HTML";
		File app = new File(PATH_APP_HTML);
		if(app.exists()){
			
			for (File f:app.listFiles()){
				System.out.println(f.getName());
				if(f.isDirectory()){
					for(File fHijo:f.listFiles()){
						System.out.println("    "+fHijo.getName());
					}
				}
			}
			
			
		}else{
			fail("No existe "+PATH_APP_HTML);
		}
			
	}
	
	@Test 
	@Ignore
	public void testListarDirectorioRecursivamente(){
	//Queremos listar la carpeta C:\Desarrollo\HTML
		final String PATH_APP_HTML = "C:\\Desarrollo\\HTML";
		File app = new File(PATH_APP_HTML);
		Utilidades.listarDirectorio(app, " ");
	}
	
	@Test
	public void testGuardarPersona () throws IOException, ClassNotFoundException{
		try (ObjectOutputStream fichero = new ObjectOutputStream(new FileOutputStream(PATH_FILES+"test.dat"))){
			Persona p =new Persona();
			p.setApellido("Real");
			p.setNombre("Javi");
			p.setEmail("javi@javi.com");
			try {
				p.setEdad(25);
			} catch (PersonaException e) {
				e.printStackTrace();
				fail("Problema con la edad: " +e.getMessage() );				
			}
			fichero.writeObject(p);
			
			//meto una segunda persona
			p=new Persona();
			p.setApellido("Camacho");
			p.setNombre("Any");
			p.setEmail("any@camacho.com");
			try {
				p.setEdad(29);
			} catch (PersonaException e) {
				e.printStackTrace();
				fail("Problema con la edad: " +e.getMessage() );				
			}
			fichero.writeObject(p);
		};
		
	}

	@Test
	public void testRecuperarPersona () throws IOException, ClassNotFoundException {
		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(PATH_FILES+"test.dat"))){
			Persona p = (Persona) fichero.readObject();
			assertEquals("Falla el nombre",p.getNombre(),"Javi");
			assertEquals("Falla el apellido",p.getApellido(),"Real");
			assertEquals("Falla la edad",p.getEdad(),25);
			assertEquals("Falla el email",p.getEmail(),"javi@javi.com");
			System.out.println(p.getApellido() + " " + p.getNombre() + " " + p.getEmail());
		} /*catch (ClassNotFoundException e) {
			fail("Problema con la clase Persona");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();			
			fail("Problema con el archivo");
		};*/

		try (ObjectInputStream fichero = new ObjectInputStream(new FileInputStream(PATH_FILES+"test.dat"))){
			Persona p = (Persona) fichero.readObject();
			p = (Persona) fichero.readObject();
			assertEquals("Falla el nombre",p.getNombre(),"Any");
			assertEquals("Falla el apellido",p.getApellido(),"Camacho");
			assertEquals("Falla la edad",p.getEdad(),29);
			assertEquals("Falla el email",p.getEmail(),"any@camacho.com");
			System.out.println(p.getApellido() + " " + p.getNombre() + " " + p.getEmail());
		}
	}

}























