package com.ipartek.formacion.holaclase.poo;

import com.ipartek.formacion.holaclase.poo.bean.Persona;

public class HolaMundo {

	
	
	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		//CREAR o INSTANCIAR objeto;sale al ppio error porque hay que importar Persona(desde el fallo o desde Sourde-Organice import)
		//Constructor vacio
		Persona pepe 	  = new Persona();
		
		
		//Constructor con parametros
		Persona persona2 = new Persona( "Frank de la Jungla", 1 );
		System.out.println(persona2.toString() );
		
		
				
		// Tenemos que cogerlos con GET y SET : ENCAPSULAR
		//pepe.nombre = "Peperoni";
		pepe.setNombre("Peperoni");
		
		//pepe.edad	= 3;
		pepe.setEdad(3);
		
		//System.out.println("pepe = " + pepe.nombre + " " + pepe.edad );
		System.out.println( pepe.toString() );
	}
	
}
