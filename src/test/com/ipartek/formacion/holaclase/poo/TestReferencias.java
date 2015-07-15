package com.ipartek.formacion.holaclase.poo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ipartek.formacion.holaclase.poo.bean.Libro;

public class TestReferencias {

		//Ejemplo variables PRIMITIVAS
	@Test
	public void testPasoParametroPorValor() {
		
		//Todas las variables primitivas se pasan por valor o
		//se pasa una 'COPIA' de la variable
		int x = 0;
		int y = sumar(x);//Me pasa una copia de la variable, 
						// no el parametro en si; ya que es una variable primitiva
		
		assertEquals( 0, x ); 
		assertEquals( 1, y );
		
	}
	
		//Ejemplo con OBJETOS
	@Test
	public void testPasoParametroPorReferencia() {
		//2º,Objeto MOCK objeto para crear pruebas
		Libro libroX = new Libro("mock");
		Libro libroY = null;
		//Al pasar un objeto se pasa el parametro por referencia
		//por lo que si lo modificamos dentro de un metodo el objeto cambia
		libroY = sumar(libroX);
		
		//Comprobamos que los dos tendran una
		assertEquals( 1 , libroX.getNumeroPaginas() );
		assertEquals( 1 , libroY.getNumeroPaginas() );
		
		//Para pasar un objeto como parametro y que no se modifique, podemos 'clonarlo'
		Libro libroZ = new Libro("mock");
		try {
			sumar(libroZ.clone() );
		} catch (CloneNotSupportedException e) { //Si no lo tenemos lo implementamos en el objeto(ctrl+libro)
			fail("No se puede clonar");
			e.printStackTrace();
		} 
		
		assertEquals( 0, libroZ.getNumeroPaginas() );
	}

	//Esta funcion coge el parametro y le suma 1; primero lo suma y luego lo devuelve
	private int sumar( int parametroValor ){
		return ++parametroValor;
	}
	
	//El libro que le pasamos no es la copia del objeto sino la propia referencia al libro
	private Libro sumar ( Libro libro ){
		//1ºEstamos asignando a un libro al referencia de otro
		Libro resul = libro;
		//Setea el numero de paginas, coge las actuales y les suma 1
		libro.setNumeroPaginas( (libro.getNumeroPaginas()+1) );
		
		return resul;
	}
	
}
