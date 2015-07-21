package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAlumno {

	Alumno AlumnoVacio;
	Alumno AlumnoParametros;
	public static final int DESVIACION = 0;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		AlumnoVacio 	 = new Alumno();
		AlumnoParametros = new Alumno("Pepe", 33);
	}

	@After
	public void tearDown() throws Exception {
		AlumnoVacio = null;
		AlumnoParametros = null;
	}

	@Test
	public void testConstructor() {
		assertEquals("Anónimo", AlumnoVacio.getNombre());
		assertEquals(Persona.EDAD_MINIMA, AlumnoVacio.getEdad());
		assertEquals("Sin Determinar", AlumnoVacio.getApellido());
		assertEquals("", AlumnoVacio.getEmail());
		
		//Métodos en Alumno que hereda de Persona
		assertTrue("Está Aprobado", AlumnoVacio.isAprobado());
		assertEquals((float)6.0, AlumnoVacio.getNota(), DESVIACION); //Se pone otro param., la desviación de los decimales (delta)
		
	}

	@Test
	public void testConstructorParametros() {
		assertEquals("Pepe", AlumnoParametros.getNombre());
		assertEquals("Sin Determinar", AlumnoParametros.getApellido());
		assertEquals(33, AlumnoParametros.getEdad());
		assertEquals("", AlumnoParametros.getEmail());
		
		//Métodos en Alumno que hereda de Persona
		assertFalse("No está Aprobado", AlumnoParametros.isAprobado());
		assertEquals((float)4.5, AlumnoParametros.getNota(), DESVIACION); //Se pone otro param., la desviación de los decimales (delta)
	}
	
	
}




