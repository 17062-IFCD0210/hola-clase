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
import java.nio.file.Paths;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Persona;
import com.ipartek.formacion.holaclase.poo.ejemplos.ExcepcionPersona;
import com.ipartek.formacion.holaclase.util.Utilidades;

public class TestFicheros {

	static final String PATH_FILES = "files/";
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	static final String PATH_FICHERO_GORDO = PATH_FILES + "fichero_gordo.txt";
	static final String PATH_DIR = PATH_FILES + "new";

	static final String PARRAFO = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Mauris interdum eros non turpis tincidunt laoreet. In iaculis est sed arcu pharetra vehicula. Vivamus lacinia, sapien et feugiat posuere, libero ipsum fringilla turpis, ac interdum velit lacus in turpis. Donec sed lorem egestas ligula dictum tristique. Praesent quis augue at odio dapibus iaculis. Pellentesque neque tellus, interdum vel convallis id, rutrum in arcu. Nulla ut ligula vestibulum, dictum libero vel, condimentum diam. Vestibulum pharetra tellus tortor, eget bibendum sem fermentum volutpat. Aliquam pretium posuere magna id imperdiet. Pellentesque tincidunt lobortis massa, elementum facilisis sem faucibus sit amet. Proin suscipit quis felis et laoreet. Maecenas posuere non nisl vel scelerisque.";

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
			FileReader imputStream = new FileReader(PATH_FICHERO1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1);
			e.printStackTrace();
		}
	}

	@Test
	public void testCopiar() {

		FileReader imputStream = null;
		FileWriter outputStream = null;

		try {
			imputStream = new FileReader(PATH_FICHERO1);
			outputStream = new FileWriter(PATH_FICHERO2);

			int c;
			while ((c = imputStream.read()) != -1) {
				outputStream.write(c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			fail("No se ha podido copiar el fichero " + PATH_FICHERO1
					+ " al fichero " + PATH_FICHERO2);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en el fichero " + PATH_FICHERO2);
			e.printStackTrace();
		} finally {
			try {
				if (imputStream != null) {
					imputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (Exception e) {
				fail("No se han podido cerrar los ficheros");
				e.printStackTrace();
			}
		}

		File file2 = new File(PATH_FICHERO2);
		assertTrue("No ha borrado el fichero", file2.delete());
	}

	@Test
	public void testLeerPrimerChar() {
		try {
			FileReader imputStream = new FileReader(PATH_FICHERO1);
			int c = imputStream.read();
			assertEquals('L', (char) c);

			// Saltamos 6 caracteres y volvemos a leer
			imputStream.skip(6);
			c = imputStream.read();
			assertEquals('p', (char) c);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1);
			e.printStackTrace();
		}
	}

	@Test
	public void testCrearFichero() {
		File fGordo = null;
		FileWriter outputStream = null;
		BufferedWriter bfw = null;
		try {
			// Creamos fichero
			fGordo = new File(PATH_FICHERO_GORDO);
			// Creamos metodo de escritura
			outputStream = new FileWriter(fGordo);
			// Creamos el buffer, para que tarde menos en escibir
			bfw = new BufferedWriter(outputStream);

			for (int i = 0; i < 1000000; i++) {
				// Escribimos
				bfw.write(PARRAFO);
			}

		} catch (FileNotFoundException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO_GORDO);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir el fichero" + PATH_FICHERO_GORDO);
			e.printStackTrace();
		} finally {
			try {
				if (bfw != null) {
					bfw.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (IOException e) {
				fail("Cerrando los streams");
				e.printStackTrace();
			}
		}

		File fBorrar = null;
		// Comprobar Tamaño
		try {
			fBorrar = new File(PATH_FICHERO_GORDO);
			if (!fGordo.exists()) {
				fail("No existe fichero " + PATH_FICHERO_GORDO);
			}
			assertTrue("No tiene mas de 700Mb",
					fBorrar.length() > 700 * 1024 * 1024);
		} catch (Exception e) {
			e.printStackTrace();
			fail("Comprobando tamano " + PATH_FICHERO_GORDO);
		}

		// Comprobar borrado de fichero
		if (fBorrar != null) {
			assertTrue("No se podido borrar el fichero", fBorrar.delete());
		} else {
			fail("No deberia ser Null");
		}

	}

	@Test
	public void testCrearDirectorio() {
		File directorio = new File(PATH_DIR);
		File hola = null;
		FileWriter outputStream = null;
		BufferedWriter bfw = null;
		if (Files.notExists(Paths.get(PATH_DIR))) {
			directorio.mkdir();
		}

		for (int i = 0; i < 100; i++) {
			try {
				hola = new File(directorio.getPath() + "/hola" + (i + 1)
						+ ".txt");
				outputStream = new FileWriter(hola);
				bfw = new BufferedWriter(outputStream);
				bfw.write("");

				assertTrue("No existen los directorios", hola.exists());
			} catch (IOException e) {
				fail("Error al crearlo");
				e.printStackTrace();
			} finally {
				try {
					if (bfw != null) {
						bfw.close();
					}
					if (outputStream != null) {
						outputStream.close();
					}
				} catch (IOException e) {
					fail("Cerrando los streams");
					e.printStackTrace();
				}
			}
		}

		for (int i = 0; i < 100; i++) {
			hola = new File(directorio.getPath() + "/hola" + (i + 1) + ".txt");

			assertTrue("No borra los ficheros", hola.delete());
		}

		assertTrue("No borra el directorio", directorio.delete());
	}

	@Test
	@Ignore
	// Sirve para que no corra el test
	public void testListarDirectorioRecursivamente() {
		final String PATH_APP_HTML = "C:\\desarrollo\\html";
		File app = new File(PATH_APP_HTML);

		/**
		 * Forma de listar un directorio de forma NO Recursiva
		 */
		/*
		 * if (app.exists()) { for (File f : app.listFiles()) {
		 * System.out.println(f.getName());
		 * 
		 * if (f.isDirectory()) { for (File fHijo : f.listFiles()) {
		 * System.out.println("    " + fHijo.getName()); } } } } else {
		 * fail("No existe fichero " + PATH_APP_HTML); }
		 */

		Utilidades.listarDirectorio(app, "   ");
	}

	@Test
	public void testSerializarFicheros() throws FileNotFoundException,
			IOException, ExcepcionPersona {
		try (ObjectOutputStream out = new ObjectOutputStream(
				new FileOutputStream("files/test.dat"))) {
			Persona per = new Persona("Pepe", 30);
			out.writeObject(per);
		} catch (Exception e) {
			fail("No deberia entrar aqui");
		}
	}

	@Test
	public void testDeserializarFicheros() throws FileNotFoundException,
			IOException, ExcepcionPersona {
		try (ObjectInputStream out = new ObjectInputStream(new FileInputStream(
				"files/test.dat"))) {
			Persona per = (Persona) out.readObject();
			System.out.println(per.toString());
		} catch (Exception e) {
			fail("No deberia entrar aqui");
		}
	}

}
