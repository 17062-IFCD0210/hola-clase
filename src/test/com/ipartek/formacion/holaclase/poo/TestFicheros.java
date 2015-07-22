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
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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

	// @Test
	// public void testCrearFichero() {
	// FileWriter outputStream = null;
	// BufferedWriter bfw = null;
	// Path fichero = Paths.get(PATH_FICHERO_GORDO);
	// long tamano = 0;
	// try {
	// outputStream = new FileWriter(PATH_FICHERO_GORDO);
	// bfw = new BufferedWriter(outputStream);
	// for (int i = 0; i < 1000000; i++) {
	// bfw.write(PARRAFO);
	// }
	//
	// tamano = Files.size(fichero);
	// assertTrue((700 * 1024 * 1024) < tamano);
	//
	// } catch (FileNotFoundException e) {
	// // TODO Auto-generated catch block
	// fail("No se ha podido abrir el fichero " + PATH_FICHERO_GORDO);
	// e.printStackTrace();
	// } catch (IOException e) {
	// fail("No se ha podido escribir el fichero" + PATH_FICHERO_GORDO);
	// e.printStackTrace();
	// } finally {
	// try {
	// if (bfw != null) {
	// bfw.close();
	// }
	// if (outputStream != null) {
	// outputStream.close();
	// }
	//
	// Files.delete(fichero);
	// } catch (IOException e) {
	// fail("Cerrando los streams");
	// e.printStackTrace();
	// }
	// }
	// }

	@Test
	public void testCrearDirectorio() {
		File directorio = new File(PATH_DIR);
		File hola = null;
		FileWriter outputStream = null;
		BufferedWriter bfw = null;
		if (Files.notExists(Paths.get(PATH_DIR))) {
			directorio.mkdir();
		} else {
			try {
				for (int i = 0; i < 100; i++) {
					hola = new File(directorio.getPath() + "/hola" + (i + 1)
							+ ".txt");
					outputStream = new FileWriter(hola);
					bfw = new BufferedWriter(outputStream);
					bfw.write("");
				}

				for (int i = 0; i < 100; i++) {
					Path path = Paths.get(directorio.getPath() + "/hola"
							+ (i + 1) + ".txt");
					assertTrue(Files.exists(path));
				}

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
	}
}
