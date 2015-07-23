package com.ipartek.formacion.holaclase.poo.bean;

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

public class TestFicheros {

	static final String PATH_FILES = "files/";
	static final String PATH_FICHERO1 = PATH_FILES + "fichero1.txt";
	static final String PATH_FICHERO2 = PATH_FILES + "fichero2.txt";
	static final String PATH_FICHEROGORDO = PATH_FILES + "fichero_gordo.txt";
	static final String PARRAFO = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc pretium malesuada ante, ac lacinia odio accumsan ut. Etiam cursus sit amet metus ac vulputate. Maecenas finibus lectus id libero semper, dapibus sollicitudin odio dignissim. In malesuada sit amet eros porta consectetur. Aenean sit amet dolor diam. Nam auctor suscipit nulla, sit amet aliquam enim cursus eu. Ut rhoncus, metus quis imperdiet ultrices, odio elit viverra sem, eu efficitur magna risus vel velit. Quisque ornare cursus nisi, et viverra est semper et. Nulla in purus non magna egestas laoreet quis eu ante. Donec mi libero, maximus a lorem in, sollicitudin egestas tortor. Aliquam consequat, risus sed blandit ultrices, diam mauris commodo urna, vitae egestas tortor dui vel nunc. In vitae arcu quis dui maximus luctus sed et eros. Mauris porta magna ac egestas venenatis. Duis tortor justo, placerat non porttitor eget, condimentum vel eros. Pellentesque dapibus at ligula quis interdum.";
	static final String PATH_NEW_DIR = PATH_FILES + "new/";

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
	public void test() {
		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader(PATH_FICHERO1);
			outputStream = new FileWriter(PATH_FICHERO2);

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} catch (FileNotFoundException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en " + PATH_FICHERO2);
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (outputStream != null) {
					outputStream.close();
				}
			} catch (IOException e) {
				fail("Fallo al cerrar los Streams");
				e.printStackTrace();
			}
		}
		File file2 = new File(PATH_FICHERO2);
		assertTrue("No se ha podido eliminar el fichero2", file2.delete());
	}

	@Test
	public void testLeerPrimerChar() {
		FileReader inputStream = null;

		try {
			inputStream = new FileReader(PATH_FICHERO1);

			int c;
			c = inputStream.read();
			assertTrue('L' == ((char) c));

			inputStream.skip(6);
			// for (int i = 0; i < 7; i++) {
			c = inputStream.read();
			// }
			assertTrue('p' == ((char) c));
		} catch (IOException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1);
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
			} catch (IOException e) {
				fail("Fallo al cerrar los Streams");
				e.printStackTrace();
			}
		}
	}

	@Test
	@Ignore
	public void testEscribir() {
		java.io.File fichero = null;
		FileWriter outputStream = null;
		BufferedWriter bfw = null;

		try {
			fichero = new java.io.File(PATH_FICHEROGORDO);
			outputStream = new FileWriter(fichero);
			bfw = new BufferedWriter(outputStream);
			for (int i = 0; i < 1000000; i++) {
				bfw.write(PARRAFO);
			}
		} catch (FileNotFoundException e) {
			fail("No se ha podido abrir el fichero " + PATH_FICHERO1);
			e.printStackTrace();
		} catch (IOException e) {
			fail("No se ha podido escribir en " + PATH_FICHERO2);
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
				fail("Fallo al cerrar los Streams");
				e.printStackTrace();
			}
		}
		if (fichero != null) {
			System.out.println(((fichero.length() / 1024) / 1024) + "Mb");
			assertTrue(fichero.length() > (700 * 1024 * 104));
			assertTrue(fichero.delete());
		} else {
			System.out.println("El fichero no existe");
		}
	}

	@Test
	public void testDirectorio() {

		File directorio = null;
		File fichero = null;
		FileWriter fw = null;
		BufferedWriter bfw = null;

		// crear directorio
		directorio = new File(PATH_NEW_DIR);
		if (!directorio.exists()) {
			assertTrue("No se ha creado el directorio" + PATH_NEW_DIR,
					directorio.mkdir());
		} else {
			fail("No deberia existir" + PATH_NEW_DIR);
		}
		// crear ficheros
		for (int i = 1; i <= 100; i++) {
			try {
				fichero = new File(directorio.getAbsolutePath() + "/hola" + i
						+ ".txt");
				fw = new FileWriter(fichero);
				bfw = new BufferedWriter(fw);
				bfw.write("");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					if (bfw != null) {
						bfw.close();
					}
					if (fw != null) {
						fw.close();
					}
				} catch (IOException e) {
					fail("Fallo al cerrar los Streams");
					e.printStackTrace();
				}
			}
		}

		// Comprobar que existen los ficheros

		for (int i = 1; i <= 100; i++) {
			fichero = new File(directorio.getAbsolutePath() + "/hola" + i
					+ ".txt");
			assertTrue(fichero.exists());
			// System.out.println(fichero.getName() + " existe.");

		}

		// Borrar ficheros
		for (int i = 1; i <= 100; i++) {
			fichero = new File(directorio.getAbsolutePath() + "/hola" + i
					+ ".txt");
			if (fichero.exists()) {
				assertTrue("El fichero " + fichero.getName()
						+ " no ha sido borrado", fichero.delete());
			}

		}

		// Borrar directorio
		if (directorio.exists()) {
			assertTrue("No se ha eliminado el directorio " + PATH_NEW_DIR,
					directorio.delete());
		} else {
			fail("El directorio no existe");
		}
	}
}
