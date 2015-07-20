package com.ipartek.formacion.holaclase.poo.bean;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAlumno {
	
	Alumno alumnoVacio;
	Alumno alumnoParametros;
	
	@Before
	public void setUp() throws Exception {
		alumnoVacio = new Alumno();
		alumnoParametros = new Alumno("Ander", 35);
	}

	@After
	public void tearDown() throws Exception {
		alumnoVacio = null;
		alumnoParametros = null;
	}

	
	@Test
	public void testAlumnoVacio() {
		assertEquals("Anonimo", alumnoVacio.getNombre() );
		assertEquals("Sin Determinar", alumnoVacio.getApellido() );
		assertEquals( Persona.EDAD_MINIMA , alumnoVacio.getEdad() );
		assertEquals( "", alumnoVacio.getEmail() );
		
		assertFalse("Esta aprobado", alumnoVacio.isAprobado() );		
		assertTrue(0 == alumnoVacio.getNota());
	}
	
	@Test
	public void testAlumnoParametros() {
		assertEquals("Ander", alumnoParametros.getNombre() );
		assertEquals("Sin Determinar", alumnoParametros.getApellido() );
		assertEquals( 35 , alumnoParametros.getEdad() );
		assertEquals( "", alumnoParametros.getEmail() );
		
		assertFalse("Esta aprobado", alumnoParametros.isAprobado() );		
		assertTrue(0 == alumnoParametros.getNota());
	}
	
	@Test
	public void testSetNota() {
		try {
			alumnoVacio.setNota(-1);
			fail("Tiene que lanzar Excepcion");
		} catch (PersonaException e) {
			assertTrue(Alumno.NOTA_MEDIA == alumnoVacio.getNota());
		}
		
		try {
			alumnoVacio.setNota((float) -0.1);
			fail("Tiene que lanzar Excepcion");
		} catch (PersonaException e) {
			assertTrue(Alumno.NOTA_MEDIA == alumnoVacio.getNota());
		}
		
		try {
			alumnoVacio.setNota((float) 0);
			assertTrue(0 == alumnoVacio.getNota());
		} catch (PersonaException e) {
			fail("Tiene que lanzar Excepcion");
		}
		
		try {
			alumnoVacio.setNota((float) 0.1);
			assertTrue((float) 0.1 == alumnoVacio.getNota());
		} catch (PersonaException e) {
			fail("Tiene que lanzar Excepcion");
		}
		
		try {
			alumnoVacio.setNota((float) 9.9);
			assertTrue((float) 9.9 == alumnoVacio.getNota());
		} catch (PersonaException e) {
			fail("Tiene que lanzar Excepcion");
		}
		
		try {
			alumnoVacio.setNota(10);
			assertTrue(10 == alumnoVacio.getNota());
		} catch (PersonaException e) {
			fail("Tiene que lanzar Excepcion");
		}
		
		try {
			alumnoVacio.setNota((float) 10.1);
			fail("Tiene que lanzar Excepcion");
		} catch (PersonaException e) {
			assertTrue(Alumno.NOTA_MEDIA == alumnoVacio.getNota());
		}
		
		try {
			alumnoVacio.setNota(33);
			fail("Tiene que lanzar Excepcion");
		} catch (PersonaException e) {
			assertTrue(Alumno.NOTA_MEDIA == alumnoVacio.getNota());
		}
		
		
	}

}
